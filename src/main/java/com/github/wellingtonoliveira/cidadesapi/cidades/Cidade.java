package com.github.wellingtonoliveira.cidadesapi.cidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.github.wellingtonoliveira.cidadesapi.estados.Estado;

@Entity
@Table(name = "cidade")
public class Cidade {
    
    public Cidade(){

    }

    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private Estado uf;

    @Column(name = "ibge")
    private Integer ibge;

    @Column(name = "lat_lon")
    private String latLon;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "cod_tom")
    private Integer codTom;

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

    public Estado getUf() {
        return uf;
    }

    public void setUf(Estado uf) {
        this.uf = uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public void setIbge(Integer ibge) {
        this.ibge = ibge;
    }

    public String getLatLon() {
        return latLon;
    }

    public void setLatLon(String latLon) {
        this.latLon = latLon;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getCodTom() {
        return codTom;
    }

    public void setCodTom(Integer codTom) {
        this.codTom = codTom;
    }
}
