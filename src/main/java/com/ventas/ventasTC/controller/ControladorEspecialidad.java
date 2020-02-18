package com.ventas.ventasTC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.ventasTC.interfaceService.IEspecialidadService;
import com.ventas.ventasTC.model.entity.Especialidad;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/ventasTC")
public class ControladorEspecialidad {
	
	@Autowired
	private IEspecialidadService service;
	
	@GetMapping("/listar-especialidades")
	public List<Especialidad> consultarEspecialidades() {
		return service.listar();
	}
	
	@PostMapping(value = "/guardar-especialidad")
	public int agregarEspecialidad(@RequestBody Especialidad especialidad) {
		int respuesta = service.save(especialidad); 
		return respuesta;
	}
	
	@DeleteMapping(value = "/eliminar-especialidad/{idEspecialidad}")
	public void eliminarEspecialidad(@PathVariable Long idEspecialidad) {
		service.delete(idEspecialidad);
	}
}
