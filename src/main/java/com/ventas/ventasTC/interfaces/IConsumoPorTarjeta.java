package com.ventas.ventasTC.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ventas.ventasTC.model.entity.ConsumoPorTarjeta;

@Repository
public interface IConsumoPorTarjeta extends CrudRepository<ConsumoPorTarjeta, Integer>  {

	@Query("SELECT cpt FROM ConsumoPorTarjeta cpt WHERE cpt.tarjetas.numeroTarjeta = ?1")
	public List<ConsumoPorTarjeta> findAllByTarjeta(String numeroTarjeta);
}
