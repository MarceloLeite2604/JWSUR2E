package br.com.acaosistemas.dispatchclient;

import java.io.StringReader;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.http.HTTPBinding;

public class DispatchClient {
	private static final String baseUrl = "http://10.0.50.89:8081/adages2/";

	public static void main(String[] args) {
		new DispatchClient().callRestlet();
	}

	private void callRestlet() {
		QName qname = getQName("uri", "restlet"); // service's name
		Service service = Service.create(qname);
		runTests(service);
	}

	private void runTests(Service service) {
		
		/*
		 * Marcelo Leite - Durante os testes, os seguintes resultados retornaram nulo:
		 * "Result (plaintext)"
		 * "Result (json)"
		 * "Result (delete"
		 * "Result (post)"
		 * Muito provavelmente porque, similar ao problema com o método "create"
		 * (ver abaixo) o resultado recebido do servidor não seja XML, portanto a
		 * classe "Dispatch" não compreende o seu conteúdo.
		 */
		
		// get all -- plain text
		Dispatch<Source> dispatch = getDispatch(service, getQName("get", "All"), baseUrl);
		setRequestMethod(dispatch, "GET");
		Source result = dispatch.invoke(null);
		stringifyAndPrintResponse("Result (plaintext):", result);

		// get all -- xml
		dispatch = getDispatch(service, getQName("get", "AllXml"), baseUrl + "xml");
		setRequestMethod(dispatch, "GET");
		result = dispatch.invoke(null);
		stringifyAndPrintResponse("Result (xml):", result);

		// get all -- json
		dispatch = getDispatch(service, getQName("get", "AllJson"), baseUrl + "json");
		setRequestMethod(dispatch, "GET");
		result = dispatch.invoke(null);
		stringifyAndPrintResponse("Result (json):", result);

		// get one -- xml
		dispatch = getDispatch(service, getQName("get", "OneXml"), baseUrl + "xml/2");
		setRequestMethod(dispatch, "GET");
		result = dispatch.invoke(null);
		stringifyAndPrintResponse("Result (one--xml):", result);

		// delete
		dispatch = getDispatch(service, getQName("delete", "One"), baseUrl + "delete/3");
		setRequestMethod(dispatch, "DELETE");
		result = dispatch.invoke(null);
		stringifyAndPrintResponse("Result (delete):", result);

		// post -- failure
		/*
		 * Marcelo Leite - A falha irá ocorrer porque, para que o conteúdo de
		 * "cargo" seja aceito pelo método "invoke" de "dispatch", ele deve ser
		 * um XML. Com isto, o conteúdo a ser encaminhado para o servidor também
		 * será este XML. No lado do servidor, o serviço está aguradando o
		 * conteúdo de texto e não o XML encaminhado. O resultado disto será uma
		 * falha na execução da operação.
		 */
		dispatch = getDispatch(service, getQName("post", "Create"), baseUrl + "create");
		setRequestMethod(dispatch, "POST");
		String cargo = "<a>words=This test will not work!</a>"; // minimal XML
		StringReader reader = new StringReader(cargo);
		result = dispatch.invoke(new StreamSource(reader));
		stringifyAndPrintResponse("Result (post):", result);
	}

	private Dispatch<Source> getDispatch(Service service, QName portName, String url) {
		service.addPort(portName, HTTPBinding.HTTP_BINDING, url);
		return service.createDispatch(portName, Source.class, javax.xml.ws.Service.Mode.MESSAGE);
	}

	private void setRequestMethod(Dispatch<Source> dispatcher, String method) {
		Map<String, Object> rc = dispatcher.getRequestContext();
		rc.put(MessageContext.HTTP_REQUEST_METHOD, method);
	}

	private QName getQName(String ns, String ln) {
		return new QName(ns, ln);
	}

	private void stringifyAndPrintResponse(String msg, Source result) {
		String str = null;
		if (result instanceof StreamSource) {
			try {
				StreamSource source = (StreamSource) result;
				byte[] buff = new byte[1024]; // adages are short
				source.getInputStream().read(buff);
				str = new String(buff);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		System.out.println("\n" + msg + "\n" + str);
	}
}