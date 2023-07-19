package com.Guilherme1oo04.banco.modelo;

public class Pessoa {
    private String nome;
    private String documento;

    Pessoa(String nome, String documento){
        this.nome = nome;
        this.documento = documento;
    }

    String getNome(){
        return this.nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }
}
