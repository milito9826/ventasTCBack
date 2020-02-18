package com.ventas.ventasTC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.ventasTC.interfaceService.IEspecialidadService;
import com.ventas.ventasTC.interfaces.IEspecialidad;
import com.ventas.ventasTC.model.entity.Especialidad;

@Service
public class EspecialidadService implements IEspecialidadService {

	@Autowired
	private IEspecialidad data;
	@Override
	public List<Especialidad> listar() {
		return (List<Especialidad>)data.findAll();
	}

	@Override
	public int save(Especialidad especialidad) {
		int res = 0;
		Especialidad esp = data.save(especialidad);
		if (!esp.equals(null)) {
			 	res = 1;
		}
		return res;
	}

	@Override
	public void delete(Long id) {
		data.deleteById(id);
	}

}
