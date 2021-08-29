package com.github.wellingtonoliveira.cidadesapi.paises;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {
    
    public Pais(){
        
    }

    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nome_pt")
    private String nomePt;

    @Column(name = "sigla")
    private String codigo;

    private Integer bacen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePt() {
        return nomePt;
    }

    public void setNomePt(String nomePt) {
        this.nomePt = nomePt;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getBacen() {
        return bacen;
    }

    public void setBacen(Integer bacen) {
        this.bacen = bacen;
    }
}
