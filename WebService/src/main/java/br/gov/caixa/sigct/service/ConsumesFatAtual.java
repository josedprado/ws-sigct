package br.gov.caixa.sigct.service;

import java.util.List;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

import br.gov.caixa.sigct.client.SOAPException_Exception;
import br.gov.caixa.sigct.client.SigctService;
import br.gov.caixa.sigct.client.SigctServiceService;
import br.gov.caixa.sigct.client.ContratacoesView;

public class ConsumesFatAtual { 
	
	private final static Logger LOGGER = Logger.getLogger(ConsumesFatAtual.class.getName());     
	private static final QName SERVICE_NAME = new QName("http://client.sigct.caixa.gov.br/", "SigctServiceService");
		
	SigctServiceService serviceServ = new SigctServiceService(SigctServiceService.WSDL_LOCATION, SERVICE_NAME);
	SigctService port = serviceServ.getSigctServicePort();
		
	public void consumesFatAtual(String login, String senha, String site, Long contrato, String invoice) throws SOAPException_Exception {
		
		try {
		
		List<br.gov.caixa.sigct.client.ContratacoesView> object = port.getContratacoesFaturamentoAtual(login, senha, contrato, site);		
		   
	    for (br.gov.caixa.sigct.client.ContratacoesView Contratacoes : object) {
	       	        	    
				    System.out.println("Cod. de contrato : " + Contratacoes.getCoContrato());
				    System.out.println("Cod. de demanda: " + Contratacoes.getCoDemanda());
				    System.out.println("Cod. de entrega: " + Contratacoes.getCoEntrega());
				    System.out.println("Ordem de servi�o: " + Contratacoes.getCoOrdemServico());
				    System.out.println("S�tio: " + Contratacoes.getCoSitio());
				    System.out.println("Descri��o Situa��o Demanda: " + Contratacoes.getDeSituacaoDemanda());
				    System.out.println("Descri��o Situa��o Entrega: " + Contratacoes.getDeSituacaoEntrega());
				    System.out.println("Descri��o Situa��o Ordem de Servi�o: " + Contratacoes.getDeStcoOrdemServico());
				    System.out.println("Descri��o Tipo Etapa: " + Contratacoes.getDeTipoEtapa());
				    System.out.println("Tipo Forma: " + Contratacoes.getDeTipoForma());
				    System.out.println("Descri��o da Unidade de Medida: " + Contratacoes.getDeUnidadeMedida());
				    System.out.println("Data do acionamento: " + Contratacoes.getDhAcionamento());
				    System.out.println("Data da Entrega: " + Contratacoes.getDhCdstoEntrega());
				    System.out.println("Data de Cadastro Ordem de Servi�o: " + Contratacoes.getDhCdstoOrdemServico());
				    System.out.println("Data da entrega efetiva: " + Contratacoes.getDhEfetivaEntrega());
				    System.out.println("Data do in�cio efetivo do acionamento: " + Contratacoes.getDhEfetivaInicioAtendimento());
				    System.out.println("Previs�o de entrega: " + Contratacoes.getDhPrevistaEntrega());
				    System.out.println("Data prevista inicio de atendimento: " + Contratacoes.getDhPrevistaInicioAtendimento());
				    System.out.println("Indicador de Entregar: " + Contratacoes.getIcEntregaVdp());
				    System.out.println("Indicador de Ordem de servi�o: " + Contratacoes.getIcOsVdp());
				    System.out.println("Indicador de Pre�o padr�o: " + Contratacoes.getIcPrecoPadrao());
				    System.out.println("Nome do Contrato: " + Contratacoes.getNoContrato());
				    System.out.println("Nome do m�dulo: " + Contratacoes.getNoModulo());
				    System.out.println("Nome do Sistema: " + Contratacoes.getNoSistema());
				    System.out.println("Nome tipo do pre�o: " + Contratacoes.getNoTipoPreco());
				    System.out.println("Nome tipo Servi�o: " + Contratacoes.getNoTipoServico());
				    System.out.println("Numero do contrato: " + Contratacoes.getNuContrato());
				    System.out.println("Percentual Entregue: " + Contratacoes.getPcEntrega());
				    System.out.println("Percentual Executado: " + Contratacoes.getPcExecutado());
				    System.out.println("Quantidade Afetada: " + Contratacoes.getQtAfetada());
				    System.out.println("Quantidade Alterada: " + Contratacoes.getQtAlterada());
				    System.out.println("Quantidade de dias pendentes procedente: " + Contratacoes.getQtDiasPendenciaProcedente());
				    System.out.println("Quantidade Exclu�da: " + Contratacoes.getQtExcluida());
				    System.out.println("Quantidade Inclu�da: " + Contratacoes.getQtIncluida());
				    System.out.println("Quantidade Na: " + Contratacoes.getQtNa());
				    System.out.println("Quantidade Ordem de servi�o: " + Contratacoes.getQtOrdemServico());
				    System.out.println("Quantidade Total: " + Contratacoes.getQtTotal()); 
				    System.out.println("Quantidade Ust: " + Contratacoes.getQtUst()); 
				    System.out.println("Sigla do Sistema: " + Contratacoes.getSgSistema());
				    System.out.println("Valor estimado da ordem de servi�o: " + Contratacoes.getVrEstmoOrdemServico());
				    System.out.println("Valor do pre�o: " + Contratacoes.getVrPreco());
				    System.out.println("Valor Previsto da Entrega: " + Contratacoes.getVrPrevistoEntrega());
				    System.out.println();
				      
	    }
		
	    } catch(IllegalArgumentException err) {
	        err = new IllegalArgumentException("Algum parametro inserido est� incorreto");
            
       }
	     
	}	
}	

