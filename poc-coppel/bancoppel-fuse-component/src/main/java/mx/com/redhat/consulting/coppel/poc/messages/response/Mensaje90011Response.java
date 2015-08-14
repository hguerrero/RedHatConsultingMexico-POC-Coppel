package mx.com.redhat.consulting.coppel.poc.messages.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord( separator = "\\|")
@XmlRootElement(name="mensaje90011response")
public class Mensaje90011Response implements Serializable {
	private static final long serialVersionUID = 4683487201822125027L;
	@DataField(pos = 1)
    private String iStatus;
	@DataField(pos = 2)
    private String cApellidoPaterno;
	@DataField(pos = 3)
	private String cApellidoMaterno;
	@DataField(pos = 4)
	private String cNombre;
	@DataField(pos = 5)
	private String cFechaNacimiento;
	@DataField(pos = 6)
	private String iCiudad;
	@DataField(pos = 7)
	private String cNombreCiudad;
	@DataField(pos = 8)
	private String cMunicipio;
	@DataField(pos = 9)
	private String iColonia;
	@DataField(pos = 10)
	private String cNombreZona;
	@DataField(pos = 11)
	private String cNombreCalle;
	@DataField(pos = 12)
	private String iCasa;
	@DataField(pos = 13)
	private String iCliente;
	@DataField(pos = 14)
	private String cRumbo;
	@DataField(pos = 15)
	private String cNumDeptoInterior;
	@DataField(pos = 16)
	private String iUhcManzana;
	@DataField(pos = 17)
	private String iUhcOtros;
	@DataField(pos = 18)
	private String iUhcAndador;
	@DataField(pos = 19)
	private String iUhcEtapa;
	@DataField(pos = 20)
	private String iUhcLote;
	@DataField(pos = 21)
	private String iUhcEdificio;
	@DataField(pos = 22)
	private String iUhcEntrada;
	@DataField(pos = 23)
	private String cComplemento;
	@DataField(pos = 24)
	private String ITelefono;
	@DataField(pos = 25)
	private String ITelefonoCelular;
	@DataField(pos = 26)
	private String ITelefonoTrabajo;
	@DataField(pos = 27)
	private String iExtensionTrabajo;
	@DataField(pos = 28)
	private String iCodigoPostal;
	@DataField(pos = 29)
	private String iOffSetRegreso;

