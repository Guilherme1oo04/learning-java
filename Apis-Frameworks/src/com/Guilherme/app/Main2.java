package com.Guilherme.app;

import com.Guilherme.modelos.Aluno;
import com.Guilherme.modelos.Turma;

public class Main2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Guilherme Chaves", 99);
        Aluno aluno2 = new Aluno("Gustavo Chaves", 95);
        Aluno aluno3 = new Aluno("Nego ney", 0);

        Turma turma = new Turma();
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        turma.getAlunos().stream().forEach(conta -> {
            System.out.println(conta.getCodigoAluno() + ", " + conta.getNomeCompleto());
        });

        System.out.println();

        turma.getAlunos().stream().filter(conta -> conta.getCodigoAluno() > 90).forEach(conta -> {
            System.out.println(conta.getCodigoAluno() + ", " + conta.getNomeCompleto());
        });
    }
}
