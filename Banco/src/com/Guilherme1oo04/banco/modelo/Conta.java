package com.Guilherme1oo04.banco.modelo;

import java.util.Objects;

public abstract class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(String nome, String documento, int agencia, int numero){

        Pessoa titularTemp = new Pessoa(nome, documento);
        Objects.requireNonNull(titularTemp);

        this.titular = titularTemp;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void info(){
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Titular: " + this.titular.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }

        if (getSaldoDisponivel() - valor < 0){
            throw new IllegalStateException("Saldo insuficiente.");
        }

        this.saldo -= valor;
    }

    public void sacar(double valor, double taxaSaque){
        sacar(valor + taxaSaque);
    }

    public void mudarNome(String nome){
        this.titular.setNome(nome);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Pessoa getTitular(){
        return this.titular;
    }

    public abstract double getSaldoDisponivel();
}