	@XmlElement(name="iStatus")
	public String getiStatus() {
		return iStatus;
	}
	public void setiStatus(String iStatus) {
		this.iStatus = iStatus;
	}
	@XmlElement(name="cApellidoPaterno")
	public String getcApellidoPaterno() {
		return cApellidoPaterno;
	}
	public void setcApellidoPaterno(String cApellidoPaterno) {
		this.cApellidoPaterno = cApellidoPaterno;
	}
	@XmlElement(name="cApellidoMaterno")
	public String getcApellidoMaterno() {
		return cApellidoMaterno;
	}
	public void setcApellidoMaterno(String cApellidoMaterno) {
		this.cApellidoMaterno = cApellidoMaterno;
	}
	@XmlElement(name="cNombre")
	public String getcNombre() {
		return cNombre;
	}
	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}
	@XmlElement(name="cFechaNacimiento")
	public String getcFechaNacimiento() {
		return cFechaNacimiento;
	}
	public void setcFechaNacimiento(String cFechaNacimiento) {
		this.cFechaNacimiento = cFechaNacimiento;
	}
	@XmlElement(name="iCiudad")
	public String getiCiudad() {
		return iCiudad;
	}
	public void setiCiudad(String iCiudad) {
		this.iCiudad = iCiudad;
	}
	@XmlElement(name="cNombreCiudad")
	public String getcNombreCiudad() {
		return cNombreCiudad;
	}
	public void setcNombreCiudad(String cNombreCiudad) {
		this.cNombreCiudad = cNombreCiudad;
	}
	@XmlElement(name="cMunicipio")
	public String getcMunicipio() {
		return cMunicipio;
	}
	public void setcMunicipio(String cMunicipio) {
		this.cMunicipio = cMunicipio;
	}
	@XmlElement(name="iColonia")
	public String getiColonia() {
		return iColonia;
	}
	public void setiColonia(String iColonia) {
		this.iColonia = iColonia;
	}
	@XmlElement(name="cNombreZona")
	public String getcNombreZona() {
		return cNombreZona;
	}
	public void setcNombreZona(String cNombreZona) {
		this.cNombreZona = cNombreZona;
	}
	@XmlElement(name="cNombreCalle")
	public String getcNombreCalle() {
		return cNombreCalle;
	}
	public void setcNombreCalle(String cNombreCalle) {
		this.cNombreCalle = cNombreCalle;
	}
	@XmlElement(name="iCasa")
	public String getiCasa() {
		return iCasa;
	}
	public void setiCasa(String iCasa) {
		this.iCasa = iCasa;
	}
	@XmlElement(name="iCliente")
	public String getiCliente() {
		return iCliente;
	}
	public void setiCliente(String iCliente) {
		this.iCliente = iCliente;
	}
	@XmlElement(name="cRumbo")
	public String getcRumbo() {
		return cRumbo;
	}
	public void setcRumbo(String cRumbo) {
		this.cRumbo = cRumbo;
	}
	@XmlElement(name="cNumDeptoInterior")
	public String getcNumDeptoInterior() {
		return cNumDeptoInterior;
	}
	public void setcNumDeptoInterior(String cNumDeptoInterior) {
		this.cNumDeptoInterior = cNumDeptoInterior;
	}
	@XmlElement(name="iUhcManzana")
	public String getiUhcManzana() {
		return iUhcManzana;
	}
	public void setiUhcManzana(String iUhcManzana) {
		this.iUhcManzana = iUhcManzana;
	}
	@XmlElement(name="iUhcOtros")
	public String getiUhcOtros() {
		return iUhcOtros;
	}
	public void setiUhcOtros(String iUhcOtros) {
		this.iUhcOtros = iUhcOtros;
	}
	@XmlElement(name="iUhcAndador")
	public String getiUhcAndador() {
		return iUhcAndador;
	}
	public void setiUhcAndador(String iUhcAndador) {
		this.iUhcAndador = iUhcAndador;
	}
	@XmlElement(name="iUhcEtapa")
	public String getiUhcEtapa() {
		return iUhcEtapa;
	}
	public void setiUhcEtapa(String iUhcEtapa) {
		this.iUhcEtapa = iUhcEtapa;
	}
	@XmlElement(name="iUhcLote")
	public String getiUhcLote() {
		return iUhcLote;
	}
	public void setiUhcLote(String iUhcLote) {
		this.iUhcLote = iUhcLote;
	}
	@XmlElement(name="iUhcEdificio")
	public String getiUhcEdificio() {
		return iUhcEdificio;
	}
	public void setiUhcEdificio(String iUhcEdificio) {
		this.iUhcEdificio = iUhcEdificio;
	}
	@XmlElement(name="iUhcEntrada")
	public String getiUhcEntrada() {
		return iUhcEntrada;
	}
	public void setiUhcEntrada(String iUhcEntrada) {
		this.iUhcEntrada = iUhcEntrada;
	}
	@XmlElement(name="cComplemento")
	public String getcComplemento() {
		return cComplemento;
	}
	public void setcComplemento(String cComplemento) {
		this.cComplemento = cComplemento;
	}
	@XmlElement(name="ITelefono")
	public String getITelefono() {
		return ITelefono;
	}
	public void setITelefono(String iTelefono) {
		ITelefono = iTelefono;
	}
	@XmlElement(name="ITelefonoCelular")
	public String getITelefonoCelular() {
		return ITelefonoCelular;
	}
	public void setITelefonoCelular(String iTelefonoCelular) {
		ITelefonoCelular = iTelefonoCelular;
	}
	@XmlElement(name="ITelefonoTrabajo")
	public String getITelefonoTrabajo() {
		return ITelefonoTrabajo;
	}
	public void setITelefonoTrabajo(String iTelefonoTrabajo) {
		ITelefonoTrabajo = iTelefonoTrabajo;
	}
	@XmlElement(name="iExtensionTrabajo")
	public String getiExtensionTrabajo() {
		return iExtensionTrabajo;
	}
	public void setiExtensionTrabajo(String iExtensionTrabajo) {
		this.iExtensionTrabajo = iExtensionTrabajo;
	}
	@XmlElement(name="iCodigoPostal")
	public String getiCodigoPostal() {
		return iCodigoPostal;
	}
	public void setiCodigoPostal(String iCodigoPostal) {
		this.iCodigoPostal = iCodigoPostal;
	}
	@XmlElement(name="iOffSetRegreso")
	public String getiOffSetRegreso() {
		return iOffSetRegreso;
	}
	public void setiOffSetRegreso(String iOffSetRegreso) {
		this.iOffSetRegreso = iOffSetRegreso;
	}
}
