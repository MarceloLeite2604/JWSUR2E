package br.com.acaosistemas.rand2;

import javax.xml.ws.Endpoint;

public class RandomPublisher {
	public static void main(String[] args) {
		final String url = "http://10.0.50.89:8888/rs";
		System.out.println("Publishing RandImpl at endpoint " + url);
		Endpoint.publish(url, new RandImpl());
	}
}
