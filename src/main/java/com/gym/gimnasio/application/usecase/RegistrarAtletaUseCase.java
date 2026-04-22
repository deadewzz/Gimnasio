package com.gym.gimnasio.application.usecase;

import com.gym.gimnasio.domain.model.Atleta;
import com.gym.gimnasio.domain.repository.AtletaRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrarAtletaUseCase {
    
    private final AtletaRepository atletaRepository;

    public RegistrarAtletaUseCase(AtletaRepository atletaRepository) {
        this.atletaRepository = atletaRepository;
    }

    public Atleta registrarAtleta(String nombre, String fechaNacimiento, double pesoActual) {
        Atleta nuevoAtleta = new Atleta();
        nuevoAtleta.setNombre(nombre);
        nuevoAtleta.setFechaNacimiento(java.time.LocalDate.parse(fechaNacimiento));
        nuevoAtleta.setPesoActual(pesoActual);
        return atletaRepository.save(nuevoAtleta);
    }
    
}
