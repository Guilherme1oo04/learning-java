package com.Guilherme.modelos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
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

    public Optional<Aluno> buscarAluno(int codigoAluno){
        for (Aluno aluno : this.getAlunos()){
            if (aluno.getCodigoAluno() == codigoAluno){
                return Optional.of(aluno);
            }
        }
        return Optional.empty();
    }
}
