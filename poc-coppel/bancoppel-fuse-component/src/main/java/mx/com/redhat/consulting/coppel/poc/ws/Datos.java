
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
 *       &lt;choice>
 *         &lt;element ref="{}atributos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}esperaconsulta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}metodo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nodo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}parametros" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidomaterno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidomaterno1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidomaterno2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidomaterno3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidomaternoprospecto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidomaternoreferencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidopaterno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidopaterno1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidopaterno2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidopaterno3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidopaternoprospecto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}apellidopaternoreferencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}area" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}caja" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}calle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}calletrabajo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}cantidadseguro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}cantidadsegurosant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}cantidadsegurosnueva" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}casa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}casapref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}casatrabajo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}causasitesp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ciudad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ciudadtienda" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ciudadtrabajo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}clave" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}claveseguro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}clientebancoppel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}clienteprospecto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}colonia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}coloniatrabajo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}complemento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}deptointerior" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}efectuo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}empleadoefectuo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}entrecalle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}estadocivil" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fecha" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fechaaltacliente" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fechalineadecreditoreal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fechalineadecreditotope" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fechanacimiento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fechavencimiento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fechaventa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}flagactualizardatos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}flagclientecnexo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}flagcobxtel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}flagdescuentoespecial" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}flagdomiciliacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}flaghuella" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}flaglineacreditoesp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}flaguhc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}folio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}gruposemaforocn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}importe" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ingresomensual" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}limitecredito" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}lineadecreditoreal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}lineadecreditotope" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}lugartrabajo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}mesespagado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}mesestranscurridos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}modelocelulares" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nipadicional1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nipadicional2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}niptitular" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nivellineacreditoreal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nivellineacreditotope" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nombre1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nombre1referencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nombre2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nombre2referencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nombre3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}nombreprospecto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numcliente" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numclienteprospecto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numdeptointeriortrab" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}numdeptoointerior" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}observaciones" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}paraltoriesgo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}parametricocelulares" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}parcelulares" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}parentesco1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}parentesco2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}parentesco3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}parprestamo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}pedirtelefono" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}poliza" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}porcentaje1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}porcentaje2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}porcentaje3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}puntualidad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}recibo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}reposiciontarjeta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}rumbo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}sexo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}situacionespecial" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}solicitud" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}statusafore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}subpuntualidad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}sucursal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telefono" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telefonocasa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telefonocelular" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telefonocliente" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telefonoreferencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telefonotrabajo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telefonotrabajocliente" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}telreferencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}tienda" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}tipomovimiento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}tipomovto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcandador" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcedificio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcentrada" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcetapa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhclote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcmanzana" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}uhcotros" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}tipo" maxOccurs="unbounded" minOccurs="0"/>
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
    "tipos",
    "uhcotros",
    "uhcmanzanas",
    "uhclotes",
    "uhcetapas",
    "uhcentradas",
    "uhcedificios",
    "uhcandadors",
    "tipomovtos",
    "tipomovimientos",
    "tiendas",
    "telreferencias",
    "telefonotrabajoclientes",
    "telefonotrabajos",
    "telefonoreferencias",
    "telefonoclientes",
    "telefonocelulars",
    "telefonocasas",
    "telefonos",
    "sucursals",
    "subpuntualidads",
    "statusafores",
    "solicituds",
    "situacionespecials",
    "sexos",
    "rumbos",
    "reposiciontarjetas",
    "recibos",
    "puntualidads",
    "porcentaje3S",
    "porcentaje2S",
    "porcentaje1S",
    "polizas",
    "pedirtelefonos",
    "parprestamos",
    "parentesco3S",
    "parentesco2S",
    "parentesco1S",
    "parcelulares",
    "parametricocelulares",
    "paraltoriesgos",
    "observaciones",
    "numdeptoointeriors",
    "numdeptointeriortrabs",
    "numclienteprospectos",
    "numclientes",
    "nombreprospectos",
    "nombre3S",
    "nombre2Referencias",
    "nombre2S",
    "nombre1Referencias",
    "nombre1S",
    "nivellineacreditotopes",
    "nivellineacreditoreals",
    "niptitulars",
    "nipadicional2S",
    "nipadicional1S",
    "modelocelulares",
    "mesestranscurridos",
    "mesespagados",
    "lugartrabajos",
    "lineadecreditotopes",
    "lineadecreditoreals",
    "limitecreditos",
    "ingresomensuals",
    "importes",
    "gruposemaforocns",
    "folios",
    "flaguhcs",
    "flaglineacreditoesps",
    "flaghuellas",
    "flagdomiciliacions",
    "flagdescuentoespecials",
    "flagcobxtels",
    "flagclientecnexos",
    "flagactualizardatos",
    "fechaventas",
    "fechavencimientos",
    "fechanacimientos",
    "fechalineadecreditotopes",
    "fechalineadecreditoreals",
    "fechaaltaclientes",
    "fechas",
    "extensions",
    "estadocivils",
    "entrecalles",
    "empleadoefectuos",
    "efectuos",
    "deptointeriors",
    "complementos",
    "coloniatrabajos",
    "colonias",
    "clienteprospectos",
    "clientebancoppels",
    "claveseguros",
    "claves",
    "ciudadtrabajos",
    "ciudadtiendas",
    "ciudads",
    "causasitesps",
    "casatrabajos",
    "casapreves",
    "casas",
    "cantidadsegurosnuevas",
    "cantidadsegurosants",
    "cantidadseguros",
    "calletrabajos",
    "calles",
    "cajas",
    "areas",
    "apellidopaternoreferencias",
    "apellidopaternoprospectos",
    "apellidopaterno3S",
    "apellidopaterno2S",
    "apellidopaterno1S",
    "apellidopaternos",
    "apellidomaternoreferencias",
    "apellidomaternoprospectos",
    "apellidomaterno3S",
    "apellidomaterno2S",
    "apellidomaterno1S",
    "apellidomaternos",
    "parametros",
    "nodos",
    "metodos",
    "esperaconsultas",
    "atributos"
})
@XmlRootElement(name = "Datos")
public class Datos {

