package br.com.acaosistemas.predictionsejb;

import java.io.Serializable;

import javax.persistence.NamedQuery;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;

@Entity
@NamedQueries({ @NamedQuery(name = "pred.list", query = "select p from Prediction p") })
public class Prediction implements Serializable {
	
	private static final long serialVersionUID = -6881281939820960702L;
	
	@Column(name = "predictor", nullable = false, length = 64)
	private String who; // person
	private String what; // his/her prediction
	
	@Id
	@GeneratedValue
	private int id; // identifier used as lookup key

	public Prediction(){};

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	public String getWhat() {
		return what;
	}

	public void setWhat(String what) {
		this.what = what;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
