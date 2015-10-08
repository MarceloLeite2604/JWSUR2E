
package br.com.acaosistemas.temperatureconverterclient2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TempConvertService", targetNamespace = "http://temperatureconverter.acaosistemas.com.br/", wsdlLocation = "file:/D:/temp/A\u00e7\u00e3o/Pesquisas/Java%20Web%20Services%20Up%20And%20Running%202nd%20Edition/temperatureconverter/TempConvertService.wsdl")
public class TempConvertService
    extends Service
{

    private final static URL TEMPCONVERTSERVICE_WSDL_LOCATION;
    private final static WebServiceException TEMPCONVERTSERVICE_EXCEPTION;
    private final static QName TEMPCONVERTSERVICE_QNAME = new QName("http://temperatureconverter.acaosistemas.com.br/", "TempConvertService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/temp/A\u00e7\u00e3o/Pesquisas/Java%20Web%20Services%20Up%20And%20Running%202nd%20Edition/temperatureconverter/TempConvertService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEMPCONVERTSERVICE_WSDL_LOCATION = url;
        TEMPCONVERTSERVICE_EXCEPTION = e;
    }

    public TempConvertService() {
        super(__getWsdlLocation(), TEMPCONVERTSERVICE_QNAME);
    }

    public TempConvertService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEMPCONVERTSERVICE_QNAME, features);
    }

    public TempConvertService(URL wsdlLocation) {
        super(wsdlLocation, TEMPCONVERTSERVICE_QNAME);
    }

    public TempConvertService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEMPCONVERTSERVICE_QNAME, features);
    }

    public TempConvertService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TempConvertService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TempConvert
     */
    @WebEndpoint(name = "TempConvertPort")
    public TempConvert getTempConvertPort() {
        return super.getPort(new QName("http://temperatureconverter.acaosistemas.com.br/", "TempConvertPort"), TempConvert.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TempConvert
     */
    @WebEndpoint(name = "TempConvertPort")
    public TempConvert getTempConvertPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://temperatureconverter.acaosistemas.com.br/", "TempConvertPort"), TempConvert.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEMPCONVERTSERVICE_EXCEPTION!= null) {
            throw TEMPCONVERTSERVICE_EXCEPTION;
        }
        return TEMPCONVERTSERVICE_WSDL_LOCATION;
    }

}
