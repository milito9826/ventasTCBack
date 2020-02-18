package com.ventas.ventasTC.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "consumo_por_establecimiento")
public class ConsumoPorEstablecimiento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONSUMO_ESTABLECIMIENTO")
	private int idConsumoEstablecimiento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="NUMERO_TARJETA")
	private Tarjetas tarjetas;
	
	@Column(name = "NOMBRE_ESTABLECIMIENTO")
	private String nombreEstablecimiento;
	
	@Column(name = "DIRECCION_ESTABLECIMIENTO")
	private String 	direccionEstablecimiento;
	
	@Column(name = "CIUDAD_ESTABLECIMIENTO")
	private String ciudadEstablecimiento;
	
	@Column(name = "TELEFONO_ESTABLECIMIENTO")
	private String  telefonoEstablecimiento;

	public ConsumoPorEstablecimiento() {
		super();
	}

	public ConsumoPorEstablecimiento(int idConsumoEstablecimiento, Tarjetas tarjetas, String nombreEstablecimiento,
			String direccionEstablecimiento, String ciudadEstablecimiento, String telefonoEstablecimiento) {
		super();
		this.idConsumoEstablecimiento = idConsumoEstablecimiento;
		this.tarjetas = tarjetas;
		this.nombreEstablecimiento = nombreEstablecimiento;
		this.direccionEstablecimiento = direccionEstablecimiento;
		this.ciudadEstablecimiento = ciudadEstablecimiento;
		this.telefonoEstablecimiento = telefonoEstablecimiento;
	}

	public int getIdConsumoEstablecimiento() {
		return idConsumoEstablecimiento;
	}

	public void setIdConsumoEstablecimiento(int idConsumoEstablecimiento) {
		this.idConsumoEstablecimiento = idConsumoEstablecimiento;
	}

	public Tarjetas getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(Tarjetas tarjetas) {
		this.tarjetas = tarjetas;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
