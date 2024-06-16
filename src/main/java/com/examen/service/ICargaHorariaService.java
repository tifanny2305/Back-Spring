package com.examen.service;

import com.examen.entity.CargaHoraria;
import com.examen.entity.Docente;

import java.util.List;
import java.util.Optional;

public interface ICargaHorariaService {

    List<CargaHoraria> findAll();

    List<CargaHoraria> findByDocente(Docente docente);

    Optional<CargaHoraria> findById(Long id);

    void save(CargaHoraria cargaHoraria);

    void deleteById(Long id);
}
