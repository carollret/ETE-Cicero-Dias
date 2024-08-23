import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int media = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();
            soma += idade;
            media = idade/20;
        }
        System.out.println("A média das idades é: " + media);
        entrada.close();
    }

}