package br.gov.caixa.sigct.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import br.gov.caixa.sigct.client.SOAPException_Exception;
import br.gov.caixa.sigct.client.SigctService;
import br.gov.caixa.sigct.client.SigctServiceService;

public class ConsumesFatAtualTest {	
	
	private final static Logger LOGGER = Logger.getLogger(ConsumesFatAtualTest.class.getName());
	

	public static void main(String[] args) throws SOAPException_Exception {
		       	
	        ConsumesFatAtual object = new ConsumesFatAtual();	
	        String login = "Stefanini_Canais";
	        String password = "715426";
	        String site = "SP";
	        Long contract = 469L;
	        String invoice = "Setembro/2018";	        
	        LOGGER.log(Level.INFO, "Chamando os métodos");
	        
	        if(!invoice.contains("/")) {
	        	System.out.println("O parametro invoice deve estar no formato MesString/XXXX");	        	
	       }            
	        
	        object.consumesFatAtual(login, password, site, contract, invoice);	   
	       
	} 
}
