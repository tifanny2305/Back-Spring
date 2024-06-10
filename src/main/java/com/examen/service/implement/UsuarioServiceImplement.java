package com.examen.service.implement;

import com.examen.entity.RoleEntity;
import com.examen.entity.Usuario;
import com.examen.persistence.IUsuarioDAO;
import com.examen.repository.RoleRepository;
import com.examen.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioDAO usuarioDAO;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioDAO.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioDAO.findById(id);
    }

    @Override
    public void save(Usuario usuario) {
        Set<RoleEntity> roles = usuario.getRoles().stream()
                .map(role -> roleRepository.findByName(role.getName())
                        .orElseThrow(() -> new RuntimeException("Role not found: " + role.getName())))
                .collect(Collectors.toSet());
        usuario.setRoles(roles);
        usuarioDAO.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        usuarioDAO.deleteById(id);
    }
}
