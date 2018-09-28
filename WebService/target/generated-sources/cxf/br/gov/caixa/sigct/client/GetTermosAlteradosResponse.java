
package br.gov.caixa.sigct.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTermosAlteradosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTermosAlteradosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Termo" type="{http://client.sigct.caixa.gov.br/}termosView" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTermosAlteradosResponse", propOrder = {
    "termo"
})
public class GetTermosAlteradosResponse {

    @XmlElement(name = "Termo")
    protected List<TermosView> termo;

    /**
     * Gets the value of the termo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermosView }
     * 
     * 
     */
    public List<TermosView> getTermo() {
        if (termo == null) {
            termo = new ArrayList<TermosView>();
        }
        return this.termo;
    }

}
