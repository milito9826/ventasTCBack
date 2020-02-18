package com.ventas.ventasTC.controller;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.ventasTC.interfaceService.IConsumoPorEstablecimientoService;
import com.ventas.ventasTC.interfaceService.IConsumoPorTarjetaService;
import com.ventas.ventasTC.model.entity.ConsumoPorEstablecimiento;
import com.ventas.ventasTC.model.entity.ConsumoPorTarjeta;
import com.ventas.ventasTC.modelo.DTO.ConsumosClienteDTO;
import com.ventas.ventasTC.transformadoresDTO.ConsumosClientePorTarjetaYEstablecimientos;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/ventasTC")
public class ControladorConsumosCliente {

	@Autowired
	private IConsumoPorTarjetaService consumoPorTarjetaService;
	
	
	@Autowired
	private IConsumoPorEstablecimientoService consumoPorEstablecimientoService;
	
	
	@GetMapping("/consumos-tarjetas-cliente/{numeroTarjeta}")
	public List<Serializable> consultarConsumosPorTarjetaYEstablecimientos(@PathVariable String numeroTarjeta) {
		return consultarConsumoPorTarjetayEstablecimiento(numeroTarjeta);
	}
	
	
	public List<Serializable> consultarConsumoPorTarjetayEstablecimiento(String numeroTarjeta) {
		List<ConsumoPorTarjeta> respuestaConsumoPorTarjeta = consumoPorTarjetaService.lstConsumoTarjetaPorNumeroTarjeta(numeroTarjeta);
		List<ConsumoPorEstablecimiento> respuestaConsumoPorEstablecimiento = consumoPorEstablecimientoService.lstConsumoPorEstablecimientoPorNumeroTarjeta(numeroTarjeta);
        
        List<Serializable> consumoClientes = Stream.concat(respuestaConsumoPorTarjeta.stream(), respuestaConsumoPorEstablecimiento.stream())
                .collect(Collectors.toList());
		return consumoClientes;
	}
}
