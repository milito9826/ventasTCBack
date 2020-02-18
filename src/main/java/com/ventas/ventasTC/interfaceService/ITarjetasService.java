package com.ventas.ventasTC.interfaceService;

import java.util.List;

import com.ventas.ventasTC.model.entity.Tarjetas;


public interface ITarjetasService {
	public List<Tarjetas>listarTarjetas();
	public int guardarTarjeta(Tarjetas tarjeta);
	public void eliminarTarjeta(String id);
}
