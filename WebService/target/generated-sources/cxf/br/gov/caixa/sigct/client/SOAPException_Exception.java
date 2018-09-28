
package br.gov.caixa.sigct.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-09-28T16:29:36.481-03:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "SOAPException", targetNamespace = "http://client.sigct.caixa.gov.br/")
public class SOAPException_Exception extends Exception {
    
    private br.gov.caixa.sigct.client.SOAPException soapException;

    public SOAPException_Exception() {
        super();
    }
    
    public SOAPException_Exception(String message) {
        super(message);
    }
    
    public SOAPException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public SOAPException_Exception(String message, br.gov.caixa.sigct.client.SOAPException soapException) {
        super(message);
        this.soapException = soapException;
    }

    public SOAPException_Exception(String message, br.gov.caixa.sigct.client.SOAPException soapException, Throwable cause) {
        super(message, cause);
        this.soapException = soapException;
    }

    public br.gov.caixa.sigct.client.SOAPException getFaultInfo() {
        return this.soapException;
    }
}