    @XmlElement(name = "tipo")
    protected List<String> tipos;
    protected List<String> uhcotros;
    @XmlElement(name = "uhcmanzana")
    protected List<String> uhcmanzanas;
    @XmlElement(name = "uhclote")
    protected List<String> uhclotes;
    @XmlElement(name = "uhcetapa")
    protected List<String> uhcetapas;
    @XmlElement(name = "uhcentrada")
    protected List<String> uhcentradas;
    @XmlElement(name = "uhcedificio")
    protected List<String> uhcedificios;
    @XmlElement(name = "uhcandador")
    protected List<String> uhcandadors;
    @XmlElement(name = "tipomovto")
    protected List<String> tipomovtos;
    @XmlElement(name = "tipomovimiento")
    protected List<String> tipomovimientos;
    @XmlElement(name = "tienda")
    protected List<String> tiendas;
    @XmlElement(name = "telreferencia")
    protected List<String> telreferencias;
    @XmlElement(name = "telefonotrabajocliente")
    protected List<String> telefonotrabajoclientes;
    @XmlElement(name = "telefonotrabajo")
    protected List<String> telefonotrabajos;
    @XmlElement(name = "telefonoreferencia")
    protected List<String> telefonoreferencias;
    @XmlElement(name = "telefonocliente")
    protected List<String> telefonoclientes;
    @XmlElement(name = "telefonocelular")
    protected List<String> telefonocelulars;
    @XmlElement(name = "telefonocasa")
    protected List<String> telefonocasas;
    @XmlElement(name = "telefono")
    protected List<String> telefonos;
    @XmlElement(name = "sucursal")
    protected List<String> sucursals;
    @XmlElement(name = "subpuntualidad")
    protected List<String> subpuntualidads;
    @XmlElement(name = "statusafore")
    protected List<String> statusafores;
    @XmlElement(name = "solicitud")
    protected List<String> solicituds;
    @XmlElement(name = "situacionespecial")
    protected List<String> situacionespecials;
    @XmlElement(name = "sexo")
    protected List<String> sexos;
    @XmlElement(name = "rumbo")
    protected List<String> rumbos;
    @XmlElement(name = "reposiciontarjeta")
    protected List<String> reposiciontarjetas;
    @XmlElement(name = "recibo")
    protected List<String> recibos;
    @XmlElement(name = "puntualidad")
    protected List<String> puntualidads;
    @XmlElement(name = "porcentaje3")
    protected List<String> porcentaje3S;
    @XmlElement(name = "porcentaje2")
    protected List<String> porcentaje2S;
    @XmlElement(name = "porcentaje1")
    protected List<String> porcentaje1S;
    @XmlElement(name = "poliza")
    protected List<String> polizas;
    @XmlElement(name = "pedirtelefono")
    protected List<String> pedirtelefonos;
    @XmlElement(name = "parprestamo")
    protected List<String> parprestamos;
    @XmlElement(name = "parentesco3")
    protected List<String> parentesco3S;
    @XmlElement(name = "parentesco2")
    protected List<String> parentesco2S;
    @XmlElement(name = "parentesco1")
    protected List<String> parentesco1S;
    protected List<String> parcelulares;
    protected List<String> parametricocelulares;
    @XmlElement(name = "paraltoriesgo")
    protected List<String> paraltoriesgos;
    protected List<String> observaciones;
    @XmlElement(name = "numdeptoointerior")
    protected List<String> numdeptoointeriors;
    @XmlElement(name = "numdeptointeriortrab")
    protected List<String> numdeptointeriortrabs;
    @XmlElement(name = "numclienteprospecto")
    protected List<String> numclienteprospectos;
    @XmlElement(name = "numcliente")
    protected List<String> numclientes;
    @XmlElement(name = "nombreprospecto")
    protected List<String> nombreprospectos;
    @XmlElement(name = "nombre3")
    protected List<String> nombre3S;
    @XmlElement(name = "nombre2referencia")
    protected List<String> nombre2Referencias;
    @XmlElement(name = "nombre2")
    protected List<String> nombre2S;
    @XmlElement(name = "nombre1referencia")
    protected List<String> nombre1Referencias;
    @XmlElement(name = "nombre1")
    protected List<String> nombre1S;
    @XmlElement(name = "nivellineacreditotope")
    protected List<String> nivellineacreditotopes;
    @XmlElement(name = "nivellineacreditoreal")
    protected List<String> nivellineacreditoreals;
    @XmlElement(name = "niptitular")
    protected List<String> niptitulars;
    @XmlElement(name = "nipadicional2")
    protected List<String> nipadicional2S;
    @XmlElement(name = "nipadicional1")
    protected List<String> nipadicional1S;
    protected List<String> modelocelulares;
    protected List<String> mesestranscurridos;
    @XmlElement(name = "mesespagado")
    protected List<String> mesespagados;
    @XmlElement(name = "lugartrabajo")
    protected List<String> lugartrabajos;
    @XmlElement(name = "lineadecreditotope")
    protected List<String> lineadecreditotopes;
    @XmlElement(name = "lineadecreditoreal")
    protected List<String> lineadecreditoreals;
    @XmlElement(name = "limitecredito")
    protected List<String> limitecreditos;
    @XmlElement(name = "ingresomensual")
    protected List<String> ingresomensuals;
    @XmlElement(name = "importe")
    protected List<String> importes;
    @XmlElement(name = "gruposemaforocn")
    protected List<String> gruposemaforocns;
    @XmlElement(name = "folio")
    protected List<String> folios;
    @XmlElement(name = "flaguhc")
    protected List<String> flaguhcs;
    @XmlElement(name = "flaglineacreditoesp")
    protected List<String> flaglineacreditoesps;
    @XmlElement(name = "flaghuella")
    protected List<String> flaghuellas;
    @XmlElement(name = "flagdomiciliacion")
    protected List<String> flagdomiciliacions;
    @XmlElement(name = "flagdescuentoespecial")
    protected List<String> flagdescuentoespecials;
    @XmlElement(name = "flagcobxtel")
    protected List<String> flagcobxtels;
    @XmlElement(name = "flagclientecnexo")
    protected List<String> flagclientecnexos;
    protected List<String> flagactualizardatos;
    @XmlElement(name = "fechaventa")
    protected List<String> fechaventas;
    @XmlElement(name = "fechavencimiento")
    protected List<String> fechavencimientos;
    @XmlElement(name = "fechanacimiento")
    protected List<String> fechanacimientos;
    @XmlElement(name = "fechalineadecreditotope")
    protected List<String> fechalineadecreditotopes;
    @XmlElement(name = "fechalineadecreditoreal")
    protected List<String> fechalineadecreditoreals;
    @XmlElement(name = "fechaaltacliente")
    protected List<String> fechaaltaclientes;
    @XmlElement(name = "fecha")
    protected List<String> fechas;
    @XmlElement(name = "extension")
    protected List<String> extensions;
    @XmlElement(name = "estadocivil")
    protected List<String> estadocivils;
    @XmlElement(name = "entrecalle")
    protected List<String> entrecalles;
    @XmlElement(name = "empleadoefectuo")
    protected List<String> empleadoefectuos;
    @XmlElement(name = "efectuo")
    protected List<String> efectuos;
    @XmlElement(name = "deptointerior")
    protected List<String> deptointeriors;
    @XmlElement(name = "complemento")
    protected List<String> complementos;
    @XmlElement(name = "coloniatrabajo")
    protected List<String> coloniatrabajos;
    @XmlElement(name = "colonia")
    protected List<String> colonias;
    @XmlElement(name = "clienteprospecto")
    protected List<String> clienteprospectos;
    @XmlElement(name = "clientebancoppel")
    protected List<String> clientebancoppels;
    @XmlElement(name = "claveseguro")
    protected List<String> claveseguros;
    @XmlElement(name = "clave")
    protected List<String> claves;
    @XmlElement(name = "ciudadtrabajo")
    protected List<String> ciudadtrabajos;
    @XmlElement(name = "ciudadtienda")
    protected List<String> ciudadtiendas;
    @XmlElement(name = "ciudad")
    protected List<String> ciudads;
    @XmlElement(name = "causasitesp")
    protected List<String> causasitesps;
    @XmlElement(name = "casatrabajo")
    protected List<String> casatrabajos;
    @XmlElement(name = "casapref")
    protected List<String> casapreves;
    @XmlElement(name = "casa")
    protected List<String> casas;
    @XmlElement(name = "cantidadsegurosnueva")
    protected List<String> cantidadsegurosnuevas;
    @XmlElement(name = "cantidadsegurosant")
    protected List<String> cantidadsegurosants;
    @XmlElement(name = "cantidadseguro")
    protected List<String> cantidadseguros;
    @XmlElement(name = "calletrabajo")
    protected List<String> calletrabajos;
    @XmlElement(name = "calle")
    protected List<String> calles;
    @XmlElement(name = "caja")
    protected List<String> cajas;
    @XmlElement(name = "area")
    protected List<String> areas;
    @XmlElement(name = "apellidopaternoreferencia")
    protected List<String> apellidopaternoreferencias;
    @XmlElement(name = "apellidopaternoprospecto")
    protected List<String> apellidopaternoprospectos;
    @XmlElement(name = "apellidopaterno3")
    protected List<String> apellidopaterno3S;
    @XmlElement(name = "apellidopaterno2")
    protected List<String> apellidopaterno2S;
    @XmlElement(name = "apellidopaterno1")
    protected List<String> apellidopaterno1S;
    @XmlElement(name = "apellidopaterno")
    protected List<String> apellidopaternos;
    @XmlElement(name = "apellidomaternoreferencia")
    protected List<String> apellidomaternoreferencias;
    @XmlElement(name = "apellidomaternoprospecto")
    protected List<String> apellidomaternoprospectos;
    @XmlElement(name = "apellidomaterno3")
    protected List<String> apellidomaterno3S;
    @XmlElement(name = "apellidomaterno2")
    protected List<String> apellidomaterno2S;
    @XmlElement(name = "apellidomaterno1")
    protected List<String> apellidomaterno1S;
    @XmlElement(name = "apellidomaterno")
    protected List<String> apellidomaternos;
    protected List<String> parametros;
    @XmlElement(name = "nodo")
    protected List<String> nodos;
    @XmlElement(name = "metodo")
    protected List<String> metodos;
    @XmlElement(name = "esperaconsulta")
    protected List<String> esperaconsultas;
    protected List<String> atributos;

