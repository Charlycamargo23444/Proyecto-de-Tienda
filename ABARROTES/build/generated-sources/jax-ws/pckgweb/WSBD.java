
package pckgweb;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSBD", targetNamespace = "http://pckgWEB/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSBD {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://pckgWEB/", className = "pckgweb.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://pckgWEB/", className = "pckgweb.HelloResponse")
    @Action(input = "http://pckgWEB/WSBD/helloRequest", output = "http://pckgWEB/WSBD/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    public String btneliminarproductos(String tabla, String datos);

    public String altas(String tabla, String datos);

    public String eliminar(String tabla, String datos);

    public String modificar(String tabla, String datos);

}
