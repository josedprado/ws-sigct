
package br.gov.caixa.sigct.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContratacoesAlteradasResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getContratacoesAlteradasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contratacao" type="{http://client.sigct.caixa.gov.br/}contratacoesView" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContratacoesAlteradasResponse", propOrder = {
    "contratacao"
})
public class GetContratacoesAlteradasResponse {

    @XmlElement(name = "Contratacao")
    protected List<ContratacoesView> contratacao;

    /**
     * Gets the value of the contratacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contratacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContratacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContratacoesView }
     * 
     * 
     */
    public List<ContratacoesView> getContratacao() {
        if (contratacao == null) {
            contratacao = new ArrayList<ContratacoesView>();
        }
        return this.contratacao;
    }

}
