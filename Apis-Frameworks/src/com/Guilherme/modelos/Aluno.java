package com.Guilherme.modelos;

import java.math.BigDecimal;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigoAluno == aluno.codigoAluno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoAluno);
    }

    public int getCodigoAluno() {
        return this.codigoAluno;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public BigDecimal getCodigoAlunoBigDecimal(){
        return new BigDecimal(String.valueOf(this.getCodigoAluno()));
    }
}
