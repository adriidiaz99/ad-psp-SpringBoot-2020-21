package com.salesianostriana.Ejemplo2.dao;

import com.salesianostriana.Ejemplo2.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository <Alumno, Long> {
}

