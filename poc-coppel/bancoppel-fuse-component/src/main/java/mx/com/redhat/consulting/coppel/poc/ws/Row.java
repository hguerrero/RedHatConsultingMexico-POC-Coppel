
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
 *         &lt;element ref="{}status" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}foliotransaccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}mensaje" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numcliente" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}clienteprospecto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nombre" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidopaterno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidomaterno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fechanacimiento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numcasa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numcalle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nomcalle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numzona" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nombrezona" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numciudad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nomciudad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nommunicipio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}complemento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}rumbo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numdeptoointerior" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcmanzana" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcotros" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcandador" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcetapa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhclote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcedificio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcentrada" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}codigopostal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telefonodecasa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telefonocelular" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telefonotrabajo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}extensiontrabajo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}claveseguro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}tiposeguro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}cantidadseguros" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fechaafiliacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fechavencimiento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}statusseguro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}costo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}poliza" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}subplan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}cantidad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}edadmin" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}edadmax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}precio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}monto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}cantidadmaxpagar" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}plazo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}descripcionseguro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}descripcionplan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}servicio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}tipopago" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numclientebancoppel" maxOccurs="unbounded" minOccurs="0"/>
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
    "statuses",
    "foliotransaccions",
    "mensajes",
    "numclientes",
    "clienteprospectos",
    "nombres",
    "apellidopaternos",
    "apellidomaternos",
    "fechanacimientos",
    "numcasas",
    "numcalles",
    "nomcalles",
    "numzonas",
    "nombrezonas",
    "numciudads",
    "nomciudads",
    "nommunicipios",
    "complementos",
    "rumbos",
    "numdeptoointeriors",
    "uhcmanzanas",
    "uhcotros",
    "uhcandadors",
    "uhcetapas",
    "uhclotes",
    "uhcedificios",
    "uhcentradas",
    "codigopostals",
    "telefonodecasas",
    "telefonocelulars",
    "telefonotrabajos",
    "extensiontrabajos",
    "claveseguros",
    "tiposeguros",
    "cantidadseguros",
    "fechaafiliacions",
    "fechavencimientos",
    "statusseguros",
    "costos",
    "polizas",
    "subplen",
    "cantidads",
    "edadmins",
    "edadmaxes",
    "precios",
    "montos",
    "cantidadmaxpagars",
    "plazos",
    "descripcionseguros",
    "descripcionplen",
    "servicios",
    "tipopagos",
    "numclientebancoppels"
})
@XmlRootElement(name = "row")
public class Row {

    @XmlElement(name = "status")
    protected List<String> statuses;
    @XmlElement(name = "foliotransaccion")
    protected List<String> foliotransaccions;
    @XmlElement(name = "mensaje")
    protected List<String> mensajes;
    @XmlElement(name = "numcliente")
    protected List<String> numclientes;
    @XmlElement(name = "clienteprospecto")
    protected List<String> clienteprospectos;
    @XmlElement(name = "nombre")
    protected List<String> nombres;
    @XmlElement(name = "apellidopaterno")
    protected List<String> apellidopaternos;
    @XmlElement(name = "apellidomaterno")
    protected List<String> apellidomaternos;
    @XmlElement(name = "fechanacimiento")
    protected List<String> fechanacimientos;
    @XmlElement(name = "numcasa")
    protected List<String> numcasas;
    @XmlElement(name = "numcalle")
    protected List<String> numcalles;
    @XmlElement(name = "nomcalle")
    protected List<String> nomcalles;
    @XmlElement(name = "numzona")
    protected List<String> numzonas;
    @XmlElement(name = "nombrezona")
    protected List<String> nombrezonas;
    @XmlElement(name = "numciudad")
    protected List<String> numciudads;
    @XmlElement(name = "nomciudad")
    protected List<String> nomciudads;
    @XmlElement(name = "nommunicipio")
    protected List<String> nommunicipios;
    @XmlElement(name = "complemento")
    protected List<String> complementos;
    @XmlElement(name = "rumbo")
    protected List<String> rumbos;
    @XmlElement(name = "numdeptoointerior")
    protected List<String> numdeptoointeriors;
    @XmlElement(name = "uhcmanzana")
    protected List<String> uhcmanzanas;
    protected List<String> uhcotros;
    @XmlElement(name = "uhcandador")
    protected List<String> uhcandadors;
    @XmlElement(name = "uhcetapa")
    protected List<String> uhcetapas;
    @XmlElement(name = "uhclote")
    protected List<String> uhclotes;
    @XmlElement(name = "uhcedificio")
    protected List<String> uhcedificios;
    @XmlElement(name = "uhcentrada")
    protected List<String> uhcentradas;
    @XmlElement(name = "codigopostal")
    protected List<String> codigopostals;
    @XmlElement(name = "telefonodecasa")
    protected List<String> telefonodecasas;
    @XmlElement(name = "telefonocelular")
    protected List<String> telefonocelulars;
    @XmlElement(name = "telefonotrabajo")
    protected List<String> telefonotrabajos;
    @XmlElement(name = "extensiontrabajo")
    protected List<String> extensiontrabajos;
    @XmlElement(name = "claveseguro")
    protected List<String> claveseguros;
    @XmlElement(name = "tiposeguro")
    protected List<String> tiposeguros;
    protected List<String> cantidadseguros;
    @XmlElement(name = "fechaafiliacion")
    protected List<String> fechaafiliacions;
    @XmlElement(name = "fechavencimiento")
    protected List<String> fechavencimientos;
    @XmlElement(name = "statusseguro")
    protected List<String> statusseguros;
    @XmlElement(name = "costo")
    protected List<String> costos;
    @XmlElement(name = "poliza")
    protected List<String> polizas;
    @XmlElement(name = "subplan")
    protected List<String> subplen;
    @XmlElement(name = "cantidad")
    protected List<String> cantidads;
    @XmlElement(name = "edadmin")
    protected List<String> edadmins;
    @XmlElement(name = "edadmax")
    protected List<String> edadmaxes;
    @XmlElement(name = "precio")
    protected List<String> precios;
    @XmlElement(name = "monto")
    protected List<String> montos;
    @XmlElement(name = "cantidadmaxpagar")
    protected List<String> cantidadmaxpagars;
    @XmlElement(name = "plazo")
    protected List<String> plazos;
    @XmlElement(name = "descripcionseguro")
    protected List<String> descripcionseguros;
    @XmlElement(name = "descripcionplan")
    protected List<String> descripcionplen;
    @XmlElement(name = "servicio")
    protected List<String> servicios;
    @XmlElement(name = "tipopago")
    protected List<String> tipopagos;
    @XmlElement(name = "numclientebancoppel")
    protected List<String> numclientebancoppels;

