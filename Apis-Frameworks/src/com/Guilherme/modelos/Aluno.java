package com.Guilherme.modelos;

public class Aluno {
    private String nomeCompleto;
    private int codigoAluno;

    public Aluno(String nomeCompleto, int codigoAluno) {
        this.nomeCompleto = nomeCompleto;
        this.codigoAluno = codigoAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", codigoAluno=" + codigoAluno +
                '}';
    }

    public int getCodigoAluno() {
        return this.codigoAluno;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
