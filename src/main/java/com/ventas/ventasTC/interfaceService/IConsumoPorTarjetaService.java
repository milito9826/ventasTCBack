package com.ventas.ventasTC.interfaceService;

import java.util.List;
import com.ventas.ventasTC.model.entity.ConsumoPorTarjeta;

public interface IConsumoPorTarjetaService {

	public List<ConsumoPorTarjeta>listarConsumoPorTarjetas();
	public int guardarConsumoTarjeta(ConsumoPorTarjeta consPorTarj);
	public void eliminarConsumoPorTarjeta(Integer id);
	public List<ConsumoPorTarjeta> lstConsumoTarjetaPorNumeroTarjeta(String numeroTarjeta);
}
