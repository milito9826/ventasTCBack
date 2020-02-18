package com.ventas.ventasTC.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ventas.ventasTC.model.entity.Clientes;

@Repository
public interface IClientes extends CrudRepository<Clientes, Integer>{

}
