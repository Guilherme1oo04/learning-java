package com.Guilherme1oo04.banco.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaInvestimento extends Conta{
    public ContaInvestimento(String nome, String documento, int agencia, int numero){
        super(nome, documento, agencia, numero);
    }

    public void creditarRendimentos(double percentualJuros){
        BigDecimal valorRendimentos = this.getSaldo().multiply(new BigDecimal(String.valueOf(percentualJuros)))
                .divide(new BigDecimal("100"), 2, RoundingMode.HALF_EVEN);

        this.depositar(valorRendimentos.doubleValue());
    }

    @Override
    public BigDecimal getSaldoDisponivel() {
        return getSaldo();
    }
}
