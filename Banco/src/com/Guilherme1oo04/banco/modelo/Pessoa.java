package com.Guilherme1oo04.banco.modelo;

public class Pessoa {
    private String nome;
    private String documento;
    private TipoPessoa tipo = TipoPessoa.FISICA;

    Pessoa(String nome, String documento){
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome(){
        return this.nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    public TipoPessoa getTipo(){
        return this.tipo;
    }

    void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }
}