    /**
     * Gets the value of the tipos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTipos() {
        if (tipos == null) {
            tipos = new ArrayList<String>();
        }
        return this.tipos;
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
     * Gets the value of the tipomovtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipomovtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipomovtos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTipomovtos() {
        if (tipomovtos == null) {
            tipomovtos = new ArrayList<String>();
        }
        return this.tipomovtos;
    }

    /**
     * Gets the value of the tipomovimientos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipomovimientos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipomovimientos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTipomovimientos() {
        if (tipomovimientos == null) {
            tipomovimientos = new ArrayList<String>();
        }
        return this.tipomovimientos;
    }

    /**
     * Gets the value of the tiendas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiendas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiendas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTiendas() {
        if (tiendas == null) {
            tiendas = new ArrayList<String>();
        }
        return this.tiendas;
    }

    /**
     * Gets the value of the telreferencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telreferencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelreferencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelreferencias() {
        if (telreferencias == null) {
            telreferencias = new ArrayList<String>();
        }
        return this.telreferencias;
    }

    /**
     * Gets the value of the telefonotrabajoclientes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonotrabajoclientes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonotrabajoclientes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefonotrabajoclientes() {
        if (telefonotrabajoclientes == null) {
            telefonotrabajoclientes = new ArrayList<String>();
        }
        return this.telefonotrabajoclientes;
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
     * Gets the value of the telefonoreferencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonoreferencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonoreferencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefonoreferencias() {
        if (telefonoreferencias == null) {
            telefonoreferencias = new ArrayList<String>();
        }
        return this.telefonoreferencias;
    }

    /**
     * Gets the value of the telefonoclientes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonoclientes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonoclientes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefonoclientes() {
        if (telefonoclientes == null) {
            telefonoclientes = new ArrayList<String>();
        }
        return this.telefonoclientes;
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
     * Gets the value of the telefonocasas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonocasas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonocasas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefonocasas() {
        if (telefonocasas == null) {
            telefonocasas = new ArrayList<String>();
        }
        return this.telefonocasas;
    }

    /**
     * Gets the value of the telefonos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefonos() {
        if (telefonos == null) {
            telefonos = new ArrayList<String>();
        }
        return this.telefonos;
    }

    /**
     * Gets the value of the sucursals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sucursals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSucursals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSucursals() {
        if (sucursals == null) {
            sucursals = new ArrayList<String>();
        }
        return this.sucursals;
    }

    /**
     * Gets the value of the subpuntualidads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subpuntualidads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubpuntualidads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubpuntualidads() {
        if (subpuntualidads == null) {
            subpuntualidads = new ArrayList<String>();
        }
        return this.subpuntualidads;
    }

    /**
     * Gets the value of the statusafores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusafores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusafores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatusafores() {
        if (statusafores == null) {
            statusafores = new ArrayList<String>();
        }
        return this.statusafores;
    }

    /**
     * Gets the value of the solicituds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicituds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicituds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSolicituds() {
        if (solicituds == null) {
            solicituds = new ArrayList<String>();
        }
        return this.solicituds;
    }

    /**
     * Gets the value of the situacionespecials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situacionespecials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituacionespecials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSituacionespecials() {
        if (situacionespecials == null) {
            situacionespecials = new ArrayList<String>();
        }
        return this.situacionespecials;
    }

    /**
     * Gets the value of the sexos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sexos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSexos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSexos() {
        if (sexos == null) {
            sexos = new ArrayList<String>();
        }
        return this.sexos;
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
     * Gets the value of the reposiciontarjetas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reposiciontarjetas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReposiciontarjetas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReposiciontarjetas() {
        if (reposiciontarjetas == null) {
            reposiciontarjetas = new ArrayList<String>();
        }
        return this.reposiciontarjetas;
    }

    /**
     * Gets the value of the recibos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recibos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecibos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecibos() {
        if (recibos == null) {
            recibos = new ArrayList<String>();
        }
        return this.recibos;
    }

    /**
     * Gets the value of the puntualidads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the puntualidads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPuntualidads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPuntualidads() {
        if (puntualidads == null) {
            puntualidads = new ArrayList<String>();
        }
        return this.puntualidads;
    }

    /**
     * Gets the value of the porcentaje3S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the porcentaje3S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPorcentaje3s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPorcentaje3s() {
        if (porcentaje3S == null) {
            porcentaje3S = new ArrayList<String>();
        }
        return this.porcentaje3S;
    }

    /**
     * Gets the value of the porcentaje2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the porcentaje2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPorcentaje2s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPorcentaje2s() {
        if (porcentaje2S == null) {
            porcentaje2S = new ArrayList<String>();
        }
        return this.porcentaje2S;
    }

    /**
     * Gets the value of the porcentaje1S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the porcentaje1S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPorcentaje1s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPorcentaje1s() {
        if (porcentaje1S == null) {
            porcentaje1S = new ArrayList<String>();
        }
        return this.porcentaje1S;
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
     * Gets the value of the pedirtelefonos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedirtelefonos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedirtelefonos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPedirtelefonos() {
        if (pedirtelefonos == null) {
            pedirtelefonos = new ArrayList<String>();
        }
        return this.pedirtelefonos;
    }

    /**
     * Gets the value of the parprestamos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parprestamos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParprestamos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParprestamos() {
        if (parprestamos == null) {
            parprestamos = new ArrayList<String>();
        }
        return this.parprestamos;
    }

    /**
     * Gets the value of the parentesco3S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentesco3S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentesco3s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParentesco3s() {
        if (parentesco3S == null) {
            parentesco3S = new ArrayList<String>();
        }
        return this.parentesco3S;
    }

    /**
     * Gets the value of the parentesco2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentesco2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentesco2s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParentesco2s() {
        if (parentesco2S == null) {
            parentesco2S = new ArrayList<String>();
        }
        return this.parentesco2S;
    }

    /**
     * Gets the value of the parentesco1S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentesco1S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentesco1s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParentesco1s() {
        if (parentesco1S == null) {
            parentesco1S = new ArrayList<String>();
        }
        return this.parentesco1S;
    }

    /**
     * Gets the value of the parcelulares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parcelulares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParcelulares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParcelulares() {
        if (parcelulares == null) {
            parcelulares = new ArrayList<String>();
        }
        return this.parcelulares;
    }

    /**
     * Gets the value of the parametricocelulares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametricocelulares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametricocelulares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParametricocelulares() {
        if (parametricocelulares == null) {
            parametricocelulares = new ArrayList<String>();
        }
        return this.parametricocelulares;
    }

    /**
     * Gets the value of the paraltoriesgos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paraltoriesgos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParaltoriesgos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParaltoriesgos() {
        if (paraltoriesgos == null) {
            paraltoriesgos = new ArrayList<String>();
        }
        return this.paraltoriesgos;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObservaciones() {
        if (observaciones == null) {
            observaciones = new ArrayList<String>();
        }
        return this.observaciones;
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
     * Gets the value of the numdeptointeriortrabs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numdeptointeriortrabs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumdeptointeriortrabs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumdeptointeriortrabs() {
        if (numdeptointeriortrabs == null) {
            numdeptointeriortrabs = new ArrayList<String>();
        }
        return this.numdeptointeriortrabs;
    }

    /**
     * Gets the value of the numclienteprospectos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numclienteprospectos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumclienteprospectos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumclienteprospectos() {
        if (numclienteprospectos == null) {
            numclienteprospectos = new ArrayList<String>();
        }
        return this.numclienteprospectos;
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
     * Gets the value of the nombreprospectos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombreprospectos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombreprospectos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombreprospectos() {
        if (nombreprospectos == null) {
            nombreprospectos = new ArrayList<String>();
        }
        return this.nombreprospectos;
    }

    /**
     * Gets the value of the nombre3S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombre3S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombre3s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombre3s() {
        if (nombre3S == null) {
            nombre3S = new ArrayList<String>();
        }
        return this.nombre3S;
    }

    /**
     * Gets the value of the nombre2Referencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombre2Referencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombre2Referencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombre2Referencias() {
        if (nombre2Referencias == null) {
            nombre2Referencias = new ArrayList<String>();
        }
        return this.nombre2Referencias;
    }

    /**
     * Gets the value of the nombre2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombre2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombre2s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombre2s() {
        if (nombre2S == null) {
            nombre2S = new ArrayList<String>();
        }
        return this.nombre2S;
    }

    /**
     * Gets the value of the nombre1Referencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombre1Referencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombre1Referencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombre1Referencias() {
        if (nombre1Referencias == null) {
            nombre1Referencias = new ArrayList<String>();
        }
        return this.nombre1Referencias;
    }

    /**
     * Gets the value of the nombre1S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombre1S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombre1s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombre1s() {
        if (nombre1S == null) {
            nombre1S = new ArrayList<String>();
        }
        return this.nombre1S;
    }

    /**
     * Gets the value of the nivellineacreditotopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nivellineacreditotopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNivellineacreditotopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNivellineacreditotopes() {
        if (nivellineacreditotopes == null) {
            nivellineacreditotopes = new ArrayList<String>();
        }
        return this.nivellineacreditotopes;
    }

    /**
     * Gets the value of the nivellineacreditoreals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nivellineacreditoreals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNivellineacreditoreals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNivellineacreditoreals() {
        if (nivellineacreditoreals == null) {
            nivellineacreditoreals = new ArrayList<String>();
        }
        return this.nivellineacreditoreals;
    }

    /**
     * Gets the value of the niptitulars property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the niptitulars property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNiptitulars().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNiptitulars() {
        if (niptitulars == null) {
            niptitulars = new ArrayList<String>();
        }
        return this.niptitulars;
    }

    /**
     * Gets the value of the nipadicional2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nipadicional2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNipadicional2s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNipadicional2s() {
        if (nipadicional2S == null) {
            nipadicional2S = new ArrayList<String>();
        }
        return this.nipadicional2S;
    }

    /**
     * Gets the value of the nipadicional1S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nipadicional1S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNipadicional1s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNipadicional1s() {
        if (nipadicional1S == null) {
            nipadicional1S = new ArrayList<String>();
        }
        return this.nipadicional1S;
    }

    /**
     * Gets the value of the modelocelulares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelocelulares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelocelulares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getModelocelulares() {
        if (modelocelulares == null) {
            modelocelulares = new ArrayList<String>();
        }
        return this.modelocelulares;
    }

    /**
     * Gets the value of the mesestranscurridos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mesestranscurridos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMesestranscurridos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMesestranscurridos() {
        if (mesestranscurridos == null) {
            mesestranscurridos = new ArrayList<String>();
        }
        return this.mesestranscurridos;
    }

    /**
     * Gets the value of the mesespagados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mesespagados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMesespagados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMesespagados() {
        if (mesespagados == null) {
            mesespagados = new ArrayList<String>();
        }
        return this.mesespagados;
    }

    /**
     * Gets the value of the lugartrabajos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lugartrabajos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLugartrabajos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLugartrabajos() {
        if (lugartrabajos == null) {
            lugartrabajos = new ArrayList<String>();
        }
        return this.lugartrabajos;
    }

    /**
     * Gets the value of the lineadecreditotopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineadecreditotopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineadecreditotopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLineadecreditotopes() {
        if (lineadecreditotopes == null) {
            lineadecreditotopes = new ArrayList<String>();
        }
        return this.lineadecreditotopes;
    }

    /**
     * Gets the value of the lineadecreditoreals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineadecreditoreals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineadecreditoreals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLineadecreditoreals() {
        if (lineadecreditoreals == null) {
            lineadecreditoreals = new ArrayList<String>();
        }
        return this.lineadecreditoreals;
    }

    /**
     * Gets the value of the limitecreditos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitecreditos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitecreditos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLimitecreditos() {
        if (limitecreditos == null) {
            limitecreditos = new ArrayList<String>();
        }
        return this.limitecreditos;
    }

    /**
     * Gets the value of the ingresomensuals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingresomensuals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngresomensuals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIngresomensuals() {
        if (ingresomensuals == null) {
            ingresomensuals = new ArrayList<String>();
        }
        return this.ingresomensuals;
    }

    /**
     * Gets the value of the importes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImportes() {
        if (importes == null) {
            importes = new ArrayList<String>();
        }
        return this.importes;
    }

    /**
     * Gets the value of the gruposemaforocns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gruposemaforocns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGruposemaforocns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGruposemaforocns() {
        if (gruposemaforocns == null) {
            gruposemaforocns = new ArrayList<String>();
        }
        return this.gruposemaforocns;
    }

    /**
     * Gets the value of the folios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFolios() {
        if (folios == null) {
            folios = new ArrayList<String>();
        }
        return this.folios;
    }

    /**
     * Gets the value of the flaguhcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flaguhcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlaguhcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlaguhcs() {
        if (flaguhcs == null) {
            flaguhcs = new ArrayList<String>();
        }
        return this.flaguhcs;
    }

    /**
     * Gets the value of the flaglineacreditoesps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flaglineacreditoesps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlaglineacreditoesps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlaglineacreditoesps() {
        if (flaglineacreditoesps == null) {
            flaglineacreditoesps = new ArrayList<String>();
        }
        return this.flaglineacreditoesps;
    }

    /**
     * Gets the value of the flaghuellas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flaghuellas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlaghuellas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlaghuellas() {
        if (flaghuellas == null) {
            flaghuellas = new ArrayList<String>();
        }
        return this.flaghuellas;
    }

    /**
     * Gets the value of the flagdomiciliacions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flagdomiciliacions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlagdomiciliacions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlagdomiciliacions() {
        if (flagdomiciliacions == null) {
            flagdomiciliacions = new ArrayList<String>();
        }
        return this.flagdomiciliacions;
    }

    /**
     * Gets the value of the flagdescuentoespecials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flagdescuentoespecials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlagdescuentoespecials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlagdescuentoespecials() {
        if (flagdescuentoespecials == null) {
            flagdescuentoespecials = new ArrayList<String>();
        }
        return this.flagdescuentoespecials;
    }

    /**
     * Gets the value of the flagcobxtels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flagcobxtels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlagcobxtels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlagcobxtels() {
        if (flagcobxtels == null) {
            flagcobxtels = new ArrayList<String>();
        }
        return this.flagcobxtels;
    }

    /**
     * Gets the value of the flagclientecnexos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flagclientecnexos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlagclientecnexos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlagclientecnexos() {
        if (flagclientecnexos == null) {
            flagclientecnexos = new ArrayList<String>();
        }
        return this.flagclientecnexos;
    }

    /**
     * Gets the value of the flagactualizardatos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flagactualizardatos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlagactualizardatos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlagactualizardatos() {
        if (flagactualizardatos == null) {
            flagactualizardatos = new ArrayList<String>();
        }
        return this.flagactualizardatos;
    }

    /**
     * Gets the value of the fechaventas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fechaventas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFechaventas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFechaventas() {
        if (fechaventas == null) {
            fechaventas = new ArrayList<String>();
        }
        return this.fechaventas;
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
     * Gets the value of the fechalineadecreditotopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fechalineadecreditotopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFechalineadecreditotopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFechalineadecreditotopes() {
        if (fechalineadecreditotopes == null) {
            fechalineadecreditotopes = new ArrayList<String>();
        }
        return this.fechalineadecreditotopes;
    }

    /**
     * Gets the value of the fechalineadecreditoreals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fechalineadecreditoreals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFechalineadecreditoreals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFechalineadecreditoreals() {
        if (fechalineadecreditoreals == null) {
            fechalineadecreditoreals = new ArrayList<String>();
        }
        return this.fechalineadecreditoreals;
    }

    /**
     * Gets the value of the fechaaltaclientes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fechaaltaclientes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFechaaltaclientes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFechaaltaclientes() {
        if (fechaaltaclientes == null) {
            fechaaltaclientes = new ArrayList<String>();
        }
        return this.fechaaltaclientes;
    }

    /**
     * Gets the value of the fechas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fechas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFechas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFechas() {
        if (fechas == null) {
            fechas = new ArrayList<String>();
        }
        return this.fechas;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<String>();
        }
        return this.extensions;
    }

    /**
     * Gets the value of the estadocivils property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estadocivils property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstadocivils().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEstadocivils() {
        if (estadocivils == null) {
            estadocivils = new ArrayList<String>();
        }
        return this.estadocivils;
    }

    /**
     * Gets the value of the entrecalles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entrecalles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntrecalles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEntrecalles() {
        if (entrecalles == null) {
            entrecalles = new ArrayList<String>();
        }
        return this.entrecalles;
    }

    /**
     * Gets the value of the empleadoefectuos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empleadoefectuos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpleadoefectuos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmpleadoefectuos() {
        if (empleadoefectuos == null) {
            empleadoefectuos = new ArrayList<String>();
        }
        return this.empleadoefectuos;
    }

    /**
     * Gets the value of the efectuos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the efectuos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEfectuos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEfectuos() {
        if (efectuos == null) {
            efectuos = new ArrayList<String>();
        }
        return this.efectuos;
    }

    /**
     * Gets the value of the deptointeriors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deptointeriors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeptointeriors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeptointeriors() {
        if (deptointeriors == null) {
            deptointeriors = new ArrayList<String>();
        }
        return this.deptointeriors;
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
     * Gets the value of the coloniatrabajos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coloniatrabajos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColoniatrabajos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColoniatrabajos() {
        if (coloniatrabajos == null) {
            coloniatrabajos = new ArrayList<String>();
        }
        return this.coloniatrabajos;
    }

    /**
     * Gets the value of the colonias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colonias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColonias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColonias() {
        if (colonias == null) {
            colonias = new ArrayList<String>();
        }
        return this.colonias;
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
     * Gets the value of the clientebancoppels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientebancoppels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientebancoppels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClientebancoppels() {
        if (clientebancoppels == null) {
            clientebancoppels = new ArrayList<String>();
        }
        return this.clientebancoppels;
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
     * Gets the value of the claves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClaves() {
        if (claves == null) {
            claves = new ArrayList<String>();
        }
        return this.claves;
    }

    /**
     * Gets the value of the ciudadtrabajos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciudadtrabajos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiudadtrabajos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCiudadtrabajos() {
        if (ciudadtrabajos == null) {
            ciudadtrabajos = new ArrayList<String>();
        }
        return this.ciudadtrabajos;
    }

    /**
     * Gets the value of the ciudadtiendas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciudadtiendas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiudadtiendas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCiudadtiendas() {
        if (ciudadtiendas == null) {
            ciudadtiendas = new ArrayList<String>();
        }
        return this.ciudadtiendas;
    }

    /**
     * Gets the value of the ciudads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciudads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiudads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCiudads() {
        if (ciudads == null) {
            ciudads = new ArrayList<String>();
        }
        return this.ciudads;
    }

    /**
     * Gets the value of the causasitesps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the causasitesps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCausasitesps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCausasitesps() {
        if (causasitesps == null) {
            causasitesps = new ArrayList<String>();
        }
        return this.causasitesps;
    }

    /**
     * Gets the value of the casatrabajos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the casatrabajos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCasatrabajos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCasatrabajos() {
        if (casatrabajos == null) {
            casatrabajos = new ArrayList<String>();
        }
        return this.casatrabajos;
    }

    /**
     * Gets the value of the casapreves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the casapreves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCasapreves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCasapreves() {
        if (casapreves == null) {
            casapreves = new ArrayList<String>();
        }
        return this.casapreves;
    }

    /**
     * Gets the value of the casas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the casas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCasas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCasas() {
        if (casas == null) {
            casas = new ArrayList<String>();
        }
        return this.casas;
    }

    /**
     * Gets the value of the cantidadsegurosnuevas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cantidadsegurosnuevas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCantidadsegurosnuevas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCantidadsegurosnuevas() {
        if (cantidadsegurosnuevas == null) {
            cantidadsegurosnuevas = new ArrayList<String>();
        }
        return this.cantidadsegurosnuevas;
    }

    /**
     * Gets the value of the cantidadsegurosants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cantidadsegurosants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCantidadsegurosants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCantidadsegurosants() {
        if (cantidadsegurosants == null) {
            cantidadsegurosants = new ArrayList<String>();
        }
        return this.cantidadsegurosants;
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
     * Gets the value of the calletrabajos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calletrabajos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalletrabajos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCalletrabajos() {
        if (calletrabajos == null) {
            calletrabajos = new ArrayList<String>();
        }
        return this.calletrabajos;
    }

    /**
     * Gets the value of the calles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCalles() {
        if (calles == null) {
            calles = new ArrayList<String>();
        }
        return this.calles;
    }

    /**
     * Gets the value of the cajas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cajas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCajas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCajas() {
        if (cajas == null) {
            cajas = new ArrayList<String>();
        }
        return this.cajas;
    }

    /**
     * Gets the value of the areas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAreas() {
        if (areas == null) {
            areas = new ArrayList<String>();
        }
        return this.areas;
    }

    /**
     * Gets the value of the apellidopaternoreferencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidopaternoreferencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidopaternoreferencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidopaternoreferencias() {
        if (apellidopaternoreferencias == null) {
            apellidopaternoreferencias = new ArrayList<String>();
        }
        return this.apellidopaternoreferencias;
    }

    /**
     * Gets the value of the apellidopaternoprospectos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidopaternoprospectos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidopaternoprospectos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidopaternoprospectos() {
        if (apellidopaternoprospectos == null) {
            apellidopaternoprospectos = new ArrayList<String>();
        }
        return this.apellidopaternoprospectos;
    }

    /**
     * Gets the value of the apellidopaterno3S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidopaterno3S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidopaterno3s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidopaterno3s() {
        if (apellidopaterno3S == null) {
            apellidopaterno3S = new ArrayList<String>();
        }
        return this.apellidopaterno3S;
    }

    /**
     * Gets the value of the apellidopaterno2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidopaterno2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidopaterno2s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidopaterno2s() {
        if (apellidopaterno2S == null) {
            apellidopaterno2S = new ArrayList<String>();
        }
        return this.apellidopaterno2S;
    }

    /**
     * Gets the value of the apellidopaterno1S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidopaterno1S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidopaterno1s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidopaterno1s() {
        if (apellidopaterno1S == null) {
            apellidopaterno1S = new ArrayList<String>();
        }
        return this.apellidopaterno1S;
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
     * Gets the value of the apellidomaternoreferencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidomaternoreferencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidomaternoreferencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidomaternoreferencias() {
        if (apellidomaternoreferencias == null) {
            apellidomaternoreferencias = new ArrayList<String>();
        }
        return this.apellidomaternoreferencias;
    }

    /**
     * Gets the value of the apellidomaternoprospectos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidomaternoprospectos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidomaternoprospectos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidomaternoprospectos() {
        if (apellidomaternoprospectos == null) {
            apellidomaternoprospectos = new ArrayList<String>();
        }
        return this.apellidomaternoprospectos;
    }

    /**
     * Gets the value of the apellidomaterno3S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidomaterno3S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidomaterno3s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidomaterno3s() {
        if (apellidomaterno3S == null) {
            apellidomaterno3S = new ArrayList<String>();
        }
        return this.apellidomaterno3S;
    }

    /**
     * Gets the value of the apellidomaterno2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidomaterno2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidomaterno2s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidomaterno2s() {
        if (apellidomaterno2S == null) {
            apellidomaterno2S = new ArrayList<String>();
        }
        return this.apellidomaterno2S;
    }

    /**
     * Gets the value of the apellidomaterno1S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellidomaterno1S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellidomaterno1s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellidomaterno1s() {
        if (apellidomaterno1S == null) {
            apellidomaterno1S = new ArrayList<String>();
        }
        return this.apellidomaterno1S;
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

}
