package br.com.acaosistemas.imageclientmtom;

import java.util.List;

import javax.activation.DataHandler;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.SOAPBinding;

public class SkiImageClient {
	public static void main(String[] args) {
		SkiImageService port = new SkiImageServiceService().getSkiImageServicePort();
		DataHandler image = port.getImage("nordic");
		dump(image);
		List<DataHandler> images = port.getImages();
		for (DataHandler dh : images)
			dump(dh);

		/*
		 * Para fins de conhecimento, caso seja necessário que o cliente
		 * encaminhe um conteúdo para o servidor através do método MTOM, a
		 * configuração abaixo é necessária:
		 */
		
		BindingProvider bp = (BindingProvider)port;
		SOAPBinding binding = (SOAPBinding)bp.getBinding();
		binding.setMTOMEnabled(true);
	}

	private static void dump(DataHandler dh) {
		try {
			System.out.println("MIME type: " + dh.getContentType());
			System.out.println("Content:   " + dh.getContent());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
