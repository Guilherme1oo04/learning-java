package com.Guilherme1oo04.banco.app;

import com.Guilherme1oo04.banco.modelo.ContaEspecial;
import com.Guilherme1oo04.banco.modelo.ContaInvestimento;

public class Principal {
    public static void main(String[] args) {

        ContaInvestimento minhaConta = new ContaInvestimento("Guilherme Chaves", "254768", 18, 4895);
        minhaConta.depositar(5_000);
        minhaConta.sacar(200, 40);
        minhaConta.creditarRendimentos(0.6);

        minhaConta.info();

        System.out.println(" ");

        ContaEspecial suaConta = new ContaEspecial("Pessoa aleatória", "645739", 47, 8584, 1_000);
        suaConta.depositar(5_000);
        suaConta.sacar(5_600, 20);
        suaConta.info();
    }
}
