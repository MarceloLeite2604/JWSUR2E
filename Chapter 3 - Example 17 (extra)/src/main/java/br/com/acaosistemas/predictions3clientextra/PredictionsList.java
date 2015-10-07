
package br.com.acaosistemas.predictions3clientextra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de predictionsList complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="predictionsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predictions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="predictions" type="{}prediction" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "predictionsList", propOrder = {
    "predictions"
})
public class PredictionsList {

    protected PredictionsList.Predictions predictions;

    /**
     * Obtém o valor da propriedade predictions.
     * 
     * @return
     *     possible object is
     *     {@link PredictionsList.Predictions }
     *     
     */
    public PredictionsList.Predictions getPredictions() {
        return predictions;
    }

    /**
     * Define o valor da propriedade predictions.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictionsList.Predictions }
     *     
     */
    public void setPredictions(PredictionsList.Predictions value) {
        this.predictions = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="predictions" type="{}prediction" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "predictions"
    })
    public static class Predictions {

        protected List<Prediction> predictions;

        /**
         * Gets the value of the predictions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the predictions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPredictions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Prediction }
         * 
         * 
         */
        public List<Prediction> getPredictions() {
            if (predictions == null) {
                predictions = new ArrayList<Prediction>();
            }
            return this.predictions;
        }

    }

}
