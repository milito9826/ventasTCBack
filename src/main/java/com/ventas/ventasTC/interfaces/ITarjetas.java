package com.ventas.ventasTC.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ventas.ventasTC.model.entity.Tarjetas;

@Repository
public interface ITarjetas extends CrudRepository<Tarjetas, String> {

}
