package com.proyecto1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Detallesfacturas")
public class DetallesFactura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int idint;
	private String refFac;
	private String refePro;
	private int cantidad;
	private double precio;
	private double subtotal;
	
	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@ManyToOne
	@JoinColumn(name = "factura_id")
	private Factura factura;

	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public int getIdint() {
		return idint;
	}
	public void setIdint(int idint) {
		this.idint = idint;
	}
	public String getRefFac() {
		return refFac;
	}
	public void setRefFac(String refFac) {
		this.refFac = refFac;
	}
	public String getRefePro() {
		return refePro;
	}
	public void setRefePro(String refePro) {
		this.refePro = refePro;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

}
