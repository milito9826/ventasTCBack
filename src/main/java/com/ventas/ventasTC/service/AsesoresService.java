package com.ventas.ventasTC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.ventasTC.interfaceService.IAsesoresService;
import com.ventas.ventasTC.interfaces.IAsesores;
import com.ventas.ventasTC.model.entity.Asesores;

@Service
public class AsesoresService implements IAsesoresService {

	@Autowired
	private IAsesores repositorioAsesores;
	
	@Override
	public List<Asesores> listarAsesores() {
		return (List<Asesores>)repositorioAsesores.findAll();
	}

	@Override
	public int guardarAsesor(Asesores asesor) {
		int res = 0;
		Asesores ases = repositorioAsesores.save(asesor);
		if (!ases.equals(null)) {
			 	res = 1;
		}
		return res;
	}

	@Override
	public void eliminarAsesor(Integer id) {
		repositorioAsesores.deleteById(id);
	}

	

}
