package br.com.acaosistemas.predictions3clientextra;

public class Predictions3ClientExtra {
	public static void main(String[] args) {
		new Predictions3ClientExtra().demo();
	}

	private void demo() {
		// Get a reference to the Localhost_Predictions3ResourcesP.Root defined
		// inside Localhost_Predictions3ResourcesP, as the "root" provides
		// access
		// to other classes, which in turn support the CRUD functionalities.
		Localhost_Predictions3ResourcesP.Root root = Localhost_Predictions3ResourcesP.root();

		// The xmlGetter can make GET requests against the service.
		Localhost_Predictions3ResourcesP.Root.Xml xmlGetter = root.xml();
		PredictionsList predictionsList = xmlGetter.getAsXml(PredictionsList.class); // String
																						// is
																						// return
																						// type
		PredictionsList.Predictions predictions = predictionsList.getPredictions();
		for (Prediction prediction : predictions.getPredictions()) {
			System.out.println(prediction.id + " - " + prediction.who + ": " + prediction.what);
		}
	}
}