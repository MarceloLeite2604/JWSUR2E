
package br.com.acaosistemas.predictionsejbclient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PredictionEJB", targetNamespace = "http://predictionsejb.acaosistemas.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PredictionEJB {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://predictionsejb.acaosistemas.com.br/", className = "br.com.acaosistemas.predictionsejbclient.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://predictionsejb.acaosistemas.com.br/", className = "br.com.acaosistemas.predictionsejbclient.DeleteResponse")
    @Action(input = "http://predictionsejb.acaosistemas.com.br/PredictionEJB/deleteRequest", output = "http://predictionsejb.acaosistemas.com.br/PredictionEJB/deleteResponse")
    public String delete(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns br.com.acaosistemas.predictionsejbclient.Prediction
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "create", targetNamespace = "http://predictionsejb.acaosistemas.com.br/", className = "br.com.acaosistemas.predictionsejbclient.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://predictionsejb.acaosistemas.com.br/", className = "br.com.acaosistemas.predictionsejbclient.CreateResponse")
    @Action(input = "http://predictionsejb.acaosistemas.com.br/PredictionEJB/createRequest", output = "http://predictionsejb.acaosistemas.com.br/PredictionEJB/createResponse")
    public Prediction create(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<br.com.acaosistemas.predictionsejbclient.Prediction>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://predictionsejb.acaosistemas.com.br/", className = "br.com.acaosistemas.predictionsejbclient.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://predictionsejb.acaosistemas.com.br/", className = "br.com.acaosistemas.predictionsejbclient.GetAllResponse")
    @Action(input = "http://predictionsejb.acaosistemas.com.br/PredictionEJB/getAllRequest", output = "http://predictionsejb.acaosistemas.com.br/PredictionEJB/getAllResponse")
    public List<Prediction> getAll();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns br.com.acaosistemas.predictionsejbclient.Prediction
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "edit", targetNamespace = "http://predictionsejb.acaosistemas.com.br/", className = "br.com.acaosistemas.predictionsejbclient.Edit")
    @ResponseWrapper(localName = "editResponse", targetNamespace = "http://predictionsejb.acaosistemas.com.br/", className = "br.com.acaosistemas.predictionsejbclient.EditResponse")
    @Action(input = "http://predictionsejb.acaosistemas.com.br/PredictionEJB/editRequest", output = "http://predictionsejb.acaosistemas.com.br/PredictionEJB/editResponse")
    public Prediction edit(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns br.com.acaosistemas.predictionsejbclient.Prediction
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOne", targetNamespace = "http://predictionsejb.acaosistemas.com.br/", className = "br.com.acaosistemas.predictionsejbclient.GetOne")
    @ResponseWrapper(localName = "getOneResponse", targetNamespace = "http://predictionsejb.acaosistemas.com.br/", className = "br.com.acaosistemas.predictionsejbclient.GetOneResponse")
    @Action(input = "http://predictionsejb.acaosistemas.com.br/PredictionEJB/getOneRequest", output = "http://predictionsejb.acaosistemas.com.br/PredictionEJB/getOneResponse")
    public Prediction getOne(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
