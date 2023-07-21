package com.Guilherme1oo04.banco.modelo.atm;

import com.Guilherme1oo04.banco.modelo.Conta;
import com.Guilherme1oo04.banco.modelo.pagamento.DocumentoEstornavel;
import com.Guilherme1oo04.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public double saldo(Conta conta){
        return conta.getSaldo().doubleValue();
    }

    public void pagar(DocumentoPagavel documento, Conta conta){
        if (documento.estaPago()){
            throw  new IllegalStateException("Este documento já está pago.");
        }

        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta contaEnviarEstorno){
        if (!documento.estaPago()){
            throw new IllegalStateException("Documento não está pago.");
        }

        contaEnviarEstorno.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }
}
