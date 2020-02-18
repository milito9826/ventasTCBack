package com.ventas.ventasTC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.ventasTC.interfaceService.IConsumoPorTarjetaService;
import com.ventas.ventasTC.interfaces.IConsumoPorTarjeta;
import com.ventas.ventasTC.model.entity.ConsumoPorTarjeta;

@Service
public class ConsumoPorTarjetaService implements IConsumoPorTarjetaService {

	
	@Autowired
	private IConsumoPorTarjeta repositorioConsumoPorTarjeta;
	

	@Override
	public List<ConsumoPorTarjeta> listarConsumoPorTarjetas() {
		return (List<ConsumoPorTarjeta>)repositorioConsumoPorTarjeta.findAll();
	}

	@Override
	public int guardarConsumoTarjeta(ConsumoPorTarjeta consPorTarj) {
		int res = 0;
		ConsumoPorTarjeta consPorTarje = repositorioConsumoPorTarjeta.save(consPorTarj);
		if (!consPorTarje.equals(null)) {
			 	res = 1;
		}
		return res;
	}

	@Override
	public void eliminarConsumoPorTarjeta(Integer id) {
		repositorioConsumoPorTarjeta.deleteById(id);
		
	}
	
	@Override
	public List<ConsumoPorTarjeta> lstConsumoTarjetaPorNumeroTarjeta(String numeroTarjeta) {
		return repositorioConsumoPorTarjeta.findAllByTarjeta(numeroTarjeta);
	}

}
