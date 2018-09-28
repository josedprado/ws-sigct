package br.gov.caixa.sigct.service;

import java.util.List;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

import br.gov.caixa.sigct.client.SOAPException_Exception;
import br.gov.caixa.sigct.client.SigctService;
import br.gov.caixa.sigct.client.SigctServiceService;

public class ConsumesTerms { 
	
	private final static Logger LOGGER = Logger.getLogger(ConsumesTerms.class.getName());     
	private static final QName SERVICE_NAME = new QName("http://client.sigct.caixa.gov.br/", "SigctServiceService");
		
	SigctServiceService serviceServ = new SigctServiceService(SigctServiceService.WSDL_LOCATION, SERVICE_NAME);
	SigctService port = serviceServ.getSigctServicePort();
		
	public void consumesTerms(String login, String password, String site, Long contract, String invoice) throws SOAPException_Exception {
		
		try {
		
		List<br.gov.caixa.sigct.client.TermosView> object = port.getTermos(login, password, contract, site, invoice);		
		
	    LOGGER.info("Termos de " + invoice + " " + login); 
	    
	    for (br.gov.caixa.sigct.client.TermosView term : object) {   
	    	        	    
				    System.out.println("Cod. de contrato : " + term.getCoContrato());
				    System.out.println("Cod. de demanda: " + term.getCoDemanda());
				    System.out.println("Cod. de entrega: " + term.getCoEntrega());
				    System.out.println("Ordem de servi�o: " + term.getCoOrdemServico());
				    System.out.println("S�tio: " + term.getCoSitio());
				    System.out.println("C�digo Termo: " + term.getCoTermo());
				    System.out.println("Avalia��o entrega: " + term.getDeAvaliacaoEntrega());
				    System.out.println("Fatura gerada: " + term.getDeFaturaGerada());
				    System.out.println("Fatura paga: " + term.getDeFaturaPaga());
				    System.out.println("Tipo Etapa: " + term.getDeTipoEtap());
				    System.out.println("Tipo Forma: " + term.getDeTipoForma());
				    System.out.println("Data do acionamento: " + term.getDhAcionamento());
				    System.out.println("Data da entrega efetiva: " + term.getCoSitio());
				    System.out.println("Data do in�cio efetivo do acionamento: " + term.getDhEfetivaInicioAtendimento());
				    System.out.println("Data da emiss�o do termo: " + term.getDhEmissaoTermo());
				    System.out.println("Previs�o de entrega: " + term.getDhPrevistaEntrega());
				    System.out.println("Repactua��o: " + term.getIcRepactuacao());
				    System.out.println("Nome do Contrato: " + term.getNoContrato());
				    System.out.println("Nome do m�dulo: " + term.getNoModulo());
				    System.out.println("Nome do Sistema: " + term.getNoSistema());
				    System.out.println("Situa��o do termo: " + term.getNoSituacaoTermo());
				    System.out.println("Nome tipo Prevo: " + term.getNoTipoPrevo());
				    System.out.println("Nome tipo Servi�o: " + term.getNoTipoServico());
				    System.out.println("Nome tipo Termo: " + term.getNoTipoTermo());
				    System.out.println("Numero do contrato: " + term.getNuContrato());
				    System.out.println("N�mero do termo: " + term.getNuTermo());
				    System.out.println("Entrega: " + term.getPcEntrega());
				    System.out.println("Executado: " + term.getPcExecutado());
				    System.out.println("Dia pendente Caixa: " + term.getQtDiaPendenteCaixa());
				    System.out.println("Quantidade entrega: " + term.getQtEntrega());
				    System.out.println("Quantidade erro aplica��o: " + term.getQtErroAplicacao());
				    System.out.println("Quantidade erro artefato: " + term.getQtErroArtefato());
				    System.out.println("Sistema: " + term.getSgSistema());
				    System.out.println("Termo Financeiro: " + term.getVrFinanceiroTermo());
				    System.out.println("Termo Financeiro Original: " + term.getVrFinanceiroTermoOriginal());
				    System.out.println("Pre�o Forma: " + term.getVrPrecoForma());
				    System.out.println("Previs�o Entrega: " + term.getVrPrevistoEntrega());
				    System.out.println("Termo de aceite retido: " + term.getVrRetidoTermoAceite()); 
				    System.out.println();
				    LOGGER.info("Termos de " + invoice + " " + login);
				    System.out.println();
	        
	    }
		
	    } catch(IllegalArgumentException err) {
	        //err = new IllegalArgumentException("Algum parametro inserido est� incorreto");
	    	LOGGER.warning("Hor�rio n�o permitido para consumo de tais dados");
       } catch(SOAPException_Exception e) {
    	   
    	    LOGGER.warning("Hor�rio n�o permitido para consumo de tais dados");
       }
	     
	}	
}	
	
	

		
	
	

