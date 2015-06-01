
package mx.com.redhat.consulting.coppel.poc.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}nom_columna" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}registro" maxOccurs="unbounded" minOccurs="0"/>
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
    "nomColumnas",
    "registros"
})
@XmlRootElement(name = "columna")
public class Columna {

    @XmlElement(name = "nom_columna")
    protected List<String> nomColumnas;
    @XmlElement(name = "registro")
    protected List<Registro> registros;

    /**
     * Gets the value of the nomColumnas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nomColumnas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNomColumnas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNomColumnas() {
        if (nomColumnas == null) {
            nomColumnas = new ArrayList<String>();
        }
        return this.nomColumnas;
    }

    /**
     * Gets the value of the registros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registro }
     * 
     * 
     */
    public List<Registro> getRegistros() {
        if (registros == null) {
            registros = new ArrayList<Registro>();
        }
        return this.registros;
    }

}
