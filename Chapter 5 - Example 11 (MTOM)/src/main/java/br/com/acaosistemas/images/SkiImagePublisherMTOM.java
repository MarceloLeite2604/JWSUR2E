package br.com.acaosistemas.images;

import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;

public class SkiImagePublisherMTOM {

	private Endpoint endpoint;

	public static void main(String[] args) {
		SkiImagePublisherMTOM me = new SkiImagePublisherMTOM();
		me.createEndpoint();
		me.configureEndpoint();
		me.publish();
	}

	private void createEndpoint() {
		endpoint = Endpoint.create(new SkiImageService());
	}
	
	private void configureEndpoint() {
		SOAPBinding binding = (SOAPBinding)endpoint.getBinding();
		binding.setMTOMEnabled(true);
	}
	
	private void publish(){
		int port = 9876;
		String url = "http://10.0.50.89:" + port + "/ski";
		endpoint.publish(url);
		System.out.println("MTOM implementation.");
		System.out.println(url);
	}
}
