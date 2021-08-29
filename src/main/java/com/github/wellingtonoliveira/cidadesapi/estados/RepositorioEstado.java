package com.github.wellingtonoliveira.cidadesapi.estados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

import com.github.wellingtonoliveira.cidadesapi.estados.Estado;

public interface RepositorioEstado extends JpaRepository<Estado, Long> {
    
    @Query(value = "SELECT e.* FROM estado e WHERE e.uf = ?1", nativeQuery = true)
    List<Estado> encontraPelaSiglaEstado(String uf);
}
