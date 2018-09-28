
package br.gov.caixa.sigct.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-09-28T16:29:36.466-03:00
 * Generated source version: 2.7.0
 * 
 */
public final class SigctService_SigctServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://client.sigct.caixa.gov.br/", "SigctServiceService");

    private SigctService_SigctServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SigctServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SigctServiceService ss = new SigctServiceService(wsdlURL, SERVICE_NAME);
        SigctService port = ss.getSigctServicePort();  
        
        {
        System.out.println("Invoking getTermosAlterados...");
        java.lang.String _getTermosAlterados_login = "";
        java.lang.String _getTermosAlterados_senha = "";
        java.lang.Long _getTermosAlterados_contrato = null;
        java.lang.String _getTermosAlterados_site = "";
        try {
            java.util.List<br.gov.caixa.sigct.client.TermosView> _getTermosAlterados__return = port.getTermosAlterados(_getTermosAlterados_login, _getTermosAlterados_senha, _getTermosAlterados_contrato, _getTermosAlterados_site);
            System.out.println("getTermosAlterados.result=" + _getTermosAlterados__return);

        } catch (SOAPException_Exception e) { 
            System.out.println("Expected exception: SOAPException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getContratacoesAlteradas...");
        java.lang.String _getContratacoesAlteradas_login = "";
        java.lang.String _getContratacoesAlteradas_senha = "";
        java.lang.Long _getContratacoesAlteradas_contrato = null;
        java.lang.String _getContratacoesAlteradas_site = "";
        try {
            java.util.List<br.gov.caixa.sigct.client.ContratacoesView> _getContratacoesAlteradas__return = port.getContratacoesAlteradas(_getContratacoesAlteradas_login, _getContratacoesAlteradas_senha, _getContratacoesAlteradas_contrato, _getContratacoesAlteradas_site);
            System.out.println("getContratacoesAlteradas.result=" + _getContratacoesAlteradas__return);

        } catch (SOAPException_Exception e) { 
            System.out.println("Expected exception: SOAPException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getContratacoes...");
        java.lang.String _getContratacoes_login = "";
        java.lang.String _getContratacoes_senha = "";
        java.lang.Long _getContratacoes_contrato = null;
        java.lang.String _getContratacoes_site = "";
        java.lang.Integer _getContratacoes_pagina = null;
        try {
            java.util.List<br.gov.caixa.sigct.client.ContratacoesView> _getContratacoes__return = port.getContratacoes(_getContratacoes_login, _getContratacoes_senha, _getContratacoes_contrato, _getContratacoes_site, _getContratacoes_pagina);
            System.out.println("getContratacoes.result=" + _getContratacoes__return);

        } catch (SOAPException_Exception e) { 
            System.out.println("Expected exception: SOAPException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getContratacoesFaturamentoAtual...");
        java.lang.String _getContratacoesFaturamentoAtual_login = "";
        java.lang.String _getContratacoesFaturamentoAtual_senha = "";
        java.lang.Long _getContratacoesFaturamentoAtual_contrato = null;
        java.lang.String _getContratacoesFaturamentoAtual_site = "";
        try {
            java.util.List<br.gov.caixa.sigct.client.ContratacoesView> _getContratacoesFaturamentoAtual__return = port.getContratacoesFaturamentoAtual(_getContratacoesFaturamentoAtual_login, _getContratacoesFaturamentoAtual_senha, _getContratacoesFaturamentoAtual_contrato, _getContratacoesFaturamentoAtual_site);
            System.out.println("getContratacoesFaturamentoAtual.result=" + _getContratacoesFaturamentoAtual__return);

        } catch (SOAPException_Exception e) { 
            System.out.println("Expected exception: SOAPException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getTermos...");
        java.lang.String _getTermos_login = "";
        java.lang.String _getTermos_senha = "";
        java.lang.Long _getTermos_contrato = null;
        java.lang.String _getTermos_site = "";
        java.lang.String _getTermos_fatura = "";
        try {
            java.util.List<br.gov.caixa.sigct.client.TermosView> _getTermos__return = port.getTermos(_getTermos_login, _getTermos_senha, _getTermos_contrato, _getTermos_site, _getTermos_fatura);
            System.out.println("getTermos.result=" + _getTermos__return);

        } catch (SOAPException_Exception e) { 
            System.out.println("Expected exception: SOAPException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
