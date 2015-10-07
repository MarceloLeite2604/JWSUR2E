
package br.com.acaosistemas.predictions3clientextra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.acaosistemas.predictions3clientextra package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Prediction_QNAME = new QName("", "prediction");
    private final static QName _PredictionsList_QNAME = new QName("", "predictionsList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.acaosistemas.predictions3clientextra
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PredictionsList }
     * 
     */
    public PredictionsList createPredictionsList() {
        return new PredictionsList();
    }

    /**
     * Create an instance of {@link Prediction }
     * 
     */
    public Prediction createPrediction() {
        return new Prediction();
    }

    /**
     * Create an instance of {@link PredictionsList.Predictions }
     * 
     */
    public PredictionsList.Predictions createPredictionsListPredictions() {
        return new PredictionsList.Predictions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prediction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "prediction")
    public JAXBElement<Prediction> createPrediction(Prediction value) {
        return new JAXBElement<Prediction>(_Prediction_QNAME, Prediction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredictionsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "predictionsList")
    public JAXBElement<PredictionsList> createPredictionsList(PredictionsList value) {
        return new JAXBElement<PredictionsList>(_PredictionsList_QNAME, PredictionsList.class, null, value);
    }

}
