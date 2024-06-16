package com.examen.repository;

import com.examen.entity.Docente;
import com.examen.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {

    Optional<Docente> findByUsuario(Usuario usuario);

}
