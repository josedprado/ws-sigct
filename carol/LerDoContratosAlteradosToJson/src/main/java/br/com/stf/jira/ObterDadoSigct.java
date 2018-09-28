package br.com.stf.jira;
import java.util.Scanner;
import br.com.stf.consumes.*;

public class ObterDadoSigct {
	
	public String[] valueFromSigct() {
		
		ConsContrAlt datas = new ConsContrAlt();
		
		String login = "Stefanini_Canais";
	    String password = "715426";
	    String site = "SP";
	    Long contract = 469L;	
	    
	    String value = new String();
	     
		value = datas.consumesCoAltereds(login, password, site, contract);		
		
		String[] teste = value.split("&&&");	     
	     
		return teste;
	    /*O retorno desse método é um array de string separados por linhas*/ 
	  }
}
