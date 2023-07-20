package com.Guilherme1oo04.banco.app;

import com.Guilherme1oo04.banco.modelo.atm.CaixaEletronico;
import com.Guilherme1oo04.banco.modelo.ContaEspecial;
import com.Guilherme1oo04.banco.modelo.ContaInvestimento;
import com.Guilherme1oo04.banco.modelo.pagamento.Boleto;
import com.Guilherme1oo04.banco.modelo.pagamento.DocumentoPagavel;
import com.Guilherme1oo04.banco.modelo.pagamento.Holerite;

public class Principal {
    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento("Guilherme Chaves", "254768", 18, 4895);
        minhaConta.depositar(5_000);
        minhaConta.sacar(200, 40);
        minhaConta.creditarRendimentos(0.6);

        DocumentoPagavel boletoLuz = new Boleto(minhaConta.getTitular(), 100);

        minhaConta.info();
        caixaEletronico.pagar(boletoLuz, minhaConta);

        System.out.println(" ");
        System.out.println(minhaConta.getTitular().getNome() + " pagou a conta: " + boletoLuz.estaPago());
        System.out.println("Saldo atual: " + caixaEletronico.saldo(minhaConta));

        System.out.println(" ");

        // caixaEletronico.pagar(boletoLuz, minhaConta);

        ContaEspecial suaConta = new ContaEspecial("Pessoa aleatória", "645739", 47, 8584, 1_000);
        suaConta.depositar(7_000);
        suaConta.sacar(5_600, 20);
        suaConta.info();

        System.out.println(" ");

        DocumentoPagavel holerite1 = new Holerite(minhaConta, 150, 11);
        caixaEletronico.pagar(holerite1, suaConta);
        System.out.println(suaConta.getTitular().getNome() + " pagou o holerite: " + holerite1.estaPago());
        System.out.println("Saldo atual: " + caixaEletronico.saldo(suaConta));
    }
}