    /**
     * Gets the value of the statuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatuses() {
        if (statuses == null) {
            statuses = new ArrayList<String>();
        }
        return this.statuses;
    }

    /**
     * Gets the value of the foliotransaccions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foliotransaccions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoliotransaccions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFoliotransaccions() {
        if (foliotransaccions == null) {
            foliotransaccions = new ArrayList<String>();
        }
        return this.foliotransaccions;
    }

    /**
     * Gets the value of the mensajes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mensajes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMensajes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMensajes() {
        if (mensajes == null) {
            mensajes = new ArrayList<String>();
        }
        return this.mensajes;
    }

    /**
     * Gets the value of the numclientes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numclientes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumclientes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumclientes() {
        if (numclientes == null) {
            numclientes = new ArrayList<String>();
        }
        return this.numclientes;
    }

    /**
     * Gets the value of the clienteprospectos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clienteprospectos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClienteprospectos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClienteprospectos() {
        if (clienteprospectos == null) {
            clienteprospectos = new ArrayList<String>();
        }
        return this.clienteprospectos;
    }

    /**
     * Gets the value of the nombres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombres() {
        if (nombres == null) {
            nombres = new ArrayList<String>();
        }
        return this.nombres;
    }

    /**
     * Gets the value of the apellidopaternos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidopaternos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidopaternos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidopaternos() {
        if (apellidopaternos == null) {
            apellidopaternos = new ArrayList<String>();
        }
        return this.apellidopaternos;
    }

    /**
     * Gets the value of the apellidomaternos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidomaternos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidomaternos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidomaternos() {
        if (apellidomaternos == null) {
            apellidomaternos = new ArrayList<String>();
        }
        return this.apellidomaternos;
    }

    /**
     * Gets the value of the fechanacimientos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fechanacimientos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFechanacimientos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFechanacimientos() {
        if (fechanacimientos == null) {
            fechanacimientos = new ArrayList<String>();
        }
        return this.fechanacimientos;
    }

    /**
     * Gets the value of the numcasas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numcasas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumcasas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumcasas() {
        if (numcasas == null) {
            numcasas = new ArrayList<String>();
        }
        return this.numcasas;
    }

    /**
     * Gets the value of the numcalles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numcalles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumcalles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumcalles() {
        if (numcalles == null) {
            numcalles = new ArrayList<String>();
        }
        return this.numcalles;
    }

    /**
     * Gets the value of the nomcalles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nomcalles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNomcalles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNomcalles() {
        if (nomcalles == null) {
            nomcalles = new ArrayList<String>();
        }
        return this.nomcalles;
    }

    /**
     * Gets the value of the numzonas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numzonas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumzonas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumzonas() {
        if (numzonas == null) {
            numzonas = new ArrayList<String>();
        }
        return this.numzonas;
    }

    /**
     * Gets the value of the nombrezonas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombrezonas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombrezonas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombrezonas() {
        if (nombrezonas == null) {
            nombrezonas = new ArrayList<String>();
        }
        return this.nombrezonas;
    }

    /**
     * Gets the value of the numciudads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numciudads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumciudads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumciudads() {
        if (numciudads == null) {
            numciudads = new ArrayList<String>();
        }
        return this.numciudads;
    }

    /**
     * Gets the value of the nomciudads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nomciudads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNomciudads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNomciudads() {
        if (nomciudads == null) {
            nomciudads = new ArrayList<String>();
        }
        return this.nomciudads;
    }

    /**
     * Gets the value of the nommunicipios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nommunicipios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNommunicipios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNommunicipios() {
        if (nommunicipios == null) {
            nommunicipios = new ArrayList<String>();
        }
        return this.nommunicipios;
    }

    /**
     * Gets the value of the complementos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complementos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplementos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComplementos() {
        if (complementos == null) {
            complementos = new ArrayList<String>();
        }
        return this.complementos;
    }

    /**
     * Gets the value of the rumbos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rumbos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRumbos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRumbos() {
        if (rumbos == null) {
            rumbos = new ArrayList<String>();
        }
        return this.rumbos;
    }

    /**
     * Gets the value of the numdeptoointeriors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numdeptoointeriors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumdeptoointeriors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumdeptoointeriors() {
        if (numdeptoointeriors == null) {
            numdeptoointeriors = new ArrayList<String>();
        }
        return this.numdeptoointeriors;
    }

    /**
     * Gets the value of the uhcmanzanas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uhcmanzanas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUhcmanzanas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUhcmanzanas() {
        if (uhcmanzanas == null) {
            uhcmanzanas = new ArrayList<String>();
        }
        return this.uhcmanzanas;
    }

    /**
     * Gets the value of the uhcotros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uhcotros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUhcotros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUhcotros() {
        if (uhcotros == null) {
            uhcotros = new ArrayList<String>();
        }
        return this.uhcotros;
    }

    /**
     * Gets the value of the uhcandadors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uhcandadors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUhcandadors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUhcandadors() {
        if (uhcandadors == null) {
            uhcandadors = new ArrayList<String>();
        }
        return this.uhcandadors;
    }

    /**
     * Gets the value of the uhcetapas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uhcetapas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUhcetapas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUhcetapas() {
        if (uhcetapas == null) {
            uhcetapas = new ArrayList<String>();
        }
        return this.uhcetapas;
    }

    /**
     * Gets the value of the uhclotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uhclotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUhclotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUhclotes() {
        if (uhclotes == null) {
            uhclotes = new ArrayList<String>();
        }
        return this.uhclotes;
    }

    /**
     * Gets the value of the uhcedificios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uhcedificios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUhcedificios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUhcedificios() {
        if (uhcedificios == null) {
            uhcedificios = new ArrayList<String>();
        }
        return this.uhcedificios;
    }

    /**
     * Gets the value of the uhcentradas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uhcentradas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUhcentradas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUhcentradas() {
        if (uhcentradas == null) {
            uhcentradas = new ArrayList<String>();
        }
        return this.uhcentradas;
    }

    /**
     * Gets the value of the codigopostals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigopostals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigopostals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodigopostals() {
        if (codigopostals == null) {
            codigopostals = new ArrayList<String>();
        }
        return this.codigopostals;
    }

    /**
     * Gets the value of the telefonodecasas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonodecasas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonodecasas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefonodecasas() {
        if (telefonodecasas == null) {
            telefonodecasas = new ArrayList<String>();
        }
        return this.telefonodecasas;
    }

    /**
     * Gets the value of the telefonocelulars property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonocelulars property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonocelulars().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefonocelulars() {
        if (telefonocelulars == null) {
            telefonocelulars = new ArrayList<String>();
        }
        return this.telefonocelulars;
    }

    /**
     * Gets the value of the telefonotrabajos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonotrabajos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonotrabajos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefonotrabajos() {
        if (telefonotrabajos == null) {
            telefonotrabajos = new ArrayList<String>();
        }
        return this.telefonotrabajos;
    }

    /**
     * Gets the value of the extensiontrabajos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensiontrabajos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensiontrabajos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtensiontrabajos() {
        if (extensiontrabajos == null) {
            extensiontrabajos = new ArrayList<String>();
        }
        return this.extensiontrabajos;
    }

    /**
     * Gets the value of the claveseguros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claveseguros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaveseguros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClaveseguros() {
        if (claveseguros == null) {
            claveseguros = new ArrayList<String>();
        }
        return this.claveseguros;
    }

    /**
     * Gets the value of the tiposeguros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposeguros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposeguros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTiposeguros() {
        if (tiposeguros == null) {
            tiposeguros = new ArrayList<String>();
        }
        return this.tiposeguros;
    }

    /**
     * Gets the value of the cantidadseguros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cantidadseguros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCantidadseguros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCantidadseguros() {
        if (cantidadseguros == null) {
            cantidadseguros = new ArrayList<String>();
        }
        return this.cantidadseguros;
    }

    /**
     * Gets the value of the fechaafiliacions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fechaafiliacions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFechaafiliacions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFechaafiliacions() {
        if (fechaafiliacions == null) {
            fechaafiliacions = new ArrayList<String>();
        }
        return this.fechaafiliacions;
    }

    /**
     * Gets the value of the fechavencimientos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fechavencimientos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFechavencimientos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFechavencimientos() {
        if (fechavencimientos == null) {
            fechavencimientos = new ArrayList<String>();
        }
        return this.fechavencimientos;
    }

    /**
     * Gets the value of the statusseguros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusseguros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusseguros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatusseguros() {
        if (statusseguros == null) {
            statusseguros = new ArrayList<String>();
        }
        return this.statusseguros;
    }

    /**
     * Gets the value of the costos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCostos() {
        if (costos == null) {
            costos = new ArrayList<String>();
        }
        return this.costos;
    }

    /**
     * Gets the value of the polizas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polizas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolizas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPolizas() {
        if (polizas == null) {
            polizas = new ArrayList<String>();
        }
        return this.polizas;
    }

    /**
     * Gets the value of the subplen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subplen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubplen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubplen() {
        if (subplen == null) {
            subplen = new ArrayList<String>();
        }
        return this.subplen;
    }

    /**
     * Gets the value of the cantidads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cantidads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCantidads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCantidads() {
        if (cantidads == null) {
            cantidads = new ArrayList<String>();
        }
        return this.cantidads;
    }

    /**
     * Gets the value of the edadmins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edadmins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdadmins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEdadmins() {
        if (edadmins == null) {
            edadmins = new ArrayList<String>();
        }
        return this.edadmins;
    }

    /**
     * Gets the value of the edadmaxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edadmaxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdadmaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEdadmaxes() {
        if (edadmaxes == null) {
            edadmaxes = new ArrayList<String>();
        }
        return this.edadmaxes;
    }

    /**
     * Gets the value of the precios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrecios() {
        if (precios == null) {
            precios = new ArrayList<String>();
        }
        return this.precios;
    }

    /**
     * Gets the value of the montos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the montos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMontos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMontos() {
        if (montos == null) {
            montos = new ArrayList<String>();
        }
        return this.montos;
    }

    /**
     * Gets the value of the cantidadmaxpagars property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cantidadmaxpagars property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCantidadmaxpagars().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCantidadmaxpagars() {
        if (cantidadmaxpagars == null) {
            cantidadmaxpagars = new ArrayList<String>();
        }
        return this.cantidadmaxpagars;
    }

    /**
     * Gets the value of the plazos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plazos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlazos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlazos() {
        if (plazos == null) {
            plazos = new ArrayList<String>();
        }
        return this.plazos;
    }

    /**
     * Gets the value of the descripcionseguros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descripcionseguros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescripcionseguros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescripcionseguros() {
        if (descripcionseguros == null) {
            descripcionseguros = new ArrayList<String>();
        }
        return this.descripcionseguros;
    }

    /**
     * Gets the value of the descripcionplen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descripcionplen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescripcionplen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescripcionplen() {
        if (descripcionplen == null) {
            descripcionplen = new ArrayList<String>();
        }
        return this.descripcionplen;
    }

    /**
     * Gets the value of the servicios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServicios() {
        if (servicios == null) {
            servicios = new ArrayList<String>();
        }
        return this.servicios;
    }

    /**
     * Gets the value of the tipopagos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipopagos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipopagos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTipopagos() {
        if (tipopagos == null) {
            tipopagos = new ArrayList<String>();
        }
        return this.tipopagos;
    }

    /**
     * Gets the value of the numclientebancoppels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numclientebancoppels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumclientebancoppels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumclientebancoppels() {
        if (numclientebancoppels == null) {
            numclientebancoppels = new ArrayList<String>();
        }
        return this.numclientebancoppels;
    }

}
