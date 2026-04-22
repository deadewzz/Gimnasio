package com.gym.gimnasio.domain.repository;

import com.gym.gimnasio.domain.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;


public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
    Optional<Usuarios> findByCorreo(String correo);
}