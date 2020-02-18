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

import com.ventas.ventasTC.interfaceService.IConsumoPorEstablecimientoService;
import com.ventas.ventasTC.model.entity.ConsumoPorEstablecimiento;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/ventasTC")
public class ControladorPorEstablecimiento {
	
	@Autowired
	private IConsumoPorEstablecimientoService consumoPorEstablecmientoService;
	
	@GetMapping("/listar-consumo-establecimientos")
	public List<ConsumoPorEstablecimiento> consultarConsumoPorEstablecimiento() {
		return consumoPorEstablecmientoService.listarConsumoPorEstablecimiento();
	}
	
	@PostMapping(value = "/guardar-consumo-establecimiento")
	public int guardarConsumoPorEstablecimiento(@RequestBody ConsumoPorEstablecimiento consPorEstab) {
		int respuesta = consumoPorEstablecmientoService.guardarConsumoPorEstablecimiento(consPorEstab);
		return respuesta;
	}
	
	@DeleteMapping(value = "/eliminar-consumo-establecimiento/{idconsumo}")
	public void eliminarConsumoPorEstablecimientoTarjeta(@PathVariable Integer idconsumo) {
		consumoPorEstablecmientoService.eliminarConsumoPorEstablecimiemto(idconsumo);
	}

	@GetMapping(value = "/consulta-consumo-establecimiento/{numeroTarjeta}")
	public List<ConsumoPorEstablecimiento> consultarConsumoPorEstablecimientos(@PathVariable String numeroTarjeta) {
		return consumoPorEstablecmientoService.lstConsumoPorEstablecimientoPorNumeroTarjeta(numeroTarjeta);
	}
}
