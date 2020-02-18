package com.ventas.ventasTC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.ventasTC.interfaceService.ITarjetasService;
import com.ventas.ventasTC.interfaces.ITarjetas;
import com.ventas.ventasTC.model.entity.Tarjetas;

@Service
public class TarjetasService implements ITarjetasService {

	@Autowired
	private ITarjetas repositorioTarjetas;
	
	@Override
	public List<Tarjetas> listarTarjetas() {
		return (List<Tarjetas>)repositorioTarjetas.findAll();
	}

	@Override
	public int guardarTarjeta(Tarjetas tarjeta) {
		int res = 0;
		Tarjetas tarj = repositorioTarjetas.save(tarjeta);
		if (!tarj.equals(null)) {
			 	res = 1;
		}
		return res;
	}

	@Override
	public void eliminarTarjeta(String id) {
		repositorioTarjetas.deleteById(id);
		
	}

}
