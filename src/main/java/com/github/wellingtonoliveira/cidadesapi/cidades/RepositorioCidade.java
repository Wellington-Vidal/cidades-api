package com.github.wellingtonoliveira.cidadesapi.cidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.github.wellingtonoliveira.cidadesapi.cidades.Cidade;

public interface RepositorioCidade extends JpaRepository<Cidade, Long> {
     
    @Query(value = "SELECT * FROM cidade c, estado e WHERE c.uf = e.id AND e.uf = ?1", nativeQuery = true)
    List<Cidade> encontraCidadesPelaSiglaDoEstado(String uf);

    @Query(value = "SELECT CONCAT(c1.nome, '-', e1.uf, ' - ', c2.nome, '-', e2.uf, ' - ', TRUNCATE(((2 * ATAN2(SQRT(POW(SIN(RADIANS(c2.latitude - c1.latitude) / 2), 2) + COS(RADIANS(c1.latitude)) * COS(RADIANS(c2.latitude)) * POW(SIN(RADIANS(c2.longitude - c1.longitude) / 2), 2)), SQRT(1 - POW(SIN(RADIANS(c2.latitude - c1.latitude) / 2), 2) + COS(RADIANS(c1.latitude)) * COS(RADIANS(c2.latitude)) * POW(SIN(RADIANS(c2.longitude - c1.longitude) / 2), 2)))) * ?2), 2), ?3) FROM cidade c1, cidade c2, estado e1, estado e2 WHERE c1.id <> c2.id AND c1.id = ?1 AND c1.uf=e1.id AND c2.uf=e2.id GROUP BY c1.nome, e1.uf, c2.nome, e2.uf ORDER BY (2 * ATAN2(SQRT(POW(SIN(RADIANS(c2.latitude - c1.latitude) / 2), 2) + COS(RADIANS(c1.latitude)) * COS(RADIANS(c2.latitude)) * POW(SIN(RADIANS(c2.longitude - c1.longitude) / 2), 2)), SQRT(1 - POW(SIN(RADIANS(c2.latitude - c1.latitude) / 2), 2) + COS(RADIANS(c1.latitude)) * COS(RADIANS(c2.latitude)) * POW(SIN(RADIANS(c2.longitude - c1.longitude) / 2), 2)))) ASC, c2.nome LIMIT 5", nativeQuery = true)
    List<String> encontraCidadeMaisProxima(Long idCidade, Float raioTerra, String unidade);
}
