package br.com.acaosistemas.predictionsejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@WebService
public class PredictionEJB {
	@PersistenceContext(name = "predictionsDB")
	private EntityManager em;

	@WebMethod
	public Prediction create(String who, String what) {
		// integrity checks
		if (who == null || what == null)
			return null;
		if (who.length() < 1 || what.length() < 1)
			return null;

		Prediction prediction = new Prediction();
		prediction.setWho(who);
		prediction.setWhat(what);

		try {
			em.persist(prediction);
		} catch (Exception e) {
			throw new RuntimeException("create:persist -- " + e);
		}
		return prediction;
	}

	@WebMethod
	public Prediction edit(int id, String who, String what) {
		// integrity checks
		if (id < 1 || who == null || what == null)
			return null;
		if (who.length() < 1 || what.length() < 1)
			return null;
		Prediction prediction = em.find(Prediction.class, id);
		if (prediction == null)
			return null;

		prediction.setWho(who);
		prediction.setWhat(what);
		return prediction;
	}

	@WebMethod
	public String delete(int id) {
		// integrity checks
		String msg = "Could not remove prediction with ID " + id;
		if (id < 1)
			return msg;
		Prediction prediction = em.find(Prediction.class, id);
		if (prediction == null)
			return msg;

		em.remove(prediction); // delete from database
		return prediction.toString() + " -- deleted";
	}

	@WebMethod
	public Prediction getOne(int id) {
		// integrity checks
		if (id < 1)
			return null;
		Prediction prediction = em.find(Prediction.class, id);
		if (prediction == null)
			return null;

		return prediction;
	}

	@SuppressWarnings("unchecked")
	@WebMethod
	public List<Prediction> getAll() {
		// Marcelo Leite - A linha abaixo está diferente do exemplo apresentado no livro.
		List<Prediction> predList = em.createNamedQuery("pred.list").getResultList();
		return predList;
	}
}
