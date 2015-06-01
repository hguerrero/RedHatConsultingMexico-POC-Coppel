
package com.coppel.s03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import mx.com.redhat.consulting.coppel.poc.ws.Contenido;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}descripcion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}estado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}mensaje" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}status" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}contenido" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}id_transaccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fechavencimiento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}poliza" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}clienteprospecto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "descripcionsAndEstadosAndMensajes"
})
@XmlRootElement(name = "doc")
public class Doc {

  
    protected List<Object> descripcionsAndEstadosAndMensajes;

    /**
     * Gets the value of the descripcionsAndEstadosAndMensajes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descripcionsAndEstadosAndMensajes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescripcionsAndEstadosAndMensajes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Contenido }
     * 
     * 
     */
    public List<Object> getDescripcionsAndEstadosAndMensajes() {
        if (descripcionsAndEstadosAndMensajes == null) {
            descripcionsAndEstadosAndMensajes = new ArrayList<Object>();
        }
        return this.descripcionsAndEstadosAndMensajes;
    }

}
