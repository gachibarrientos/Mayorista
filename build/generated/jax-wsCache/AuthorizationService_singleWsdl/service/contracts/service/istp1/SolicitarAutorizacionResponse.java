
package service.contracts.service.istp1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.sge_service_contracts.Autorizacion;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SolicitarAutorizacionResult" type="{http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data}Autorizacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "solicitarAutorizacionResult"
})
@XmlRootElement(name = "SolicitarAutorizacionResponse")
public class SolicitarAutorizacionResponse {

    @XmlElementRef(name = "SolicitarAutorizacionResult", namespace = "http://ISTP1.Service.Contracts.Service", type = JAXBElement.class, required = false)
    protected JAXBElement<Autorizacion> solicitarAutorizacionResult;

    /**
     * Gets the value of the solicitarAutorizacionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Autorizacion }{@code >}
     *     
     */
    public JAXBElement<Autorizacion> getSolicitarAutorizacionResult() {
        return solicitarAutorizacionResult;
    }

    /**
     * Sets the value of the solicitarAutorizacionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Autorizacion }{@code >}
     *     
     */
    public void setSolicitarAutorizacionResult(JAXBElement<Autorizacion> value) {
        this.solicitarAutorizacionResult = ((JAXBElement<Autorizacion> ) value);
    }

}
