package com.gym.gimnasio.application.usecase;

import com.gym.gimnasio.domain.model.Atleta;
import com.gym.gimnasio.domain.repository.AtletaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ListarAtletasUseCase {
    private final AtletaRepository atletaRepository;

    public ListarAtletasUseCase(AtletaRepository atletaRepository) {
        this.atletaRepository = atletaRepository;
    }
    public List<Atleta> ejecutar() {
        return atletaRepository.findAll();
    }
}