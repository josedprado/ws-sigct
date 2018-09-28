
package br.gov.caixa.sigct.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contratacoesView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contratacoesView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coDemanda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coOrdemServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coSitio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deSituacaoDemanda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deSituacaoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deStcoOrdemServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deTipoEtapa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deTipoForma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dhAcionamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dhCdstoEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dhCdstoOrdemServico" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dhEfetivaEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dhEfetivaInicioAtendimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dhPrevistaEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dhPrevistaInicioAtendimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="icEntregaVdp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icOsVdp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icPrecoPadrao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noModulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noTipoPreco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noTipoServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuContrato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nuEntrega" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pcEntrega" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="pcExecutado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="qtAfetada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtAlterada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtDiasPendenciaProcedente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtExcluida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtIncluida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtNa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtOrdemServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtUst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sgSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vrEstmoOrdemServico" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrPreco" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vrPrevistoEntrega" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contratacoesView", propOrder = {
    "coContrato",
    "coDemanda",
    "coEntrega",
    "coOrdemServico",
    "coSitio",
    "deSituacaoDemanda",
    "deSituacaoEntrega",
    "deStcoOrdemServico",
    "deTipoEtapa",
    "deTipoForma",
    "deUnidadeMedida",
    "dhAcionamento",
    "dhCdstoEntrega",
    "dhCdstoOrdemServico",
    "dhEfetivaEntrega",
    "dhEfetivaInicioAtendimento",
    "dhPrevistaEntrega",
    "dhPrevistaInicioAtendimento",
    "icEntregaVdp",
    "icOsVdp",
    "icPrecoPadrao",
    "noContrato",
    "noModulo",
    "noSistema",
    "noTipoPreco",
    "noTipoServico",
    "nuContrato",
    "nuEntrega",
    "pcEntrega",
    "pcExecutado",
    "qtAfetada",
    "qtAlterada",
    "qtDiasPendenciaProcedente",
    "qtExcluida",
    "qtIncluida",
    "qtNa",
    "qtOrdemServico",
    "qtTotal",
    "qtUst",
    "sgSistema",
    "vrEstmoOrdemServico",
    "vrPreco",
    "vrPrevistoEntrega"
})
public class ContratacoesView {

    protected String coContrato;
    protected String coDemanda;
    protected String coEntrega;
    protected String coOrdemServico;
    protected String coSitio;
    protected String deSituacaoDemanda;
    protected String deSituacaoEntrega;
    protected String deStcoOrdemServico;
    protected String deTipoEtapa;
    protected String deTipoForma;
    protected String deUnidadeMedida;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhAcionamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhCdstoEntrega;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhCdstoOrdemServico;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhEfetivaEntrega;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhEfetivaInicioAtendimento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhPrevistaEntrega;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhPrevistaInicioAtendimento;
    protected String icEntregaVdp;
    protected String icOsVdp;
    protected String icPrecoPadrao;
    protected String noContrato;
    protected String noModulo;
    protected String noSistema;
    protected String noTipoPreco;
    protected String noTipoServico;
    protected Long nuContrato;
    protected Long nuEntrega;
    protected Double pcEntrega;
    protected Double pcExecutado;
    protected String qtAfetada;
    protected String qtAlterada;
    protected String qtDiasPendenciaProcedente;
    protected String qtExcluida;
    protected String qtIncluida;
    protected String qtNa;
    protected String qtOrdemServico;
    protected String qtTotal;
    protected String qtUst;
    protected String sgSistema;
    protected Double vrEstmoOrdemServico;
    protected Double vrPreco;
    protected Double vrPrevistoEntrega;

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
     * Gets the value of the deSituacaoDemanda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeSituacaoDemanda() {
        return deSituacaoDemanda;
    }

