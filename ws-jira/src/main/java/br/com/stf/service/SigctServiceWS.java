package br.com.stf.service;

import java.util.List;

import javax.xml.namespace.QName;

import br.gov.caixa.sigct.client.ContratacoesView;
import br.gov.caixa.sigct.client.SOAPException_Exception;
import br.gov.caixa.sigct.client.SigctService;
import br.gov.caixa.sigct.client.SigctServiceService;
import br.gov.caixa.sigct.client.TermosView;

public class SigctServiceWS implements SigctService{
	
	private static final QName SERVICE_NAME = new QName("http://client.sigct.caixa.gov.br/", "SigctServiceService");
	
	static SigctServiceService ss = new SigctServiceService(SigctServiceService.WSDL_LOCATION, SERVICE_NAME);
    static SigctService port = ss.getSigctServicePort();  

	public List<TermosView> getTermosAlterados(String login, String senha, Long contrato, String site)
			throws SOAPException_Exception {
		return port.getTermosAlterados(login, senha, contrato, site);
	}

	public List<ContratacoesView> getContratacoesAlteradas(String login, String senha, Long contrato, String site)
			throws SOAPException_Exception {
		return null;
	}

	public List<ContratacoesView> getContratacoes(String login, String senha, Long contrato, String site,
			Integer pagina) throws SOAPException_Exception {
		return null;
	}

	public List<ContratacoesView> getContratacoesFaturamentoAtual(String login, String senha, Long contrato,
			String site) throws SOAPException_Exception {
		return null;
	}

	public List<TermosView> getTermos(String login, String senha, Long contrato, String site, String fatura)
			throws SOAPException_Exception {
		return null;
	}
	
}
