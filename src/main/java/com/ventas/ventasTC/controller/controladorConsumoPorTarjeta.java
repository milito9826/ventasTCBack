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

import com.ventas.ventasTC.interfaceService.IConsumoPorTarjetaService;
import com.ventas.ventasTC.model.entity.ConsumoPorTarjeta;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/ventasTC")
public class controladorConsumoPorTarjeta {
	
	@Autowired
	private IConsumoPorTarjetaService consumoPorTarjetaService;
	
	@GetMapping("/listar-consumo-tarjetas")
	public List<ConsumoPorTarjeta> consultarConsumoPorTarjetas() {
		return consumoPorTarjetaService.listarConsumoPorTarjetas();
	}
	
	@PostMapping(value = "/guardar-consumo-tarjeta")
	public int guardarConsumoTarjeta(@RequestBody ConsumoPorTarjeta consPorTarj) {
		int respuesta = consumoPorTarjetaService.guardarConsumoTarjeta(consPorTarj);
		return respuesta;
	}
	
	@DeleteMapping(value = "/eliminar-consumo-tarjeta/{idconsumo}")
	public void eliminarConsumoTarjeta(@PathVariable Integer idconsumo) {
		consumoPorTarjetaService.eliminarConsumoPorTarjeta(idconsumo);
	}
	
	@GetMapping(value = "/consulta-consumo-tarjeta/{numeroTarjeta}")
	public List<ConsumoPorTarjeta> consultarConsumoPorEstablecimientos(@PathVariable String numeroTarjeta) {
		return consumoPorTarjetaService.lstConsumoTarjetaPorNumeroTarjeta(numeroTarjeta);
	}

}
