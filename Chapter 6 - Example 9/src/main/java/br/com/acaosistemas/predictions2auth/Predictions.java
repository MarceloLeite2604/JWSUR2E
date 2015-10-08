package br.com.acaosistemas.predictions2auth;


import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletContext;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;

public class Predictions {

	private ConcurrentMap<Integer, Prediction> predictions;
	private ServletContext servletContext;
	private AtomicInteger mapKey;

	public Predictions() {
		predictions = new ConcurrentHashMap<Integer, Prediction>();
		mapKey = new AtomicInteger();
	}

	public ServletContext getServletContext() {
		return servletContext;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	public void setPredictions(ConcurrentMap<Integer, Prediction> predictions) {
		// this.predictions = predictions;
	}

	public ConcurrentMap<Integer, Prediction> getPredictions() {
		if (getServletContext() == null)
			return null;
		if (predictions.size() < 1)
			populate();
		return this.predictions;
	}

	public String toXML(Object object) {
		String xml = null;
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			XMLEncoder encoder = new XMLEncoder(out);
			encoder.writeObject(object); // serialize to XML
			encoder.close();
			xml = out.toString();
		} catch (Exception exception) {
		}
		return xml;
	}

	public int addPrediction(Prediction prediction) {
		int id = mapKey.incrementAndGet();
		prediction.setId(id);
		predictions.put(id, prediction);
		return id;
	}

	private void populate() {
		String filename = "/WEB-INF/data/predictions.db";
		InputStream in = servletContext.getResourceAsStream(filename);

		// Read the data into the array of Predictions.
		if (in != null) {
			try {
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader reader = new BufferedReader(isr);

				String record = null;
				while ((record = reader.readLine()) != null) {
					String[] parts = record.split("!");
					Prediction prediction = new Prediction();
					prediction.setWho(parts[0]);
					prediction.setWhat(parts[1]);
					addPrediction(prediction);
				}
			} catch (IOException excecao) {
			}
		}
	}

}
