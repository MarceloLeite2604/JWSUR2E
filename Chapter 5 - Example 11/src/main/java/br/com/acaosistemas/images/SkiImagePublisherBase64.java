package br.com.acaosistemas.images;

import javax.xml.ws.Endpoint;

public class SkiImagePublisherBase64 {
	public static void main(String[] args) {
		String url = "http://10.0.50.89:9876/ski";
		System.out.println("Base64 implementation.");
		System.out.println(url);
		Endpoint.publish(url, new SkiImageService());
	}
}