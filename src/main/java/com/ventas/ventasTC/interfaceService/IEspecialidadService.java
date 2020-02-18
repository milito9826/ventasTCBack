package com.ventas.ventasTC.interfaceService;

import java.util.List;

import com.ventas.ventasTC.model.entity.Especialidad;

public interface IEspecialidadService {
	public List<Especialidad>listar();
	public int save(Especialidad esp);
	public void delete(Long id);
}
