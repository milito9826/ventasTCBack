package com.ventas.ventasTC.modelo.DTO;

import java.util.Date;

public class ConsumosClienteDTO {
	
	private String numeroTarjeta;
	
	private Date fechaConsumo;
	
	private String descripcionConsumo;
	
	private String nombreEstablecimiento;
	
	private String 	direccionEstablecimiento;
	
	private String ciudadEstablecimiento;
	
	private String  telefonoEstablecimiento;
	
	private double montoConsumo;

	public ConsumosClienteDTO() {
		super();
	}

	public ConsumosClienteDTO(String numeroTarjeta, Date fechaConsumo, String descripcionConsumo,
			String nombreEstablecimiento, String direccionEstablecimiento, String ciudadEstablecimiento,
			String telefonoEstablecimiento, double montoConsumo) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaConsumo = fechaConsumo;
		this.descripcionConsumo = descripcionConsumo;
		this.nombreEstablecimiento = nombreEstablecimiento;
		this.direccionEstablecimiento = direccionEstablecimiento;
		this.ciudadEstablecimiento = ciudadEstablecimiento;
		this.telefonoEstablecimiento = telefonoEstablecimiento;
		this.montoConsumo = montoConsumo;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Date getFechaConsumo() {
		return fechaConsumo;
	}

	public void setFechaConsumo(Date fechaConsumo) {
		this.fechaConsumo = fechaConsumo;
	}

	public String getDescripcionConsumo() {
		return descripcionConsumo;
	}

	public void setDescripcionConsumo(String descripcionConsumo) {
		this.descripcionConsumo = descripcionConsumo;
	}

	public String getNombreEstablecimiento() {
		return nombreEstablecimiento;
	}

	public void setNombreEstablecimiento(String nombreEstablecimiento) {
		this.nombreEstablecimiento = nombreEstablecimiento;
	}

	public String getDireccionEstablecimiento() {
		return direccionEstablecimiento;
	}

	public void setDireccionEstablecimiento(String direccionEstablecimiento) {
		this.direccionEstablecimiento = direccionEstablecimiento;
	}

	public String getCiudadEstablecimiento() {
		return ciudadEstablecimiento;
	}

	public void setCiudadEstablecimiento(String ciudadEstablecimiento) {
		this.ciudadEstablecimiento = ciudadEstablecimiento;
	}

	public String getTelefonoEstablecimiento() {
		return telefonoEstablecimiento;
	}

	public void setTelefonoEstablecimiento(String telefonoEstablecimiento) {
		this.telefonoEstablecimiento = telefonoEstablecimiento;
	}

	public double getMontoConsumo() {
		return montoConsumo;
	}

	public void setMontoConsumo(double montoConsumo) {
		this.montoConsumo = montoConsumo;
	}
	
	
	

}
