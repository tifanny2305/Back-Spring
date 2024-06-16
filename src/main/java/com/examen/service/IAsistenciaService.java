package com.examen.service;
import com.examen.entity.Asistencia;
import com.examen.entity.Horario;

import java.util.List;
import java.util.Optional;

public interface IAsistenciaService {

    List<Asistencia> findAll();

    List<Asistencia> findByHorario(Horario horario);

    Optional<Asistencia> findById(Long id);

    void save(Asistencia asistencia);

    void deleteById(Long id);
}
