public class JurosCompostos {
    public static void main(String[] args) {

        double valorAcumulado = 10_000;
        double taxaMensal = 0.8;
        int periodoMeses = 12;

        for (int mes = 1; mes <= periodoMeses; mes++){
            valorAcumulado += valorAcumulado * taxaMensal / 100;
            System.out.println("Mês " + mes + " = " + valorAcumulado);
        }

        double valorAcumulado2 = 10_000;
        double meta = 13_000;
        int quantidadeMeses = 0;

        while (valorAcumulado2 < meta){
            valorAcumulado2 += valorAcumulado2 * taxaMensal / 100;
            quantidadeMeses++;
        }

        int anos = (quantidadeMeses - (quantidadeMeses % 12)) / 12;
        quantidadeMeses = quantidadeMeses % 12;

        System.out.println("Conseguimos chegar à meta nesse investimento depois de " + anos + " anos e " + quantidadeMeses + " meses.");
    }
}
