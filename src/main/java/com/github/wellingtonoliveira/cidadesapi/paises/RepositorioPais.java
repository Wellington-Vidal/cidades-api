package com.github.wellingtonoliveira.cidadesapi.paises;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.wellingtonoliveira.cidadesapi.paises.Pais;

public interface RepositorioPais extends JpaRepository<Pais, Long> {
    
}
