
package br.com.acaosistemas.amazonwrapped;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AWSECommerceServicePortType", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AWSECommerceServicePortType {


    /**
     * 
     * @param shared
     * @param request
     * @param marketplaceDomain
     * @param operationRequest
     * @param xmlEscaping
     * @param awsAccessKeyId
     * @param associateTag
     * @param items
     * @param validate
     */
    @WebMethod(operationName = "ItemSearch", action = "http://soap.amazon.com/ItemSearch")
    @RequestWrapper(localName = "ItemSearch", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.ItemSearch")
    @ResponseWrapper(localName = "ItemSearchResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.ItemSearchResponse")
    public void itemSearch(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        ItemSearchRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<ItemSearchRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Items", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Items>> items);

    /**
     * 
     * @param shared
     * @param request
     * @param marketplaceDomain
     * @param operationRequest
     * @param xmlEscaping
     * @param awsAccessKeyId
     * @param associateTag
     * @param items
     * @param validate
     */
    @WebMethod(operationName = "ItemLookup", action = "http://soap.amazon.com/ItemLookup")
    @RequestWrapper(localName = "ItemLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.ItemLookup")
    @ResponseWrapper(localName = "ItemLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.ItemLookupResponse")
    public void itemLookup(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        ItemLookupRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<ItemLookupRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Items", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Items>> items);

    /**
     * 
     * @param shared
     * @param request
     * @param marketplaceDomain
     * @param operationRequest
     * @param xmlEscaping
     * @param awsAccessKeyId
     * @param browseNodes
     * @param associateTag
     * @param validate
     */
    @WebMethod(operationName = "BrowseNodeLookup", action = "http://soap.amazon.com/BrowseNodeLookup")
    @RequestWrapper(localName = "BrowseNodeLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.BrowseNodeLookup")
    @ResponseWrapper(localName = "BrowseNodeLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.BrowseNodeLookupResponse")
    public void browseNodeLookup(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        BrowseNodeLookupRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<BrowseNodeLookupRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "BrowseNodes", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<BrowseNodes>> browseNodes);

    /**
     * 
     * @param shared
     * @param request
     * @param marketplaceDomain
     * @param operationRequest
     * @param xmlEscaping
     * @param awsAccessKeyId
     * @param associateTag
     * @param items
     * @param validate
     */
    @WebMethod(operationName = "SimilarityLookup", action = "http://soap.amazon.com/SimilarityLookup")
    @RequestWrapper(localName = "SimilarityLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.SimilarityLookup")
    @ResponseWrapper(localName = "SimilarityLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.SimilarityLookupResponse")
    public void similarityLookup(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        SimilarityLookupRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<SimilarityLookupRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Items", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Items>> items);

    /**
     * 
     * @param shared
     * @param request
     * @param marketplaceDomain
     * @param operationRequest
     * @param xmlEscaping
     * @param awsAccessKeyId
     * @param associateTag
     * @param cart
     * @param validate
     */
    @WebMethod(operationName = "CartGet", action = "http://soap.amazon.com/CartGet")
    @RequestWrapper(localName = "CartGet", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.CartGet")
    @ResponseWrapper(localName = "CartGetResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.CartGetResponse")
    public void cartGet(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        CartGetRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<CartGetRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Cart", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Cart>> cart);

    /**
     * 
     * @param shared
     * @param request
     * @param marketplaceDomain
     * @param operationRequest
     * @param xmlEscaping
     * @param awsAccessKeyId
     * @param associateTag
     * @param cart
     * @param validate
     */
    @WebMethod(operationName = "CartCreate", action = "http://soap.amazon.com/CartCreate")
    @RequestWrapper(localName = "CartCreate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.CartCreate")
    @ResponseWrapper(localName = "CartCreateResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.CartCreateResponse")
    public void cartCreate(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        CartCreateRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<CartCreateRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Cart", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Cart>> cart);

    /**
     * 
     * @param shared
     * @param request
     * @param marketplaceDomain
     * @param operationRequest
     * @param xmlEscaping
     * @param awsAccessKeyId
     * @param associateTag
     * @param cart
     * @param validate
     */
    @WebMethod(operationName = "CartAdd", action = "http://soap.amazon.com/CartAdd")
    @RequestWrapper(localName = "CartAdd", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.CartAdd")
    @ResponseWrapper(localName = "CartAddResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.CartAddResponse")
    public void cartAdd(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        CartAddRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<CartAddRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Cart", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Cart>> cart);

    /**
     * 
     * @param shared
     * @param request
     * @param marketplaceDomain
     * @param operationRequest
     * @param xmlEscaping
     * @param awsAccessKeyId
     * @param associateTag
     * @param cart
     * @param validate
     */
    @WebMethod(operationName = "CartModify", action = "http://soap.amazon.com/CartModify")
    @RequestWrapper(localName = "CartModify", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.CartModify")
    @ResponseWrapper(localName = "CartModifyResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.CartModifyResponse")
    public void cartModify(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        CartModifyRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<CartModifyRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Cart", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Cart>> cart);

    /**
     * 
     * @param shared
     * @param request
     * @param marketplaceDomain
     * @param operationRequest
     * @param xmlEscaping
     * @param awsAccessKeyId
     * @param associateTag
     * @param cart
     * @param validate
     */
    @WebMethod(operationName = "CartClear", action = "http://soap.amazon.com/CartClear")
    @RequestWrapper(localName = "CartClear", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.CartClear")
    @ResponseWrapper(localName = "CartClearResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "br.com.acaosistemas.amazonwrapped.CartClearResponse")
    public void cartClear(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        CartClearRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<CartClearRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Cart", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Cart>> cart);

}
