package com.ventas.ventasTC.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ventas.ventasTC.model.entity.Asesores;

@Repository
public interface IAsesores extends CrudRepository<Asesores, Integer> {

}
