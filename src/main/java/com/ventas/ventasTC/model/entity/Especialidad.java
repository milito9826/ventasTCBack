package com.ventas.ventasTC.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "especialidad")
public class Especialidad implements Serializable {

	private static final long serialVersionUID = -1136591209412635451L;

	@Id
	@Column(name = "ID_ESPECIALIDAD")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEspecialidad;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	public Especialidad() {
		super();
	}

	public Especialidad(Long idEspecialidad, String descripcion) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.descripcion = descripcion;
	}

	public Long getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Long idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
