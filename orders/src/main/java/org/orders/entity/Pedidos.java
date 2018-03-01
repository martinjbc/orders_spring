package org.orders.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="PEDIDOS")  
@Entity
public class Pedidos {
	@Id
	@Column(name="Idpedido")
	@GeneratedValue(generator = "pedidos_seq")
	@SequenceGenerator(name="pedidos_seq", sequenceName="pedidos_seq",allocationSize=1)
	private int Idpedido;

	@Column(name="Idcliente")
	private int Idcliente;

	@Column(name="Idempleado")
	private int Idempleado;

	@Column(name="Fechapedido")
	private Date Fechapedido;

	@Column(name="Fechaentrega")
	private Date Fechaentrega;

	@Column(name="Fechaenvio")
	private Date Fechaenvio;

	@Column(name="Formaenvio")
	private int Formaenvio;

	@Column(name="Cargo")
	private double Cargo;

	@Column(name="Destinatario")
	private String Destinatario;

	@Column(name="Direcciondestinatario")
	private String Direcciondestinatario;

	@Column(name="Ciudaddestinatario")
	private String Ciudaddestinatario;

	@Column(name="Regiondestinatario")
	private String Regiondestinatario;

	@Column(name="Codpostaldestinatario")
	private String Codpostaldestinatario;

	@Column(name="Paisdestinatario")
	private String Paisdestinatario;

	@Column(name="Monto")
	private double Monto;

	public int getIdpedido() {
		return Idpedido;
	}

	public void setIdpedido(int idpedido) {
		Idpedido = idpedido;
	}

	public int getIdcliente() {
		return Idcliente;
	}

	public void setIdcliente(int idcliente) {
		Idcliente = idcliente;
	}

	public int getIdempleado() {
		return Idempleado;
	}

	public void setIdempleado(int idempleado) {
		Idempleado = idempleado;
	}

	public Date getFechapedido() {
		return Fechapedido;
	}

	public void setFechapedido(Date fechapedido) {
		Fechapedido = fechapedido;
	}

	public Date getFechaentrega() {
		return Fechaentrega;
	}

	public void setFechaentrega(Date fechaentrega) {
		Fechaentrega = fechaentrega;
	}

	public Date getFechaenvio() {
		return Fechaenvio;
	}

	public void setFechaenvio(Date fechaenvio) {
		Fechaenvio = fechaenvio;
	}

	public int getFormaenvio() {
		return Formaenvio;
	}

	public void setFormaenvio(int formaenvio) {
		Formaenvio = formaenvio;
	}

	public double getCargo() {
		return Cargo;
	}

	public void setCargo(double cargo) {
		Cargo = cargo;
	}

	public String getDestinatario() {
		return Destinatario;
	}

	public void setDestinatario(String destinatario) {
		Destinatario = destinatario;
	}

	public String getDirecciondestinatario() {
		return Direcciondestinatario;
	}

	public void setDirecciondestinatario(String direcciondestinatario) {
		Direcciondestinatario = direcciondestinatario;
	}

	public String getCiudaddestinatario() {
		return Ciudaddestinatario;
	}

	public void setCiudaddestinatario(String ciudaddestinatario) {
		Ciudaddestinatario = ciudaddestinatario;
	}

	public String getRegiondestinatario() {
		return Regiondestinatario;
	}

	public void setRegiondestinatario(String regiondestinatario) {
		Regiondestinatario = regiondestinatario;
	}

	public String getCodpostaldestinatario() {
		return Codpostaldestinatario;
	}

	public void setCodpostaldestinatario(String codpostaldestinatario) {
		Codpostaldestinatario = codpostaldestinatario;
	}

	public String getPaisdestinatario() {
		return Paisdestinatario;
	}

	public void setPaisdestinatario(String paisdestinatario) {
		Paisdestinatario = paisdestinatario;
	}

	public double getMonto() {
		return Monto;
	}

	public void setMonto(double monto) {
		Monto = monto;
	}
	
	
}
