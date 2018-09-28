package br.com.stf.jira;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import br.com.stf.validacao.*;

import com.google.gson.Gson;

public class ReadCSV {
    Validacao val = new Validacao();
    
	public String runCSVtoJson(String archiveCSV) {

		BufferedReader br = null;
		String line = "";
		Gson gson = new Gson();	
		String json = new String();
				
		try {
            List<CsvPojo> csvPojoList = new ArrayList<CsvPojo>();
			
			br = new BufferedReader(new FileReader(archiveCSV));
			
			int count = 0;
			
			while ((line = br.readLine()) != null) {
				
				CsvPojo csv = new CsvPojo();
				
				if(count>0) {
					
				String[] content = line.split(";");	
				
					if(val.isValid(content[0])==true) {			
					    csv.setSite(content[0]);
					}
					if(val.isValid(content[1])==true) {
						csv.setSistema(content[1]);
					}					
  				        csv.setEpic(content[2]);
  				    if(val.isValid(content[3])==true) {
  				    	csv.setDemanda(content[3]);
  				    }
					if(val.isValid(content[4])==true) {
					    csv.setOS(content[4]);
					}
					if(val.isValid(content[5])==true) {
					    csv.setServico(content[5]);
					}
					if(val.isValid(content[6])==true) {
					    csv.setForma(content[6]);
					}					
					csv.setTipo(content[7]);
					csv.setCategoria(content[8]);
					csv.setEtapa(content[9]);
					csv.setEntrega(content[10]);
					
					if(val.isDateValid(content[11])==true) {
					    csv.setInicio(content[11]);
					}
					if(val.isDateValid(content[12])==true) { 
					    csv.setData_prevista(content[12]);
					}
					if(val.isDateValid(content[13])) {
					    csv.setData_entrega(content[13]);
					}
					if(val.isValid(content[14])==true) {
					    csv.setSituacao(content[14]);
					}
					csv.setResponsavel(content[15]);
					csv.setEquipe(content[16]);
					csv.setAno_inicio(content[17]);
					csv.setAcoes(content[18]);
					csvPojoList.add(csv);					
			} 				
				count++;				
		}
			
			json = gson.toJson(csvPojoList);
			//System.out.println(json);

		} catch (FileNotFoundException e) {
			System.out.println("Esse arquivo não existe ou está com algum erro");
		} catch (IOException e) {
			System.out.println("Ococrreu algum erro com relação a entrada e saída de dados");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("Ocorreu algum erro com relação à entrada e saída de dados");
				}
			}
		}
		return json;
	}
	
	
}
