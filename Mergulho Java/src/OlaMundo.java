public class OlaMundo {
    public static void main(String[] args){
        System.out.println("Hello world!");

        String nome = "Guilherme Chaves";
        System.out.println("Olá " + nome + "!");

        int idade = 17;
        System.out.println(nome + " tem " + idade + " anos.");

        int dataNascimento = 2023 - idade;
        System.out.println("Ele nasceu em " + dataNascimento + ".");

        double preco = 85.90d;

        float preco2 = 84.70f;

        boolean maiorDeIdade = idade >= 18;
        if (maiorDeIdade){
            System.out.println("Guilherme é maior de idade!");
        } else {
            System.out.println("Guilherme não é maior de idade!");
        }

    }
}
