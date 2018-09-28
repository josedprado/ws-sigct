package com.jira.pojo;
import java.util.Date;

public class GeneralDataPojo {
	
	private String site;	
	private String sistema;
	private String epic;
	private String demanda;
	private static int OS;
	private String serviço;
	private String forma;	
	private String tipo;	
	private String categoria;	
	private String etapa	;
	private int entrega;	
	private Date inicioAtendimento;	
	private Date dataPrevista;	
	private Date dataEntrega;	
	private String situacao;	
	private String responsavel;	
	private String equipe;
	private Date AnoInicioAtendimento;	
	private String acoes;
	

	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public String getEpic() {
		return epic;
	}
	public void setEpic(String epic) {
		this.epic = epic;
	}
	public String getDemanda() {
		return demanda;
	}
	public void setDemanda(String demanda) {
		this.demanda = demanda;
	}
	public static int getOS() {
		return OS;
	}
	public void setOS(int oS) {
		OS = oS;
	}
	public String getServiço() {
		return serviço;
	}
	public void setServiço(String serviço) {
		this.serviço = serviço;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	public int getEntrega() {
		return entrega;
	}
	public void setEntrega(int entrega) {
		this.entrega = entrega;
	}
	public Date getInícioAtendimento() {
		return inicioAtendimento;
	}
	public void setInícioAtendimento(Date inícioAtendimento) {
		this.inicioAtendimento = inícioAtendimento;
	}
	public Date getDataPrevista() {
		return dataPrevista;
	}
	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getSituação() {
		return situacao;
	}
	public void setSituação(String situação) {
		this.situacao = situação;
	}
	public String getResponsável() {
		return responsavel;
	}
	public void setResponsável(String responsável) {
		this.responsavel = responsável;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	public Date getAnoInicioAtendimento() {
		return AnoInicioAtendimento;
	}
	public void setAnoInicioAtendimento(Date anoInicioAtendimento) {
		AnoInicioAtendimento = anoInicioAtendimento;
	}
	public String getAções() {
		return acoes;
	}
	public void setAções(String ações) {
		this.acoes = ações;
	}
	
	@Override
	public String toString() {
		return "RelatorioGeralPojo [site=" + site + ", sistema=" + sistema + ", epic=" + epic
				+ ", demanda=" + demanda + ", OS=" + OS + ", serviço=" + serviço
				+ ", forma=" + forma + ", tipo=" + tipo + ", categoria=" + categoria
				+ ", etapa=" + etapa + ", entrega=" + entrega + ", inicioAtendimento=" + inicioAtendimento
				+ ", dataPrevista=" + dataPrevista + ", situacao=" + situacao + ", responsavel=" + responsavel
				+ ", equipe=" + equipe + ", AnoInicioAtendimento=" + AnoInicioAtendimento + ", acoes=" + acoes + "]";
	}
	
	
	

}
