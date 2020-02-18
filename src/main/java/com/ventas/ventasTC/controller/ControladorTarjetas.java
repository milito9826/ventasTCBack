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

import com.ventas.ventasTC.interfaceService.ITarjetasService;
import com.ventas.ventasTC.model.entity.Tarjetas;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/ventasTC")
public class ControladorTarjetas {
	
	@Autowired
	private ITarjetasService tarjetasService;
	
	@GetMapping("/listar-tarjetas")
	public List<Tarjetas> consultarTarjetas() {
		return tarjetasService.listarTarjetas();
	}
	
	@PostMapping(value = "/guardar-tarjeta")
	public int guardarTarjeta(@RequestBody Tarjetas tarjeta) {
		int respuesta = tarjetasService.guardarTarjeta(tarjeta);
		return respuesta;
	}
	
	@DeleteMapping(value = "/eliminar-tarjeta/{idTarjeta}")
	public void eliminarTarjeta(@PathVariable String idTarjeta) {
		tarjetasService.eliminarTarjeta(idTarjeta);
	}

}
