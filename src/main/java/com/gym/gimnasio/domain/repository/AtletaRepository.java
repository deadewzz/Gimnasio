package com.gym.gimnasio.domain.repository;

import com.gym.gimnasio.domain.model.Atleta;
import java.util.List;

public interface AtletaRepository {
    Atleta save(Atleta atleta);
    Atleta findById(Long id);
    List<Atleta> findAll();
    void deleteById(Long id);
}



