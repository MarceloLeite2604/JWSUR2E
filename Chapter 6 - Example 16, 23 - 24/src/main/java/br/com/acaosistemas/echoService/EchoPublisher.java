package br.com.acaosistemas.echoService;

import java.util.LinkedList;
import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.Endpoint;
import javax.xml.ws.handler.Handler;

public class EchoPublisher {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Endpoint endpoint = Endpoint.create(new Echo());
		Binding binding = endpoint.getBinding();
		List<Handler> hchain = new LinkedList<Handler>();
		hchain.add(new ServiceHandler());
		binding.setHandlerChain(hchain);
		endpoint.publish("http://10.0.50.89:9876/echo");
		System.out.println("http://10.0.50.89:9876/echo");
	}
}
