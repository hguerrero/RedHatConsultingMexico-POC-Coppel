
package com.coppel.e03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}num_sucursal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}tipo_operacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}llave" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}timestamp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}id_transaccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}firma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}contenido" maxOccurs="unbounded" minOccurs="0"/>
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
    "numSucursals",
    "tipoOperacions",
    "llaves",
    "timestamps",
    "idTransaccions",
    "firmas",
    "contenidos"
})
@XmlRootElement(name = "doc")
public class Doc {

    @XmlElement(name = "num_sucursal")
    protected List<String> numSucursals;
    @XmlElement(name = "tipo_operacion")
    protected List<String> tipoOperacions;
    @XmlElement(name = "llave")
    protected List<String> llaves;
    @XmlElement(name = "timestamp")
    protected List<String> timestamps;
    @XmlElement(name = "id_transaccion")
    protected List<String> idTransaccions;
    @XmlElement(name = "firma")
    protected List<String> firmas;
    @XmlElement(name = "contenido")
    protected List<Contenido> contenidos;

    /**
     * Gets the value of the numSucursals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numSucursals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumSucursals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumSucursals() {
        if (numSucursals == null) {
            numSucursals = new ArrayList<String>();
        }
        return this.numSucursals;
    }

    /**
     * Gets the value of the tipoOperacions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoOperacions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoOperacions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTipoOperacions() {
        if (tipoOperacions == null) {
            tipoOperacions = new ArrayList<String>();
        }
        return this.tipoOperacions;
    }

    /**
     * Gets the value of the llaves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the llaves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLlaves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLlaves() {
        if (llaves == null) {
            llaves = new ArrayList<String>();
        }
        return this.llaves;
    }

    /**
     * Gets the value of the timestamps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timestamps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimestamps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTimestamps() {
        if (timestamps == null) {
            timestamps = new ArrayList<String>();
        }
        return this.timestamps;
    }

    /**
     * Gets the value of the idTransaccions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idTransaccions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdTransaccions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdTransaccions() {
        if (idTransaccions == null) {
            idTransaccions = new ArrayList<String>();
        }
        return this.idTransaccions;
    }

    /**
     * Gets the value of the firmas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firmas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirmas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFirmas() {
        if (firmas == null) {
            firmas = new ArrayList<String>();
        }
        return this.firmas;
    }

    /**
     * Gets the value of the contenidos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenidos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenidos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contenido }
     * 
     * 
     */
    public List<Contenido> getContenidos() {
        if (contenidos == null) {
            contenidos = new ArrayList<Contenido>();
        }
        return this.contenidos;
    }

}
