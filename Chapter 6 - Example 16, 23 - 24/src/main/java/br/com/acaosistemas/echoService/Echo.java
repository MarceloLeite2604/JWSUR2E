package br.com.acaosistemas.echoService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Echo {

	@WebMethod
	public String echo(String msg){
		return "Echoing: " + msg;
	}
}
