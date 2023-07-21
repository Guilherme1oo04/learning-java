package com.Guilherme.app;

import com.Guilherme.modelos.Pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Guilherme Chaves", "Programador Java");
        Pessoa pessoa2 = new Pessoa("Guilherme da Silva", "Programador Python");

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        System.out.println();
        System.out.println(pessoas);

        System.out.println();
        System.out.println(pessoas.get(0));

        System.out.println();
//        for (int i = 0; i < pessoas.size(); i++){
//            System.out.println(pessoas.get(i).getNome() + " é: " + pessoas.get(i).getFuncao());
//        }

        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa.getNome() + " é " + pessoa.getFuncao());
        }

        System.out.println();

        if (pessoas.contains(pessoa1)){
            int indice = pessoas.indexOf(pessoa1);
            System.out.println(pessoa1.getNome() + " está na lista, no índice " + indice + "!");
        } else {
            System.out.println(pessoa1.getNome() + " não está na lista!");
        }

        System.out.println();

        Pessoa pessoa3 = new Pessoa("Guilherme Chaves", "Programador Java");
        System.out.println(pessoa1.equals(pessoa3));

        System.out.println();

        // Forma mais recomendada de listas, desempenho é melhor
        // obs: só funcionará caso seja atribuídoa função equals e hashcode corretamente
        Set<String> frutas = new HashSet<>();
        frutas.add("maça");
        frutas.add("banana");
        frutas.add("melancia");
        System.out.println(frutas.contains("maça"));

    }
}
