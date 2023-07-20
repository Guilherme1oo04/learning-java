package com.Guilherme1oo04.banco.modelo.pagamento;

import com.Guilherme1oo04.banco.modelo.Conta;

public class Holerite implements DocumentoPagavel{

    private Conta contaFuncionario;
    private String funcionario;
    private double valorHora;
    private int quantidadeHoras;
    private boolean pago;

    public Holerite(Conta contaFuncionario, double valorHora, int quantidadeHoras) {
        this.contaFuncionario = contaFuncionario;
        this.funcionario = this.contaFuncionario.getTitular().getNome();
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double getValorTotal() {
        return this.valorHora * this.quantidadeHoras;
    }

    @Override
    public boolean estaPago() {
        return this.pago;
    }

    @Override
    public void quitarPagamento() {
        this.contaFuncionario.depositar(this.getValorTotal());
        this.pago = true;
    }
}
