
package br.gov.caixa.sigct.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for termosView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="termosView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aaReferenciaRepactuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coDemanda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coOrdemServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coSitio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coTermo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coTermoAjustado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deAvaliacaoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deFaturaGerada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deFaturaPaga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deRepactuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deTipoEtap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deTipoForma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dhAcionamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dhEfetivaEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dhEfetivaInicioAtendimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dhEmissaoTermo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dhPrevistaEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtExecucaoRepactuacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="icRepactuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmReferenciaRepactuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noModulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noSituacaoTermo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noTipoPrevo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noTipoServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noTipoTermo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuContrato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nuTermo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pcEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcExecutado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtDiaPendenteCaixa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="qtEntrega" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="qtErroAplicacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="qtErroArtefato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="qtIndicePontoDefeito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="qtIndicePontoDefeitoAplicacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="qtIndicePontoDefeitoDocumentacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sgSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vrDescontoAtraso" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrDescontoErro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrFinanceiroTermo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrFinanceiroTermoOriginal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrGlobalContratoRepactuacao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrPrecoForma" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrPrevistoEntrega" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrPrevistoOs" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrRetidoTermoAceite" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrTotalRepactuacao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "termosView", propOrder = {
    "aaReferenciaRepactuacao",
    "coContrato",
    "coDemanda",
    "coEntrega",
    "coOrdemServico",
    "coSitio",
    "coTermo",
    "coTermoAjustado",
    "deAvaliacaoEntrega",
    "deFaturaGerada",
    "deFaturaPaga",
    "deRepactuacao",
    "deTipoEtap",
    "deTipoForma",
    "dhAcionamento",
    "dhEfetivaEntrega",
    "dhEfetivaInicioAtendimento",
    "dhEmissaoTermo",
    "dhPrevistaEntrega",
    "dtExecucaoRepactuacao",
    "icRepactuacao",
    "mmReferenciaRepactuacao",
    "noContrato",
    "noModulo",
    "noSistema",
    "noSituacaoTermo",
    "noTipoPrevo",
    "noTipoServico",
    "noTipoTermo",
    "nuContrato",
    "nuTermo",
    "pcEntrega",
    "pcExecutado",
    "qtDiaPendenteCaixa",
    "qtEntrega",
    "qtErroAplicacao",
    "qtErroArtefato",
    "qtIndicePontoDefeito",
    "qtIndicePontoDefeitoAplicacao",
    "qtIndicePontoDefeitoDocumentacao",
    "sgSistema",
    "vrDescontoAtraso",
    "vrDescontoErro",
    "vrFinanceiroTermo",
    "vrFinanceiroTermoOriginal",
    "vrGlobalContratoRepactuacao",
    "vrPrecoForma",
    "vrPrevistoEntrega",
    "vrPrevistoOs",
    "vrRetidoTermoAceite",
    "vrTotalRepactuacao"
})
public class TermosView {

    protected String aaReferenciaRepactuacao;
    protected String coContrato;
    protected String coDemanda;
    protected String coEntrega;
    protected String coOrdemServico;
    protected String coSitio;
    protected String coTermo;
    protected String coTermoAjustado;
    protected String deAvaliacaoEntrega;
    protected String deFaturaGerada;
    protected String deFaturaPaga;
    protected String deRepactuacao;
    protected String deTipoEtap;
    protected String deTipoForma;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhAcionamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhEfetivaEntrega;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhEfetivaInicioAtendimento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhEmissaoTermo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhPrevistaEntrega;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtExecucaoRepactuacao;
    protected String icRepactuacao;
    protected String mmReferenciaRepactuacao;
    protected String noContrato;
    protected String noModulo;
    protected String noSistema;
    protected String noSituacaoTermo;
    protected String noTipoPrevo;
    protected String noTipoServico;
    protected String noTipoTermo;
    protected Long nuContrato;
    protected Long nuTermo;
    protected String pcEntrega;
    protected String pcExecutado;
    protected Integer qtDiaPendenteCaixa;
    protected Double qtEntrega;
    protected Integer qtErroAplicacao;
    protected Integer qtErroArtefato;
    protected Integer qtIndicePontoDefeito;
    protected Integer qtIndicePontoDefeitoAplicacao;
    protected Integer qtIndicePontoDefeitoDocumentacao;
    protected String sgSistema;
    protected Double vrDescontoAtraso;
    protected Double vrDescontoErro;
    protected Double vrFinanceiroTermo;
    protected Double vrFinanceiroTermoOriginal;
    protected Double vrGlobalContratoRepactuacao;
    protected Double vrPrecoForma;
    protected Double vrPrevistoEntrega;
    protected Double vrPrevistoOs;
    protected Double vrRetidoTermoAceite;
    protected Double vrTotalRepactuacao;

