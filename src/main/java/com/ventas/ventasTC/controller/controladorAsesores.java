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

import com.ventas.ventasTC.interfaceService.IAsesoresService;
import com.ventas.ventasTC.model.entity.Asesores;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ventasTC")
public class controladorAsesores {
	
	@Autowired
	private IAsesoresService asesoresService;
	
	@GetMapping("/listar-asesores")
	public List<Asesores> consultarAsesores() {
		return asesoresService.listarAsesores();
	}
	
	@PostMapping(value = "/guardar-asesor")
	public int guardarAsesor(@RequestBody Asesores asesor) {
		int respuesta = asesoresService.guardarAsesor(asesor);
		return respuesta;
	}
	
	@DeleteMapping(value = "/eliminar-asesor/{idAsesor}")
	public void elminarAsesor(@PathVariable Integer idAsesor) {
		asesoresService.eliminarAsesor(idAsesor);
	}
	
}
