package br.com.acaosistemas.echo;

import javax.xml.ws.Endpoint;

public class EchoPublisher {
	public static void main(String[] args) {
		String url = "http://10.0.50.89:9876/echo";
		System.out.println(url);
		Endpoint.publish(url, new Echo());
	}
}
