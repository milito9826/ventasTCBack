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

import com.ventas.ventasTC.interfaceService.IClientesService;
import com.ventas.ventasTC.model.entity.Clientes;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/ventasTC")
public class ControladorClientes {
	
	@Autowired
	private IClientesService clientesService;
	
	@GetMapping("/listar-clientes")
	public List<Clientes> consultarClientes() {
		return clientesService.listarClientes();
	}
	
	
	@PostMapping(value = "/guardar-cliente")
	public int guardarCliente(@RequestBody Clientes cliente) {
		int respuesta = clientesService.guardarCliente(cliente);
		return respuesta;
	}
	
	@DeleteMapping(value = "/eliminar-cliente/{idCliente}")
	public void elminarCliente(@PathVariable Integer idCliente) {
		clientesService.eliminarCliente(idCliente);
	}
	
	
}
