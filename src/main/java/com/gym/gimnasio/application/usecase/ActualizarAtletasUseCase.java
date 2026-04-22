package com.gym.gimnasio.application.usecase;

import com.gym.gimnasio.domain.model.Atleta;
import com.gym.gimnasio.domain.repository.AtletaRepository;
import com.gym.gimnasio.domain.exception.AtletaNoEncontradoException;
import org.springframework.stereotype.Service;

@Service
public class ActualizarAtletasUseCase {
    private final AtletaRepository atletaRepository;

    public ActualizarAtletasUseCase(AtletaRepository atletaRepository) {
        this.atletaRepository = atletaRepository;
    }

    public Atleta actualizarAtleta(Long id, String nombre, String fechaNacimiento, double pesoActual) {
        Atleta atletaExistente = atletaRepository.findById(id);
        if (atletaExistente == null) {
            throw new AtletaNoEncontradoException(id.toString());
        }
        atletaExistente.setNombre(nombre);
        atletaExistente.setFechaNacimiento(java.time.LocalDate.parse(fechaNacimiento));
        atletaExistente.setPesoActual(pesoActual);
        return atletaRepository.save(atletaExistente);
    }
}
