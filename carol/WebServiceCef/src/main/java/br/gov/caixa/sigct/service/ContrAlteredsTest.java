package br.gov.caixa.sigct.service;

import br.gov.caixa.sigct.client.SOAPException_Exception;

public class ContrAlteredsTest {
	
	public static void main(String[] args) throws SOAPException_Exception {
		
		ConsContrAltereds contractAlter = new ConsContrAltereds();
		
		 String login = "Stefanini_Canais";
	     String password = "715426";
	     String site = "SP";
	     Long contract = 469L;
	     
	     contractAlter.consumesCoAltereds(login, password, site, contract);
	     
	}

}
