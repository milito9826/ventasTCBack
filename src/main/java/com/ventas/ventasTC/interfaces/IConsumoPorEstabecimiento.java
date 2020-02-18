package com.ventas.ventasTC.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ventas.ventasTC.model.entity.ConsumoPorEstablecimiento;

@Repository
public interface IConsumoPorEstabecimiento extends CrudRepository<ConsumoPorEstablecimiento, Integer>  {

	@Query("SELECT cpe FROM ConsumoPorEstablecimiento cpe WHERE cpe.tarjetas.numeroTarjeta = ?1")
	public List<ConsumoPorEstablecimiento> findAllByTarjeta(String numeroTarjeta);
}
