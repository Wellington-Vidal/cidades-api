package com.github.wellingtonoliveira.cidadesapi.estados;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/estados")
public class RecursoEstado {
    
    private RepositorioEstado repositorioEstado;

    public RecursoEstado(RepositorioEstado repositorioEstado){
        this.repositorioEstado = repositorioEstado;
    }

    @GetMapping
    public List<Estado> estados(){
        return repositorioEstado.findAll();
    }

    @GetMapping("/{uf}")
    public List getEstado(@PathVariable String uf){
        return repositorioEstado.encontraPelaSiglaEstado(uf);
        /*
        Optional<Estado> optional = repositorioEstado.EncontraPelaSiglaEstado(uf);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }
        else{
            return ResponseEntity.status(404).build();
        }*/
    }
}