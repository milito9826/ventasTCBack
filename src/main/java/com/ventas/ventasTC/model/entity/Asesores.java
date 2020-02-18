package com.ventas.ventasTC.model.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "asesores")
public class Asesores implements Serializable {

	private static final long serialVersionUID = 7064293104317532807L;

	@Id
	@Column(name = "ID_ASESOR")
	private int idAsesor;
	
	@Column(name = "NOMBRE_ASESOR")
	private String nombre;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ID_ESPECIALIDAD_ASESOR")
	private Especialidad especialidad;

	public Asesores() {
		super();
	}

	public Asesores(int idAsesor, String nombre, Especialidad especialidad) {
		super();
		this.idAsesor = idAsesor;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}

	public int getIdAsesor() {
		return idAsesor;
	}

	public void setIdAsesor(int idAsesor) {
		this.idAsesor = idAsesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	

		
	

}
