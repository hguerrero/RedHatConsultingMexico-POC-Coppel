
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
 *         &lt;element ref="{}Datos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nodo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}atributos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}metodo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}parametros" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}esperaconsulta" maxOccurs="unbounded" minOccurs="0"/>
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
    "datos",
    "nodos",
    "atributos",
    "metodos",
    "parametros",
    "esperaconsultas"
})
@XmlRootElement(name = "contenido")
public class Contenido {

    @XmlElement(name = "Datos")
    protected List<Datos> datos;
    @XmlElement(name = "nodo")
    protected List<String> nodos;
    protected List<String> atributos;
    @XmlElement(name = "metodo")
    protected List<String> metodos;
    protected List<String> parametros;
    @XmlElement(name = "esperaconsulta")
    protected List<String> esperaconsultas;

    /**
     * Gets the value of the datos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Datos }
     * 
     * 
     */
    public List<Datos> getDatos() {
        if (datos == null) {
            datos = new ArrayList<Datos>();
        }
        return this.datos;
    }

    /**
     * Gets the value of the nodos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNodos() {
        if (nodos == null) {
            nodos = new ArrayList<String>();
        }
        return this.nodos;
    }

    /**
     * Gets the value of the atributos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atributos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtributos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAtributos() {
        if (atributos == null) {
            atributos = new ArrayList<String>();
        }
        return this.atributos;
    }

    /**
     * Gets the value of the metodos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metodos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetodos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetodos() {
        if (metodos == null) {
            metodos = new ArrayList<String>();
        }
        return this.metodos;
    }

    /**
     * Gets the value of the parametros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParametros() {
        if (parametros == null) {
            parametros = new ArrayList<String>();
        }
        return this.parametros;
    }

    /**
     * Gets the value of the esperaconsultas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esperaconsultas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEsperaconsultas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEsperaconsultas() {
        if (esperaconsultas == null) {
            esperaconsultas = new ArrayList<String>();
        }
        return this.esperaconsultas;
    }

}
