package br.com.stf.jira;

public class SigctFromJsonTest {	
	
		
    public static void main(String[] args) {
    	ObterDadoSigct obterDados = new ObterDadoSigct();
    	SigctFromJson generateJson = new SigctFromJson();		
		String[] collect = obterDados.valueFromSigct();
		generateJson.runCSV(collect);
		      	    

	  }


}
