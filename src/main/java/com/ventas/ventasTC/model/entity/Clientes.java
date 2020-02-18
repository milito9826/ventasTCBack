package com.ventas.ventasTC.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Clientes implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_CLIENTE")
	private int idCliente;
	
	@Column(name = "NOMBRE_CLIENTE")
	private String nombreCliente;
	
	@Column(name = "DIRECCION_CLIENTE")
	private String direccionCliente;
	
	@Column(name = "CIUDAD_CLIENTE")
	private String ciudadCliente;
	
	@Column(name = "TELEFONO")
	private String telefonoCliente;
	
	@Column(name="ID_ASESOR")
	private int idAsesor;

	public Clientes() {
		super();
	}

	public Clientes(int idCliente, String nombreCliente, String direccionCliente, String ciudadCliente,
			String telefonoCliente, int idAsesor) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		this.ciudadCliente = ciudadCliente;
		this.telefonoCliente = telefonoCliente;
		this.idAsesor = idAsesor;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getCiudadCliente() {
		return ciudadCliente;
	}

	public void setCiudadCliente(String ciudadCliente) {
		this.ciudadCliente = ciudadCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public int getIdAsesor() {
		return idAsesor;
	}

	public void setIdAsesor(int idAsesor) {
		this.idAsesor = idAsesor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
	
	

}
