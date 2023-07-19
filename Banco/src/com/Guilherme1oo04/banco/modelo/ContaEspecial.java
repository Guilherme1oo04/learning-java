package com.Guilherme1oo04.banco.modelo;

public class ContaEspecial extends Conta{
    private double valorLimite;

    public ContaEspecial(String nome, String documento, int agencia, int numero, double valorLimite) {
        super(nome, documento, agencia, numero);
        this.valorLimite = valorLimite;
    }

    @Override
    public double getSaldoDisponivel() {
        return getSaldo() + this.valorLimite;
    }
}
