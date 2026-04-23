package com.gym.gimnasio.domain.repository;

//imports de modelos
import com.gym.gimnasio.domain.model.Entrenador;
// Imports java/jakarta
import java.util.*;

public interface EntrenadorRepository {
    List<Entrenador> findAll();
    Entrenador findById(Long id);
    Entrenador save(Entrenador entrenador);
    void deleteById(Long id);
    Entrenador editById(long id);

}
