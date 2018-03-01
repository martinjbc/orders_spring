package org.orders.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="DETALLES")  
@Entity
public class Detalles {
	@Id
	@Column(name="Idpedido")
	@GeneratedValue(generator = "detalles_seq")
	@SequenceGenerator(name="detalles_seq", sequenceName="detalles_seq",allocationSize=1)
	private int Idpedido;

	@Column(name="Idproducto")
	private int Idproducto;

	@Column(name="Preciounidad")
	private double Preciounidad;

	@Column(name="Cantidad")
	private int Cantidad;

	@Column(name="Descuento")
	private int Descuento;

	public int getIdpedido() {
		return Idpedido;
	}

	public void setIdpedido(int idpedido) {
		Idpedido = idpedido;
	}

	public int getIdproducto() {
		return Idproducto;
	}

	public void setIdproducto(int idproducto) {
		Idproducto = idproducto;
	}

	public double getPreciounidad() {
		return Preciounidad;
	}

	public void setPreciounidad(double preciounidad) {
		Preciounidad = preciounidad;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getDescuento() {
		return Descuento;
	}

	public void setDescuento(int descuento) {
		Descuento = descuento;
	}
	

}
