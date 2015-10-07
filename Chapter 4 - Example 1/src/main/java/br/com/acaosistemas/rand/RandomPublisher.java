package br.com.acaosistemas.rand;

import javax.xml.ws.Endpoint;

public class RandomPublisher {
	public static void main(String[] args) {
		final String url = "http://10.0.50.89:8888/rs";
		System.out.println("Publishing RandService at endpoint " + url);
		Endpoint.publish(url, new RandService());
	}
}
