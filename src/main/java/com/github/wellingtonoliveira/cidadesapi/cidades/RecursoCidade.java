package com.github.wellingtonoliveira.cidadesapi.cidades;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.wellingtonoliveira.cidadesapi.cidades.Cidade;
import com.github.wellingtonoliveira.cidadesapi.utils.RaioTerra;

@RestController
@RequestMapping(path = "/cidades")
public class RecursoCidade {
    
    private RepositorioCidade repositorioCidade;

    public RecursoCidade(RepositorioCidade repositorioCidade){
        this.repositorioCidade = repositorioCidade;
    }

    @GetMapping
    public List<Cidade> cidades(){
        return repositorioCidade.findAll();
        //http://localhost:8080/cidades
    }

    @GetMapping("/{uf}")
    public List<Cidade> cidadesEstado(@PathVariable String uf){
        return repositorioCidade.encontraCidadesPelaSiglaDoEstado(uf);
        //http://localhost:8080/cidades/pe
    }

    @GetMapping("/proxima")
    public List<String> cidadeMaisProxima(@RequestParam(name = "de") Long idCidade, @RequestParam(name = "u") RaioTerra unidade){
        Float raioTerra = unidade.getValor();
        String unidadeMedida = unidade.getUnidade();
        
        return repositorioCidade.encontraCidadeMaisProxima(idCidade, raioTerra, unidadeMedida);
        http://localhost:8080/cidades/proxima?de=3315&u=KILOMETROS
    }
}
