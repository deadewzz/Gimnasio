package com.gym.gimnasio.application.usecase;

import com.gym.gimnasio.domain.repository.AtletaRepository;
import org.springframework.stereotype.Service;


@Service
public class EliminarAtletasUseCase {
    
    private final AtletaRepository atletaRepository;

    public EliminarAtletasUseCase(AtletaRepository atletaRepository) {
        this.atletaRepository = atletaRepository;
    }

    public void eliminarAtleta(Long id) {
        atletaRepository.deleteById(id);
    }
}
