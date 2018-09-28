package br.com.stf.consumes;

import java.util.List;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

import br.gov.caixa.sigct.client.SOAPException_Exception;
import br.gov.caixa.sigct.client.SigctService;
import br.gov.caixa.sigct.client.SigctServiceService;

public class ConsContrAlt {
	String result = new String();
	List<br.gov.caixa.sigct.client.ContratacoesView> object;
	
	private final static Logger LOGGER = Logger.getLogger(ConsContrAlt.class.getName());     
	private static final QName SERVICE_NAME = new QName("http://client.sigct.caixa.gov.br/", "SigctServiceService");
	
	SigctServiceService serviceServ = new SigctServiceService(SigctServiceService.WSDL_LOCATION, SERVICE_NAME);
	SigctService port = serviceServ.getSigctServicePort(); 
	
	public String consumesCoAltereds(String login, String password, String site, Long contract)  {
		
		try {
			object = port.getContratacoesAlteradas(login, password, contract,site);
			//LOGGER.info("Contratos alterados");
			
			for (br.gov.caixa.sigct.client.ContratacoesView contr : object) {			
				
		        result += contr.getCoContrato() + ";" + contr.getCoDemanda() + 
		        		";" + contr.getCoEntrega() + ";" + contr.getCoOrdemServico() +
		        		";" + contr.getCoSitio() + ";" + contr.getDeSituacaoDemanda() + 
		        		";" + contr.getDeSituacaoEntrega() + ";" + contr.getDeStcoOrdemServico() +
		        		";" + contr.getDeTipoEtapa() + ";" + contr.getDeTipoForma() + 
		        		";" + contr.getDeUnidadeMedida() + ";" + contr.getDhAcionamento() + 
		        		";" + contr.getDhCdstoEntrega() + ";" + contr.getDhCdstoOrdemServico() + 
		        		";" + contr.getDhEfetivaEntrega() + ";" + contr.getDhPrevistaEntrega() +
		        		";" + contr.getDhPrevistaInicioAtendimento() + ";" + contr.getIcEntregaVdp() +
		        		";" + contr.getIcOsVdp() + ";" + contr.getIcPrecoPadrao() + ";" + contr.getNoContrato() +
		        		";" + contr.getNoModulo() + ";" + contr.getNoSistema() + ";" + contr.getNoTipoPreco() + 
		        		";" + contr.getNoTipoPreco() + ";" + contr.getNuContrato() + ";" + contr.getNuEntrega() + 
		        		";" + contr.getPcEntrega() + ";" + contr.getPcExecutado() + ";" + contr.getQtAlterada() + 
		        		";" + contr.getQtExcluida() + ";" + contr.getQtIncluida() + ";" + contr.getQtOrdemServico() +
		        		";" + contr.getSgSistema() + ";" + contr.getVrEstmoOrdemServico() + ";" + contr.getVrPreco() + 
		        		";"+ contr.getVrPrevistoEntrega() + "&&&";
		        
		        //System.out.println(result);	
		        //LOGGER.info("Contratos alterados");
		          		         	    
		    }			
			
		} catch (SOAPException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			
			return result;
		}
				
	}
	
			
	}
	



