
package Integrador;

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
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioIF", targetNamespace = "http://servicios/", wsdlLocation = "http://10.39.1.99:8080/NegocioIF/ServicioIF?WSDL")
public class ServicioIF_Service
    extends Service
{

    private final static URL SERVICIOIF_WSDL_LOCATION;
    private final static WebServiceException SERVICIOIF_EXCEPTION;
    private final static QName SERVICIOIF_QNAME = new QName("http://servicios/", "ServicioIF");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.39.1.99:8080/NegocioIF/ServicioIF?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOIF_WSDL_LOCATION = url;
        SERVICIOIF_EXCEPTION = e;
    }

    public ServicioIF_Service() {
        super(__getWsdlLocation(), SERVICIOIF_QNAME);
    }

    public ServicioIF_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOIF_QNAME, features);
    }

    public ServicioIF_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOIF_QNAME);
    }

    public ServicioIF_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOIF_QNAME, features);
    }

    public ServicioIF_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioIF_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioIF
     */
    @WebEndpoint(name = "ServicioIFPort")
    public ServicioIF getServicioIFPort() {
        return super.getPort(new QName("http://servicios/", "ServicioIFPort"), ServicioIF.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioIF
     */
    @WebEndpoint(name = "ServicioIFPort")
    public ServicioIF getServicioIFPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicios/", "ServicioIFPort"), ServicioIF.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOIF_EXCEPTION!= null) {
            throw SERVICIOIF_EXCEPTION;
        }
        return SERVICIOIF_WSDL_LOCATION;
    }

}
