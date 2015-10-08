
package br.com.acaosistemas.temperatureconverterclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de f2c complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="f2c">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "f2c", propOrder = {
    "arg0"
})
public class F2C {

    protected float arg0;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     */
    public float getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     */
    public void setArg0(float value) {
        this.arg0 = value;
    }

}
