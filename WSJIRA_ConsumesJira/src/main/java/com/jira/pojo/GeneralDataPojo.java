package com.jira.pojo;
import java.util.Date;

public class GeneralDataPojo {
	
	private String site;	
	private String sistema;
	private String epic;
	private String demanda;
	private static int OS;
	private String servi�o;
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
	public String getServi�o() {
		return servi�o;
	}
	public void setServi�o(String servi�o) {
		this.servi�o = servi�o;
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
	public Date getIn�cioAtendimento() {
		return inicioAtendimento;
	}
	public void setIn�cioAtendimento(Date in�cioAtendimento) {
		this.inicioAtendimento = in�cioAtendimento;
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
	public String getSitua��o() {
		return situacao;
	}
	public void setSitua��o(String situa��o) {
		this.situacao = situa��o;
	}
	public String getRespons�vel() {
		return responsavel;
	}
	public void setRespons�vel(String respons�vel) {
		this.responsavel = respons�vel;
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
	public String getA��es() {
		return acoes;
	}
	public void setA��es(String a��es) {
		this.acoes = a��es;
	}
	
	@Override
	public String toString() {
		return "RelatorioGeralPojo [site=" + site + ", sistema=" + sistema + ", epic=" + epic
				+ ", demanda=" + demanda + ", OS=" + OS + ", servi�o=" + servi�o
				+ ", forma=" + forma + ", tipo=" + tipo + ", categoria=" + categoria
				+ ", etapa=" + etapa + ", entrega=" + entrega + ", inicioAtendimento=" + inicioAtendimento
				+ ", dataPrevista=" + dataPrevista + ", situacao=" + situacao + ", responsavel=" + responsavel
				+ ", equipe=" + equipe + ", AnoInicioAtendimento=" + AnoInicioAtendimento + ", acoes=" + acoes + "]";
	}
	
	
	

}
