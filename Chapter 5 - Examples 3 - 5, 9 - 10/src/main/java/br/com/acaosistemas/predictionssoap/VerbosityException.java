package br.com.acaosistemas.predictionssoap;

import javax.xml.ws.WebFault;

@WebFault
public class VerbosityException extends Exception {

	private static final long serialVersionUID = 168935966981239089L;
	private String details;

	public VerbosityException(String reason, String details) {
		super(reason);
		this.details = details;
	}

	public String getFaultInfo() {
		return this.details;
	}

}
