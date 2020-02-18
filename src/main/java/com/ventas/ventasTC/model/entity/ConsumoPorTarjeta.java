package com.ventas.ventasTC.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "consumo_tarjeta")
public class ConsumoPorTarjeta implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONSUMO")
	private int idConsumo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="NUMERO_TARJETA")
	private Tarjetas tarjetas;
		
	@Column(name = "FECHA_CONSUMO")
	private Date fechaConsumo;
	
	@Column(name = "DESCRIPCION_CONSUMO")
	private String descripcionConsumo;
	
	@Column(name = "monto_consumo")
	private double montoConsumo;

	public ConsumoPorTarjeta() {
		super();
	}

	public ConsumoPorTarjeta(int idConsumo, Tarjetas tarjetas, Date fechaConsumo, String descripcionConsumo,
			double montoConsumo) {
		super();
		this.idConsumo = idConsumo;
		this.tarjetas = tarjetas;
		this.fechaConsumo = fechaConsumo;
		this.descripcionConsumo = descripcionConsumo;
		this.montoConsumo = montoConsumo;
	}

	public int getIdConsumo() {
		return idConsumo;
	}

	public void setIdConsumo(int idConsumo) {
		this.idConsumo = idConsumo;
	}

	public Tarjetas getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(Tarjetas tarjetas) {
		this.tarjetas = tarjetas;
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

	public double getMontoConsumo() {
		return montoConsumo;
	}

	public void setMontoConsumo(double montoConsumo) {
		this.montoConsumo = montoConsumo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
