package com.gym.gimnasio.infrastructure.persistence;

import com.gym.gimnasio.infrastructure.peristence.MarcaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.sterotyoe.Repository;

@Repository
public interface MarcaJpaRepository extends JpaRepository<MarcaEntity, Long> {
}
