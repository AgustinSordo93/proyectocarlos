package com.proyecto1.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Facturas")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String letra;
	private Integer Sucursal;
	private Integer Numero;
	private Double Total;
	
	@OneToMany(mappedBy = "factura")
	private List<DetallesFactura> listadetallesFactura;

	public List<DetallesFactura> getListaDetallesFacturas() {
		return listadetallesFactura;
	}

	public void setListaFacturas(List<DetallesFactura> listadetallesFactura) {
		this.listadetallesFactura = listadetallesFactura;
	}
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente Cliente;
	
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Cliente getCliente() {
		return Cliente;
	}
	
	public Double getTotal() {
		return Total;
	}
	public void setTotal(Double total) {
		Total = total;
	}
	public long getIdit() {
		return id;
	}
	public void setIdit(long idit) {
		this.id = idit;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public int getSucursal() {
		return Sucursal;
	}
	public void setSucursal(int sucursal) {
		Sucursal = sucursal;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	

}
