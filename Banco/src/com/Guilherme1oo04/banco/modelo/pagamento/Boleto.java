package com.Guilherme1oo04.banco.modelo.pagamento;

import com.Guilherme1oo04.banco.modelo.Pessoa;

public class Boleto implements DocumentoPagavel{

    private Pessoa beneficiario;
    private double valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
        this.pago = false;
    }

    @Override
    public double getValorTotal() {
        return this.valor;
    }

    @Override
    public boolean estaPago() {
        return this.pago;
    }

    @Override
    public void quitarPagamento() {
        this.pago = true;
    }

    public String getBeneficiario(){
        return beneficiario.getNome();
    }
}
