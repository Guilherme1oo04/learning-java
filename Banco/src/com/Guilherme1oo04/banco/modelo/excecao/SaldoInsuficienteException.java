package com.Guilherme1oo04.banco.modelo.excecao;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
