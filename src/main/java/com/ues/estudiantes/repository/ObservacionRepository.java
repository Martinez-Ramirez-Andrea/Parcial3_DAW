package com.ues.estudiantes.repository;

import com.ues.estudiantes.model.Observacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ObservacionRepository extends JpaRepository<Observacion, Long> {

    List<Observacion> findByDescripcionContainingIgnoreCase(String descripcion);
}
