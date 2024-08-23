import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE; // vai iniciar idadeMaisNova com o maior valor possível p/ tipo inteiro.

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite o " + (i + 1) + "º nome: ");
            String nome = entrada.nextLine();

            System.out.print("Digite a idade da pessoa: ");
            int idade = entrada.nextInt();
            entrada.nextLine(); //Ele vai captura meu enter, garantido a minha prox leitura.

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
        entrada.close();
    }
}
