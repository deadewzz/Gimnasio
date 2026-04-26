package com.gym.gimnasio.domain.repository;

import com.gym.gimnasio.domain.model.MarcaAtleta;
import java.util.List;

/* Definimos el puerto de salida: cómo se deben comportar los datos */
public interface MarcaAtletaRepository {
    MarcaAtleta guardar(MarcaAtleta marcaAtleta);

    List<MarcaAtleta> obtenerPorAtleta(Long atletaId);
}