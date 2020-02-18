package com.ventas.ventasTC.interfaceService;

import java.util.List;

import com.ventas.ventasTC.model.entity.Clientes;

public interface IClientesService {
	public List<Clientes>listarClientes();
	public int guardarCliente(Clientes cliente);
	public void eliminarCliente(Integer id);
}
