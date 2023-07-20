package com.Guilherme1oo04.banco.modelo.pagamento;

public interface DocumentoPagavel {
    double getValorTotal();
    boolean estaPago();
    void quitarPagamento();
    default void recibo(){
        System.out.println("RECIBO:");
        System.out.println("Valor total: " + this.getValorTotal());
        System.out.println("Pago: " + this.estaPago());
    }
}
