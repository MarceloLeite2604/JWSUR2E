package br.com.acaosistemas.helloclient;

import javax.xml.ws.BindingProvider;

public class AxisClient {
	public static void main(String[] args) {
		final String endpoint = "http://10.0.50.89:8080/axis2/services/HelloService";

		HelloServicePortType port = new HelloService().getHelloServiceHttpSoap11Endpoint();

		// Override the endpoint in the wsimport-derived classes.
		BindingProvider bp = (BindingProvider) port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
		System.out.println(port.echo(null));
		System.out.println(port.echo("Fred"));
	}
}
