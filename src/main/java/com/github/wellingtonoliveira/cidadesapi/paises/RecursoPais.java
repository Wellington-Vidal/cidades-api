package com.github.wellingtonoliveira.cidadesapi.paises;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/paises")
public class RecursoPais {
    
    private RepositorioPais repositorioPais;

    public RecursoPais(RepositorioPais repositorioPais){
        this.repositorioPais = repositorioPais;
    }

    /*
    @GetMapping
    public List<Pais> paises(){
        return repositorioPais.findAll();
        //localhost:8080\paises
    }*/

    
    @GetMapping
    public Page<Pais> paises(Pageable pagina){
        return repositorioPais.findAll(pagina);
        //localhost:8080\paises?page=0&size=10&sort=name,asc
    }
    /*
    @GetMapping("/{id}")
    public Pais retornaPais(@PathVariable long id){
        Optional<Pais> optional = repositorioPais.findById(id);
        return optional.get();
        //localhost:8080\paises\1
    }*/

    @GetMapping("/{id}")
    public ResponseEntity retornaPais(@PathVariable long id){
        Optional<Pais> optional = repositorioPais.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }
        else{
            return ResponseEntity.status(404).build();
        }
        
        //localhost:8080\paises\1
    }
}
