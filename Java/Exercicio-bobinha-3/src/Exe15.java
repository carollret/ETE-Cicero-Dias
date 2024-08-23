import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        double numero;

        while (true) {
            System.out.print("##Digite um número negativo para encerrar## \nDigite um número: ");
            numero = entrada.nextDouble();

            if (numero < 0) {
                break;
            }
            soma += numero;
        }
        System.out.println("A soma dois números é: " + soma);

    }
}