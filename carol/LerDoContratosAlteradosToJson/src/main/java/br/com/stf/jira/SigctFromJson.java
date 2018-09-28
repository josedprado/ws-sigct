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

public class SigctFromJson {
    Validacao val = new Validacao();
    
	public String runCSV(String[] fromSigct) {
		
		Gson gson = new Gson();	
		String json = new String();
				
		try {          			
				
			List<PojoContratacoesAlteradas> csvPojoList = new ArrayList<PojoContratacoesAlteradas>();
			
			for(String element : fromSigct)	{
				
				String[] content = element.split(";");	
				
				PojoContratacoesAlteradas csv = new PojoContratacoesAlteradas(); 
				
				   csv.setCoContrato(content[0]);					
				   csv.setCoDemanda(content[1]);									
  				   csv.setCoEntrega(content[2]);  				    
  				   csv.setCoOrdemServico(content[3]); 					
				   csv.setCoSitio(content[4]); 				
				   csv.setDeSituacaoDemanda(content[5]);					
				   csv.setDeSituacaoEntrega(content[6]);										
				   csv.setDeStcoOrdemServico(content[7]);
				   csv.setDeTipoEtapa(content[8]);
				   csv.setDeTipoForma(content[9]);
				   csv.setDeUnidadeMedida(content[10]);					
				   csv.setDhAcionamento(content[11]);					 
				   csv.setDhCdstoEntrega(content[12]);					
				   csv.setDhCdstoOrdemServico(content[13]);					
				   csv.setDhEfetivaEntrega(content[14]);					
				   csv.setDhPrevistaInicioAtendimento(content[15]);
				   csv.setIcEntregaVdp(content[16]);
				   csv.setIcOsVdp(content[17]);
				   csv.setIcPrecoPadrao(content[18]);
				   csv.setNoContrato(content[19]);
				   csv.setNoModulo(content[20]);
				   csv.setNoSistema(content[21]);
				   csv.setNoTipoPreco(content[22]);
				   csv.setNoTipoServico(content[23]);
				   csv.setNuContrato(content[24]);
				   csv.setNuEntrega(content[25]);
				   csv.setPcEntrega(content[26]);
				   csv.setPcExecutado(content[27]);
				   csv.setQtOrdemServico(content[28]);
				   csv.setSgSistema(content[29]);
				   csv.setVrEstmoOrdemServico(content[30]);
				   csv.setVrPreco(content[31]);
				   csv.setVrPrevistoEntrega(content[32]);
				csvPojoList.add(csv);
				
			} 	
			json = gson.toJson(csvPojoList);
		    			
			System.out.println(json);

		} catch (Exception e) {
			System.out.println("Erro ao gerar dados");
		}  
		return json;
	}
	
	
}
