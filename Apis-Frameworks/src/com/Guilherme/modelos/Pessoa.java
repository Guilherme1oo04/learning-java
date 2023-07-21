package com.Guilherme.modelos;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private String funcao;

    public Pessoa(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" +
                this.nome + "', funcao='" +
                this.funcao + "'}";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        return this.nome.equals(((Pessoa) obj).nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nome);
    }

    public String getNome() {
        return this.nome;
    }

    public String getFuncao() {
        return this.funcao;
    }
}
