
package Integracion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IWSDerechosAutor", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IWSDerechosAutor {


    /**
     * 
     * @param id
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "ConsultarFotoHabilitada", action = "http://tempuri.org/IWSDerechosAutor/ConsultarFotoHabilitada")
    @WebResult(name = "ConsultarFotoHabilitadaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultarFotoHabilitada", targetNamespace = "http://tempuri.org/", className = "Integracion.ConsultarFotoHabilitada")
    @ResponseWrapper(localName = "ConsultarFotoHabilitadaResponse", targetNamespace = "http://tempuri.org/", className = "Integracion.ConsultarFotoHabilitadaResponse")
    public Boolean consultarFotoHabilitada(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

}
