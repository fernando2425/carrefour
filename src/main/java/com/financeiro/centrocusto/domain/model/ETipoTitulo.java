package com.financeiro.centrocusto.domain.model;

public enum  ETipoTitulo {

    ARECEBER("A receber"),
    APAGAR("A pagar");

    private String valor;

    private ETipoTitulo(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return this.valor;
    }
}
