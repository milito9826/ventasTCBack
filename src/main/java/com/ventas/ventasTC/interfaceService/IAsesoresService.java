package com.ventas.ventasTC.interfaceService;

import java.util.List;

import com.ventas.ventasTC.model.entity.Asesores;

public interface IAsesoresService {
	public List<Asesores>listarAsesores();
	public int guardarAsesor(Asesores asesor);
	public void eliminarAsesor(Integer id);
}
