package br.gov.caixa.sigct.service;

import java.util.List;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

import br.gov.caixa.sigct.client.SOAPException_Exception;
import br.gov.caixa.sigct.client.SigctService;
import br.gov.caixa.sigct.client.SigctServiceService;

public class ConsContrAltereds {
	String result = new String();
	List<br.gov.caixa.sigct.client.ContratacoesView> object;
	
	private final static Logger LOGGER = Logger.getLogger(ConsumesTerms.class.getName());     
	private static final QName SERVICE_NAME = new QName("http://client.sigct.caixa.gov.br/", "SigctServiceService");
	
	SigctServiceService serviceServ = new SigctServiceService(SigctServiceService.WSDL_LOCATION, SERVICE_NAME);
	SigctService port = serviceServ.getSigctServicePort(); 
	
	public List<br.gov.caixa.sigct.client.ContratacoesView> consumesCoAltereds(String login, String password, String site, Long contract)  {
		
		try {
			object = port.getContratacoesAlteradas(login, password, contract,site);
			LOGGER.info("Contratos alterados");
			
			for (br.gov.caixa.sigct.client.ContratacoesView contr : object) {			
				
		        result = "CoContrato: " + contr.getCoContrato() + "\nCoDemanda: " + contr.getCoDemanda() + 
		        		"\nCoEntrega: " + contr.getCoEntrega() + "\nCoOrdemservico: " + contr.getCoOrdemServico() +
		        		"\nCoSitio: " + contr.getCoSitio() + "\nDeSituacaoDemanda: " + contr.getDeSituacaoDemanda() + 
		        		"\nDeSituacaoEntrega: " + contr.getDeSituacaoEntrega() + "\nDeStcoOrdemServico: " + contr.getDeStcoOrdemServico() +
		        		"\nDeTipoetapa: " + contr.getDeTipoEtapa() + "\nDeTipoForma: " + contr.getDeTipoForma() + 
		        		"\nDeUnidadeMedida: " + contr.getDeUnidadeMedida() + "\nDhAcionamento: " + contr.getDhAcionamento() + 
		        		"\nDhCdstoEntrega: " + contr.getDhCdstoEntrega() + "\nDhCdstoOrdemServico: " + contr.getDhCdstoOrdemServico() + 
		        		"\nDhEfetivaEntrega: " + contr.getDhEfetivaEntrega() + "\nDhPrevistaEntrega: " + contr.getDhPrevistaEntrega() +
		        		"\nDhPrevistaInicioAtendimento: " + contr.getDhPrevistaInicioAtendimento() + "\nIcEntregaVdp: " + contr.getIcEntregaVdp() +
		        		"\nIcOsVdp: " + contr.getIcOsVdp() + "\nIcprecoPadrao: " + contr.getIcPrecoPadrao() + "\nNoContrato: " + contr.getNoContrato() +
		        		"\nNoModulo: " + contr.getNoModulo() + "\nNoSistema: " + contr.getNoSistema() + "\nNoTipoPreco: " + contr.getNoTipoPreco() + 
		        		"\nNoTipoPreco: " + contr.getNoTipoPreco() + "\nNuContrato: " + contr.getNuContrato() + "\nNuEntrega: " + contr.getNuEntrega() + 
		        		"\nPcEntrega: " + contr.getPcEntrega() + "\nPcExecutado: " + contr.getPcExecutado() + "\nQtAlterada: " + contr.getQtAlterada() + 
		        		"\nQtExcluida: " + contr.getQtExcluida() + "\nQtincluida: " + contr.getQtIncluida() + "\nQtOrdemServico: " + contr.getQtOrdemServico() +
		        		"\nSgSistema: " + contr.getSgSistema() + "\nVrEstmoOrdemServico: " + contr.getVrEstmoOrdemServico() + "\nVrpreco: " + contr.getVrPreco() + 
		        		"\nVrPrevistoentrega: "+ contr.getVrPrevistoEntrega();
		        
		        System.out.println(result + "\n");	
		        LOGGER.info("Contratos alterados");
		          		         	    
		    }			
			
		} catch (SOAPException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			
			return object ;
		}
				
	}
	
			
	}
	



