package com.ventas.ventasTC.interfaceService;

import java.util.List;

import com.ventas.ventasTC.model.entity.ConsumoPorEstablecimiento;

public interface IConsumoPorEstablecimientoService {

	public List<ConsumoPorEstablecimiento>listarConsumoPorEstablecimiento();
	public int guardarConsumoPorEstablecimiento(ConsumoPorEstablecimiento consPorEstab);
	public void eliminarConsumoPorEstablecimiemto(Integer id);
	
	public List<ConsumoPorEstablecimiento> lstConsumoPorEstablecimientoPorNumeroTarjeta(String numeroTarjeta);
	
}