    /**
     * Sets the value of the deSituacaoDemanda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeSituacaoDemanda(String value) {
        this.deSituacaoDemanda = value;
    }

    /**
     * Gets the value of the deSituacaoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeSituacaoEntrega() {
        return deSituacaoEntrega;
    }

    /**
     * Sets the value of the deSituacaoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeSituacaoEntrega(String value) {
        this.deSituacaoEntrega = value;
    }

    /**
     * Gets the value of the deStcoOrdemServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeStcoOrdemServico() {
        return deStcoOrdemServico;
    }

    /**
     * Sets the value of the deStcoOrdemServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeStcoOrdemServico(String value) {
        this.deStcoOrdemServico = value;
    }

    /**
     * Gets the value of the deTipoEtapa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeTipoEtapa() {
        return deTipoEtapa;
    }

    /**
     * Sets the value of the deTipoEtapa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeTipoEtapa(String value) {
        this.deTipoEtapa = value;
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
     * Gets the value of the deUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeUnidadeMedida() {
        return deUnidadeMedida;
    }

    /**
     * Sets the value of the deUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeUnidadeMedida(String value) {
        this.deUnidadeMedida = value;
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
     * Gets the value of the dhCdstoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhCdstoEntrega() {
        return dhCdstoEntrega;
    }

    /**
     * Sets the value of the dhCdstoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhCdstoEntrega(XMLGregorianCalendar value) {
        this.dhCdstoEntrega = value;
    }

    /**
     * Gets the value of the dhCdstoOrdemServico property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhCdstoOrdemServico() {
        return dhCdstoOrdemServico;
    }

    /**
     * Sets the value of the dhCdstoOrdemServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhCdstoOrdemServico(XMLGregorianCalendar value) {
        this.dhCdstoOrdemServico = value;
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
     * Gets the value of the dhPrevistaInicioAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhPrevistaInicioAtendimento() {
        return dhPrevistaInicioAtendimento;
    }

    /**
     * Sets the value of the dhPrevistaInicioAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhPrevistaInicioAtendimento(XMLGregorianCalendar value) {
        this.dhPrevistaInicioAtendimento = value;
    }

    /**
     * Gets the value of the icEntregaVdp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcEntregaVdp() {
        return icEntregaVdp;
    }

    /**
     * Sets the value of the icEntregaVdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcEntregaVdp(String value) {
        this.icEntregaVdp = value;
    }

    /**
     * Gets the value of the icOsVdp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcOsVdp() {
        return icOsVdp;
    }

    /**
     * Sets the value of the icOsVdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcOsVdp(String value) {
        this.icOsVdp = value;
    }

    /**
     * Gets the value of the icPrecoPadrao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcPrecoPadrao() {
        return icPrecoPadrao;
    }

    /**
     * Sets the value of the icPrecoPadrao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcPrecoPadrao(String value) {
        this.icPrecoPadrao = value;
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
     * Gets the value of the noTipoPreco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTipoPreco() {
        return noTipoPreco;
    }

    /**
     * Sets the value of the noTipoPreco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTipoPreco(String value) {
        this.noTipoPreco = value;
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
     * Gets the value of the nuEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNuEntrega() {
        return nuEntrega;
    }

    /**
     * Sets the value of the nuEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNuEntrega(Long value) {
        this.nuEntrega = value;
    }

    /**
     * Gets the value of the pcEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPcEntrega() {
        return pcEntrega;
    }

    /**
     * Sets the value of the pcEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPcEntrega(Double value) {
        this.pcEntrega = value;
    }

    /**
     * Gets the value of the pcExecutado property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPcExecutado() {
        return pcExecutado;
    }

    /**
     * Sets the value of the pcExecutado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPcExecutado(Double value) {
        this.pcExecutado = value;
    }

    /**
     * Gets the value of the qtAfetada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtAfetada() {
        return qtAfetada;
    }

    /**
     * Sets the value of the qtAfetada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtAfetada(String value) {
        this.qtAfetada = value;
    }

    /**
     * Gets the value of the qtAlterada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtAlterada() {
        return qtAlterada;
    }

    /**
     * Sets the value of the qtAlterada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtAlterada(String value) {
        this.qtAlterada = value;
    }

    /**
     * Gets the value of the qtDiasPendenciaProcedente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtDiasPendenciaProcedente() {
        return qtDiasPendenciaProcedente;
    }

    /**
     * Sets the value of the qtDiasPendenciaProcedente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtDiasPendenciaProcedente(String value) {
        this.qtDiasPendenciaProcedente = value;
    }

    /**
     * Gets the value of the qtExcluida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtExcluida() {
        return qtExcluida;
    }

    /**
     * Sets the value of the qtExcluida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtExcluida(String value) {
        this.qtExcluida = value;
    }

    /**
     * Gets the value of the qtIncluida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtIncluida() {
        return qtIncluida;
    }

    /**
     * Sets the value of the qtIncluida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtIncluida(String value) {
        this.qtIncluida = value;
    }

    /**
     * Gets the value of the qtNa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtNa() {
        return qtNa;
    }

    /**
     * Sets the value of the qtNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtNa(String value) {
        this.qtNa = value;
    }

    /**
     * Gets the value of the qtOrdemServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtOrdemServico() {
        return qtOrdemServico;
    }

    /**
     * Sets the value of the qtOrdemServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtOrdemServico(String value) {
        this.qtOrdemServico = value;
    }

    /**
     * Gets the value of the qtTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtTotal() {
        return qtTotal;
    }

    /**
     * Sets the value of the qtTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtTotal(String value) {
        this.qtTotal = value;
    }

    /**
     * Gets the value of the qtUst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtUst() {
        return qtUst;
    }

    /**
     * Sets the value of the qtUst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtUst(String value) {
        this.qtUst = value;
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
     * Gets the value of the vrEstmoOrdemServico property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrEstmoOrdemServico() {
        return vrEstmoOrdemServico;
    }

    /**
     * Sets the value of the vrEstmoOrdemServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrEstmoOrdemServico(Double value) {
        this.vrEstmoOrdemServico = value;
    }

    /**
     * Gets the value of the vrPreco property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVrPreco() {
        return vrPreco;
    }

    /**
     * Sets the value of the vrPreco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVrPreco(Double value) {
        this.vrPreco = value;
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

}
