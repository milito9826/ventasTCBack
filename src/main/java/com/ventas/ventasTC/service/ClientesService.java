package com.ventas.ventasTC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.ventasTC.interfaceService.IClientesService;
import com.ventas.ventasTC.interfaces.IClientes;
import com.ventas.ventasTC.model.entity.Clientes;

@Service
public class ClientesService implements IClientesService {

	@Autowired
	private IClientes repositorioClientes;

	@Override
	public List<Clientes> listarClientes() {
		return (List<Clientes>)repositorioClientes.findAll();
	}

	@Override
	public int guardarCliente(Clientes cliente) {
		int res = 0;
		Clientes client = repositorioClientes.save(cliente);
		if (!client.equals(null)) {
			 	res = 1;
		}
		return res;
	}

	@Override
	public void eliminarCliente(Integer id) {
		repositorioClientes.deleteById(id);
	}

}
