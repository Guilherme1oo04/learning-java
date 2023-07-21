package com.Guilherme.app;

import com.Guilherme.modelos.Aluno;
import com.Guilherme.modelos.Turma;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Guilherme Chaves", 99);
        Aluno aluno2 = new Aluno("Gustavo Chaves", 95);
        Aluno aluno3 = new Aluno("João da Silva", 0);
        Aluno aluno4 = new Aluno("Guilherme Chaves", 99);

        Turma turma = new Turma();
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);
        turma.adicionarAluno(aluno4);

        turma.getAlunos().stream().forEach(conta -> {
            System.out.println(conta.getCodigoAluno() + ", " + conta.getNomeCompleto());
        });

        System.out.println();

        turma.getAlunos().stream().filter(conta -> conta.getCodigoAluno() > 90).forEach(conta -> {
            System.out.println(conta.getCodigoAluno() + ", " + conta.getNomeCompleto());
        });

        System.out.println();

        turma.getAlunos().stream().map(Aluno::getNomeCompleto).distinct().forEach(System.out::println);

        Optional<Integer> somaCodigos = turma.getAlunos().stream().map(Aluno::getCodigoAluno).reduce(Integer::sum);
        somaCodigos.ifPresent(System.out::println);

        System.out.println();
        List<String> pessoas = turma.getAlunos().stream().map(Aluno::getNomeCompleto).toList();
        System.out.println(pessoas);

        System.out.println();
        String alunoEncontrado = turma.buscarAluno(0).map(Aluno::getNomeCompleto).orElse("Aluno não encontrado");
        System.out.println("Código 0: " + alunoEncontrado);
        String alunoEncontrado2 = turma.buscarAluno(78).map(Aluno::getNomeCompleto).orElse("Aluno não encontrado");
        System.out.println("Código 78: " + alunoEncontrado2);
    }
}
