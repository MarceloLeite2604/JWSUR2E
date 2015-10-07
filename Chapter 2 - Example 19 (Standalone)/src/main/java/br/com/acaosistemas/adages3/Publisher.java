package br.com.acaosistemas.adages3;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[ ] args) {
	int port = 9876;
	String url = "http://10.0.50.89:" + port + "/";
	System.out.println("Restfully publishing on port " + port);
	Endpoint.publish(url, new AdagesProvider());
    }
}