    /**
     * Gets the value of the aaReferenciaRepactuacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAaReferenciaRepactuacao() {
        return aaReferenciaRepactuacao;
    }

    /**
     * Sets the value of the aaReferenciaRepactuacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAaReferenciaRepactuacao(String value) {
        this.aaReferenciaRepactuacao = value;
    }

    /**
     * Gets the value of the coContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoContrato() {
        return coContrato;
    }

    /**
     * Sets the value of the coContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoContrato(String value) {
        this.coContrato = value;
    }

    /**
     * Gets the value of the coDemanda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoDemanda() {
        return coDemanda;
    }

    /**
     * Sets the value of the coDemanda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoDemanda(String value) {
        this.coDemanda = value;
    }

    /**
     * Gets the value of the coEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoEntrega() {
        return coEntrega;
    }

    /**
     * Sets the value of the coEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoEntrega(String value) {
        this.coEntrega = value;
    }

    /**
     * Gets the value of the coOrdemServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoOrdemServico() {
        return coOrdemServico;
    }

    /**
     * Sets the value of the coOrdemServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoOrdemServico(String value) {
        this.coOrdemServico = value;
    }

    /**
     * Gets the value of the coSitio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoSitio() {
        return coSitio;
    }

    /**
     * Sets the value of the coSitio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoSitio(String value) {
        this.coSitio = value;
    }

    /**
     * Gets the value of the coTermo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoTermo() {
        return coTermo;
    }

    /**
     * Sets the value of the coTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoTermo(String value) {
        this.coTermo = value;
    }

    /**
     * Gets the value of the coTermoAjustado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoTermoAjustado() {
        return coTermoAjustado;
    }

    /**
     * Sets the value of the coTermoAjustado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoTermoAjustado(String value) {
        this.coTermoAjustado = value;
    }

    /**
     * Gets the value of the deAvaliacaoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeAvaliacaoEntrega() {
        return deAvaliacaoEntrega;
    }

    /**
     * Sets the value of the deAvaliacaoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeAvaliacaoEntrega(String value) {
        this.deAvaliacaoEntrega = value;
    }

    /**
     * Gets the value of the deFaturaGerada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeFaturaGerada() {
        return deFaturaGerada;
    }

    /**
     * Sets the value of the deFaturaGerada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeFaturaGerada(String value) {
        this.deFaturaGerada = value;
    }

    /**
     * Gets the value of the deFaturaPaga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeFaturaPaga() {
        return deFaturaPaga;
    }

    /**
     * Sets the value of the deFaturaPaga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeFaturaPaga(String value) {
        this.deFaturaPaga = value;
    }

    /**
     * Gets the value of the deRepactuacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeRepactuacao() {
        return deRepactuacao;
    }

    /**
     * Sets the value of the deRepactuacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeRepactuacao(String value) {
        this.deRepactuacao = value;
    }

    /**
     * Gets the value of the deTipoEtap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeTipoEtap() {
        return deTipoEtap;
    }

    /**
     * Sets the value of the deTipoEtap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeTipoEtap(String value) {
        this.deTipoEtap = value;
    }

    /**
     * Gets the value of the deTipoForma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeTipoForma() {
        return deTipoForma;
    }

    /**
     * Sets the value of the deTipoForma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeTipoForma(String value) {
        this.deTipoForma = value;
    }

    /**
     * Gets the value of the dhAcionamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhAcionamento() {
        return dhAcionamento;
    }

    /**
     * Sets the value of the dhAcionamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhAcionamento(XMLGregorianCalendar value) {
        this.dhAcionamento = value;
    }

    /**
     * Gets the value of the dhEfetivaEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhEfetivaEntrega() {
        return dhEfetivaEntrega;
    }

    /**
     * Sets the value of the dhEfetivaEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhEfetivaEntrega(XMLGregorianCalendar value) {
        this.dhEfetivaEntrega = value;
    }

    /**
     * Gets the value of the dhEfetivaInicioAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhEfetivaInicioAtendimento() {
        return dhEfetivaInicioAtendimento;
    }

    /**
     * Sets the value of the dhEfetivaInicioAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhEfetivaInicioAtendimento(XMLGregorianCalendar value) {
        this.dhEfetivaInicioAtendimento = value;
    }

    /**
     * Gets the value of the dhEmissaoTermo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhEmissaoTermo() {
        return dhEmissaoTermo;
    }

    /**
     * Sets the value of the dhEmissaoTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhEmissaoTermo(XMLGregorianCalendar value) {
        this.dhEmissaoTermo = value;
    }

    /**
     * Gets the value of the dhPrevistaEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhPrevistaEntrega() {
        return dhPrevistaEntrega;
    }

    /**
     * Sets the value of the dhPrevistaEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhPrevistaEntrega(XMLGregorianCalendar value) {
        this.dhPrevistaEntrega = value;
    }

    /**
     * Gets the value of the dtExecucaoRepactuacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtExecucaoRepactuacao() {
        return dtExecucaoRepactuacao;
    }

    /**
     * Sets the value of the dtExecucaoRepactuacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtExecucaoRepactuacao(XMLGregorianCalendar value) {
        this.dtExecucaoRepactuacao = value;
    }

    /**
     * Gets the value of the icRepactuacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcRepactuacao() {
        return icRepactuacao;
    }

    /**
     * Sets the value of the icRepactuacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcRepactuacao(String value) {
        this.icRepactuacao = value;
    }

    /**
     * Gets the value of the mmReferenciaRepactuacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmReferenciaRepactuacao() {
        return mmReferenciaRepactuacao;
    }

    /**
     * Sets the value of the mmReferenciaRepactuacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmReferenciaRepactuacao(String value) {
        this.mmReferenciaRepactuacao = value;
    }

    /**
     * Gets the value of the noContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoContrato() {
        return noContrato;
    }

    /**
     * Sets the value of the noContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoContrato(String value) {
        this.noContrato = value;
    }

    /**
     * Gets the value of the noModulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoModulo() {
        return noModulo;
    }

    /**
     * Sets the value of the noModulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoModulo(String value) {
        this.noModulo = value;
    }

    /**
     * Gets the value of the noSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSistema() {
        return noSistema;
    }

    /**
     * Sets the value of the noSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSistema(String value) {
        this.noSistema = value;
    }

    /**
     * Gets the value of the noSituacaoTermo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSituacaoTermo() {
        return noSituacaoTermo;
    }

    /**
     * Sets the value of the noSituacaoTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSituacaoTermo(String value) {
        this.noSituacaoTermo = value;
    }

    /**
     * Gets the value of the noTipoPrevo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTipoPrevo() {
        return noTipoPrevo;
    }

    /**
     * Sets the value of the noTipoPrevo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTipoPrevo(String value) {
        this.noTipoPrevo = value;
    }

    /**
     * Gets the value of the noTipoServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTipoServico() {
        return noTipoServico;
    }

    /**
     * Sets the value of the noTipoServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTipoServico(String value) {
        this.noTipoServico = value;
    }

    /**
     * Gets the value of the noTipoTermo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTipoTermo() {
        return noTipoTermo;
    }

    /**
     * Sets the value of the noTipoTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTipoTermo(String value) {
        this.noTipoTermo = value;
    }

    /**
     * Gets the value of the nuContrato property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNuContrato() {
        return nuContrato;
    }

    /**
     * Sets the value of the nuContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNuContrato(Long value) {
        this.nuContrato = value;
    }

    /**
     * Gets the value of the nuTermo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNuTermo() {
        return nuTermo;
    }

    /**
     * Sets the value of the nuTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNuTermo(Long value) {
        this.nuTermo = value;
    }

    /**
     * Gets the value of the pcEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcEntrega() {
        return pcEntrega;
    }

    /**
     * Sets the value of the pcEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcEntrega(String value) {
        this.pcEntrega = value;
    }

    /**
     * Gets the value of the pcExecutado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcExecutado() {
        return pcExecutado;
    }

    /**
     * Sets the value of the pcExecutado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcExecutado(String value) {
        this.pcExecutado = value;
    }

    /**
     * Gets the value of the qtDiaPendenteCaixa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtDiaPendenteCaixa() {
        return qtDiaPendenteCaixa;
    }

    /**
     * Sets the value of the qtDiaPendenteCaixa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtDiaPendenteCaixa(Integer value) {
        this.qtDiaPendenteCaixa = value;
    }

    /**
     * Gets the value of the qtEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQtEntrega() {
        return qtEntrega;
    }

    /**
     * Sets the value of the qtEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQtEntrega(Double value) {
        this.qtEntrega = value;
    }

    /**
     * Gets the value of the qtErroAplicacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtErroAplicacao() {
        return qtErroAplicacao;
    }

    /**
     * Sets the value of the qtErroAplicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtErroAplicacao(Integer value) {
        this.qtErroAplicacao = value;
    }

    /**
     * Gets the value of the qtErroArtefato property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtErroArtefato() {
        return qtErroArtefato;
    }

    /**
     * Sets the value of the qtErroArtefato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtErroArtefato(Integer value) {
        this.qtErroArtefato = value;
    }

    /**
     * Gets the value of the qtIndicePontoDefeito property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtIndicePontoDefeito() {
        return qtIndicePontoDefeito;
    }

    /**
     * Sets the value of the qtIndicePontoDefeito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtIndicePontoDefeito(Integer value) {
        this.qtIndicePontoDefeito = value;
    }

    /**
     * Gets the value of the qtIndicePontoDefeitoAplicacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtIndicePontoDefeitoAplicacao() {
        return qtIndicePontoDefeitoAplicacao;
    }

    /**
     * Sets the value of the qtIndicePontoDefeitoAplicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtIndicePontoDefeitoAplicacao(Integer value) {
        this.qtIndicePontoDefeitoAplicacao = value;
    }

    /**
     * Gets the value of the qtIndicePontoDefeitoDocumentacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtIndicePontoDefeitoDocumentacao() {
        return qtIndicePontoDefeitoDocumentacao;
    }

    /**
     * Sets the value of the qtIndicePontoDefeitoDocumentacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtIndicePontoDefeitoDocumentacao(Integer value) {
        this.qtIndicePontoDefeitoDocumentacao = value;
    }

    /**
     * Gets the value of the sgSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgSistema() {
        return sgSistema;
    }

    /**
     * Sets the value of the sgSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgSistema(String value) {
        this.sgSistema = value;
    }

    /**
     * Gets the value of the vrDescontoAtraso property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrDescontoAtraso() {
        return vrDescontoAtraso;
    }

    /**
     * Sets the value of the vrDescontoAtraso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrDescontoAtraso(Double value) {
        this.vrDescontoAtraso = value;
    }

    /**
     * Gets the value of the vrDescontoErro property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrDescontoErro() {
        return vrDescontoErro;
    }

    /**
     * Sets the value of the vrDescontoErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrDescontoErro(Double value) {
        this.vrDescontoErro = value;
    }

    /**
     * Gets the value of the vrFinanceiroTermo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrFinanceiroTermo() {
        return vrFinanceiroTermo;
    }

    /**
     * Sets the value of the vrFinanceiroTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrFinanceiroTermo(Double value) {
        this.vrFinanceiroTermo = value;
    }

    /**
     * Gets the value of the vrFinanceiroTermoOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrFinanceiroTermoOriginal() {
        return vrFinanceiroTermoOriginal;
    }

    /**
     * Sets the value of the vrFinanceiroTermoOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrFinanceiroTermoOriginal(Double value) {
        this.vrFinanceiroTermoOriginal = value;
    }

    /**
     * Gets the value of the vrGlobalContratoRepactuacao property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrGlobalContratoRepactuacao() {
        return vrGlobalContratoRepactuacao;
    }

    /**
     * Sets the value of the vrGlobalContratoRepactuacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrGlobalContratoRepactuacao(Double value) {
        this.vrGlobalContratoRepactuacao = value;
    }

    /**
     * Gets the value of the vrPrecoForma property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrPrecoForma() {
        return vrPrecoForma;
    }

    /**
     * Sets the value of the vrPrecoForma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrPrecoForma(Double value) {
        this.vrPrecoForma = value;
    }

    /**
     * Gets the value of the vrPrevistoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrPrevistoEntrega() {
        return vrPrevistoEntrega;
    }

    /**
     * Sets the value of the vrPrevistoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrPrevistoEntrega(Double value) {
        this.vrPrevistoEntrega = value;
    }

    /**
     * Gets the value of the vrPrevistoOs property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrPrevistoOs() {
        return vrPrevistoOs;
    }

    /**
     * Sets the value of the vrPrevistoOs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrPrevistoOs(Double value) {
        this.vrPrevistoOs = value;
    }

    /**
     * Gets the value of the vrRetidoTermoAceite property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrRetidoTermoAceite() {
        return vrRetidoTermoAceite;
    }

    /**
     * Sets the value of the vrRetidoTermoAceite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrRetidoTermoAceite(Double value) {
        this.vrRetidoTermoAceite = value;
    }

    /**
     * Gets the value of the vrTotalRepactuacao property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrTotalRepactuacao() {
        return vrTotalRepactuacao;
    }

    /**
     * Sets the value of the vrTotalRepactuacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrTotalRepactuacao(Double value) {
        this.vrTotalRepactuacao = value;
    }

}
