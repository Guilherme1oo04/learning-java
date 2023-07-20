package com.Guilherme1oo04.banco.modelo;

import com.Guilherme1oo04.banco.modelo.excecao.NegativeNumberException;
import com.Guilherme1oo04.banco.modelo.excecao.SaldoInsuficienteException;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;
    private LocalDateTime ultimaAtualizacao;

    public Conta(String nome, String documento, int agencia, int numero){

        Pessoa titularTemp = new Pessoa(nome, documento);
        Objects.requireNonNull(titularTemp);

        this.titular = titularTemp;
        this.agencia = agencia;
        this.numero = numero;
        this.ultimaAtualizacao = LocalDateTime.now();
    }

    public void info(){
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Última atualização da conta: " + this.ultimaAtualizacao);
        System.out.println("Titular: " + this.titular.getNome());
        System.out.println("Tipo de pessoa: " + this.titular.getTipo());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void depositar(double valor){
        if (valor <= 0){
            throw new NegativeNumberException("O valor deve ser maior que zero.");
        }
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= 0){
            throw new NegativeNumberException("O valor deve ser maior que zero.");
        }

        if (getSaldoDisponivel() - valor < 0){
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }

        this.saldo -= valor;
    }

    public void sacar(double valor, double taxaSaque){
        sacar(valor + taxaSaque);
    }

    public void mudarNome(String nome){
        this.titular.setNome(nome);
        this.ultimaAtualizacao = LocalDateTime.now();
    }

    public void mudarTipoPessoa(TipoPessoa tipoPessoa){
        this.titular.setTipo(tipoPessoa);
        this.ultimaAtualizacao = LocalDateTime.now();
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Pessoa getTitular(){
        return this.titular;
    }

    public abstract double getSaldoDisponivel();
}
