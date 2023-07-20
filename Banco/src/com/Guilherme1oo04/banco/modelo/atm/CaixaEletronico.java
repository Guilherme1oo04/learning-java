package com.Guilherme1oo04.banco.modelo.atm;

import com.Guilherme1oo04.banco.modelo.Conta;
import com.Guilherme1oo04.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public double saldo(Conta conta){
        return conta.getSaldo();
    }

    public void pagar(DocumentoPagavel documento, Conta conta){
        if (documento.estaPago()){
            throw  new IllegalStateException("Este documento já está pago.");
        }

        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }
}
