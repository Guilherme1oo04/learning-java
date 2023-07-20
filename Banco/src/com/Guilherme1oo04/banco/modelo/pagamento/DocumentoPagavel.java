package com.Guilherme1oo04.banco.modelo.pagamento;

public interface DocumentoPagavel {
    double getValorTotal();
    boolean estaPago();
    void quitarPagamento();
}
