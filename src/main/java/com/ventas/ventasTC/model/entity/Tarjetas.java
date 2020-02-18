package com.ventas.ventasTC.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tarjetas")
public class Tarjetas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NUMERO_TARJETA")
	private String numeroTarjeta;
	
	@Column(name = "CVV_TARJETA")
	private int cvvTarjeta;
	
	@Column(name = "TIPO_TARJETA")
	private String tipoTarjeta;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ID_CLIENTE")
	private Clientes clientes;

	public Tarjetas() {
		super();
	}

	public Tarjetas(String numeroTarjeta, int cvvTarjeta, String tipoTarjeta, Clientes clientes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.cvvTarjeta = cvvTarjeta;
		this.tipoTarjeta = tipoTarjeta;
		this.clientes = clientes;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public int getCvvTarjeta() {
		return cvvTarjeta;
	}

	public void setCvvTarjeta(int cvvTarjeta) {
		this.cvvTarjeta = cvvTarjeta;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	
	

}
