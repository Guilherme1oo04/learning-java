package com.Guilherme1oo04.banco.modelo;

public class ContaInvestimento extends Conta{
    public ContaInvestimento(String nome, String documento, int agencia, int numero){
        super(nome, documento, agencia, numero);
    }

    public void creditarRendimentos(double percentualJuros){
        double valorRendimentos = this.getSaldo() * percentualJuros / 100;
        this.depositar(valorRendimentos);
    }

    @Override
    public double getSaldoDisponivel() {
        return getSaldo();
    }
}
