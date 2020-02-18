package com.ventas.ventasTC.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ventas.ventasTC.model.entity.Especialidad;

@Repository
public interface IEspecialidad extends CrudRepository<Especialidad, Long>{

}
