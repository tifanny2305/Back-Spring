package com.examen.repository;

import com.examen.entity.CargaHoraria;
import com.examen.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CargaHorariaRepository extends JpaRepository<CargaHoraria, Long> {

    List<CargaHoraria> findByDocente(Docente docente);

}
