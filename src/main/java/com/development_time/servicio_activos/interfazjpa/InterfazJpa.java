package com.development_time.servicio_activos.interfazjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.development_time.servicio_activos.modelo.Activos;

public interface InterfazJpa extends JpaRepository<Activos, Integer>{

}
