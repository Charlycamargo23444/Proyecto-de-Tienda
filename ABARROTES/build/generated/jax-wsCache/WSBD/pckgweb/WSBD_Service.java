
package pckgweb;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSBD", targetNamespace = "http://pckgWEB/", wsdlLocation = "http://localhost:8080/WebAppTIENDA/WSBD?WSDL")
public class WSBD_Service
    extends Service
{

    private final static URL WSBD_WSDL_LOCATION;
    private final static WebServiceException WSBD_EXCEPTION;
    private final static QName WSBD_QNAME = new QName("http://pckgWEB/", "WSBD");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebAppTIENDA/WSBD?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSBD_WSDL_LOCATION = url;
        WSBD_EXCEPTION = e;
    }

    public WSBD_Service() {
        super(__getWsdlLocation(), WSBD_QNAME);
    }

    public WSBD_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSBD_QNAME, features);
    }

    public WSBD_Service(URL wsdlLocation) {
        super(wsdlLocation, WSBD_QNAME);
    }

    public WSBD_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSBD_QNAME, features);
    }

    public WSBD_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSBD_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSBD
     */
    @WebEndpoint(name = "WSBDPort")
    public WSBD getWSBDPort() {
        return super.getPort(new QName("http://pckgWEB/", "WSBDPort"), WSBD.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSBD
     */
    @WebEndpoint(name = "WSBDPort")
    public WSBD getWSBDPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pckgWEB/", "WSBDPort"), WSBD.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSBD_EXCEPTION!= null) {
            throw WSBD_EXCEPTION;
        }
        return WSBD_WSDL_LOCATION;
    }

}
