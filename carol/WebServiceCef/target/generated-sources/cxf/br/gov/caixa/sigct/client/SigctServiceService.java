package br.gov.caixa.sigct.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-09-28T09:07:35.882-03:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "SigctServiceService", 
                  wsdlLocation = "http://sigct.caixa.gov.br/SigctService?wsdl",
                  targetNamespace = "http://client.sigct.caixa.gov.br/") 
public class SigctServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://client.sigct.caixa.gov.br/", "SigctServiceService");
    public final static QName SigctServicePort = new QName("http://client.sigct.caixa.gov.br/", "SigctServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://sigct.caixa.gov.br/SigctService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SigctServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://sigct.caixa.gov.br/SigctService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SigctServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SigctServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SigctServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SigctServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SigctServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SigctServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SigctService
     */
    @WebEndpoint(name = "SigctServicePort")
    public SigctService getSigctServicePort() {
        return super.getPort(SigctServicePort, SigctService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SigctService
     */
    @WebEndpoint(name = "SigctServicePort")
    public SigctService getSigctServicePort(WebServiceFeature... features) {
        return super.getPort(SigctServicePort, SigctService.class, features);
    }

}
