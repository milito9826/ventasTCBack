package com.ventas.ventasTC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.ventasTC.interfaceService.IConsumoPorEstablecimientoService;
import com.ventas.ventasTC.interfaces.IConsumoPorEstabecimiento;
import com.ventas.ventasTC.model.entity.ConsumoPorEstablecimiento;

@Service
public class ConsumoPorEstablecimientoService implements  IConsumoPorEstablecimientoService{

	
	@Autowired
	private IConsumoPorEstabecimiento repositorioConsumoPorEstablecimiento;

	@Override
	public List<ConsumoPorEstablecimiento> listarConsumoPorEstablecimiento() {
		return (List<ConsumoPorEstablecimiento>)repositorioConsumoPorEstablecimiento.findAll();
	}

	@Override
	public int guardarConsumoPorEstablecimiento(ConsumoPorEstablecimiento consPorEstab) {
		int res = 0;
		ConsumoPorEstablecimiento consPorEsta = repositorioConsumoPorEstablecimiento.save(consPorEstab);
		if (!consPorEsta.equals(null)) {
			 	res = 1;
		}
		return res;
	}

	@Override
	public void eliminarConsumoPorEstablecimiemto(Integer id) {
		repositorioConsumoPorEstablecimiento.deleteById(id);
		
	}

	@Override
	public List<ConsumoPorEstablecimiento> lstConsumoPorEstablecimientoPorNumeroTarjeta(String numeroTarjeta) {
		return repositorioConsumoPorEstablecimiento.findAllByTarjeta(numeroTarjeta);
	}

}
