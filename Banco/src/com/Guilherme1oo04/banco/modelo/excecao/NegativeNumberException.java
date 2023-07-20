package com.Guilherme1oo04.banco.modelo.excecao;

public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException(String message) {
        super(message);
    }
}
