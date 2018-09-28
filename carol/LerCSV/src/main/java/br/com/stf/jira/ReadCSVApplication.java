package br.com.stf.jira;

public class ReadCSVApplication {
	
	public static void main(String[] args) {		
			
		String archive = "relatorioGeralCanais.csv";        
	    ReadCSV obj = new ReadCSV();
	    System.out.println(obj.runCSVtoJson(archive));
	      	    

	  }
}
