import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maiorDeIdade = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            int idade = entrada.nextInt();
            if (idade >= 18) {
                maiorDeIdade++;
            }
        }
        System.out.println("Número de pessoas maiores de idade: " + maiorDeIdade);
    }
}