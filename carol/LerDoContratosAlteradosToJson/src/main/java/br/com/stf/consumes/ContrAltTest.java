package br.com.stf.consumes;

import br.gov.caixa.sigct.client.SOAPException_Exception;

public class ContrAltTest {
	
	public static void main(String[] args) throws SOAPException_Exception {
		
		ConsContrAlt contractAlter = new ConsContrAlt();
		
		 String login = "Stefanini_Canais";
	     String password = "715426";
	     String site = "SP";
	     Long contract = 469L;
	     
	     String value = new String();
	     
	     value = contractAlter.consumesCoAltereds(login, password, site, contract);
	     
	     String[] teste = value.split("&&&");
	     
	     for ( String i : teste) {
	    	 
	    	 System.out.println(i);
	     }
	     
	}

}
