package mx.com.redhat.consulting.coppel.poc.messages.request;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord( separator = "\\|")
@XmlRootElement(name="mensaje90011request")
public class Mensaje90011Request implements Serializable {
	private static final long serialVersionUID = -9098771261747277279L;
	@DataField(pos = 1)
	private int iClave;
	@DataField(pos = 2)
	private String cSubClave;
	@DataField(pos = 3)
	private long lValorSeguridad;
	@DataField(pos = 4)
	private int iTienda;
	@DataField(pos = 5)
	private String cApellidoPaterno;
	@DataField(pos = 6)
	private String cApellidoMaterno;
	@DataField(pos = 7)
	private String cNombre;
	@DataField(pos = 8)
	private int iFechaNacimiento;
	@DataField(pos = 9)
	private String cHuellaDerecha;
	@DataField(pos = 10)
	private int iOffset;
	@DataField(pos = 11)
	private String cIPMaquina;
	@DataField(pos = 12)
	private String cMAC;
	@DataField(pos = 13)
	private long iEmpleado;

	@XmlElement(name="iclave")
	public int getiClave() {
		return iClave;
	}
	public void setiClave(int iClave) {
		this.iClave = iClave;
	}
	@XmlElement(name="cSubClave")
	public String getcSubClave() {
		return cSubClave;
	}
	public void setcSubClave(String cSubClave) {
		this.cSubClave = cSubClave;
	}
	@XmlElement(name="lValorSeguridad")
	public long getlValorSeguridad() {
		return lValorSeguridad;
	}
	public void setlValorSeguridad(long lValorSeguridad) {
		this.lValorSeguridad = lValorSeguridad;
	}
	@XmlElement(name="iTienda")
	public int getiTienda() {
		return iTienda;
	}
	public void setiTienda(int iTienda) {
		this.iTienda = iTienda;
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
	@XmlElement(name="iFechaNacimiento")
	public int getiFechaNacimiento() {
		return iFechaNacimiento;
	}
	public void setiFechaNacimiento(int iFechaNacimiento) {
		this.iFechaNacimiento = iFechaNacimiento;
	}
	@XmlElement(name="cHuellaDerecha")
	public String getcHuellaDerecha() {
		return cHuellaDerecha;
	}
	public void setcHuellaDerecha(String cHuellaDerecha) {
		this.cHuellaDerecha = cHuellaDerecha;
	}
	@XmlElement(name="iOffset")
	public int getiOffset() {
		return iOffset;
	}
	public void setiOffset(int iOffset) {
		this.iOffset = iOffset;
	}
	@XmlElement(name="cIPMaquina")
	public String getcIPMaquina() {
		return cIPMaquina;
	}
	public void setcIPMaquina(String cIPMaquina) {
		this.cIPMaquina = cIPMaquina;
	}
	@XmlElement(name="cMAC")
	public String getcMAC() {
		return cMAC;
	}
	public void setcMAC(String cMAC) {
		this.cMAC = cMAC;
	}
	@XmlElement(name="iEmpleado")
	public long getiEmpleado() {
		return iEmpleado;
	}
	public void setiEmpleado(long iEmpleado) {
		this.iEmpleado = iEmpleado;
	}

}
