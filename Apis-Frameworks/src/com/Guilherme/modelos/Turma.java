package com.Guilherme.modelos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public ArrayList<Aluno> getAlunos(){
//        this.alunos.sort(Comparator.comparingInt(aluno -> aluno.getCodigoAluno()));

        this.alunos.sort(Comparator.comparingInt(Aluno::getCodigoAluno));
        return this.alunos;

    }
}
