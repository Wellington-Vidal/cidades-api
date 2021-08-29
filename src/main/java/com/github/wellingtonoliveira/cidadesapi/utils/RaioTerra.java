package com.github.wellingtonoliveira.cidadesapi.utils;

public enum RaioTerra {
    METROS("m", 6378168f),
    KILOMETROS("km", 6378.168f),
    MILHAS("mi", 3958.747716f);

    private final String unidade;
    private final Float valor;

    RaioTerra(final String unidade, final Float valor){
        this.unidade = unidade;
        this.valor = valor;
    }

    public String getUnidade() {
        return unidade;
    }

    public Float getValor() {
        return valor;
    }
}
