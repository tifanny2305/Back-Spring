package com.examen.persistence.implement;

import com.examen.entity.Aula;
import com.examen.entity.Docente;
import com.examen.entity.Usuario;
import com.examen.persistence.IAulaDAO;
import com.examen.persistence.IDocenteDAO;
import com.examen.repository.AulaRepository;
import com.examen.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DocenteDAOImplement implements IDocenteDAO {

    @Autowired
    private DocenteRepository docenteRepository;


    @Override
    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }

    @Override
    public Optional<Docente> findById(Long id) {
        return docenteRepository.findById(id);
    }

    @Override
    public Optional<Docente> findByUsuario(Usuario usuario) {
        return docenteRepository.findByUsuario(usuario);
    }

    @Override
    public void save(Docente docente) {
        docenteRepository.save(docente);
    }

    @Override
    public void deleteById(Long id) {
        docenteRepository.deleteById(id);
    }
}
