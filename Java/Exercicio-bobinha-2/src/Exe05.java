import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = entrada.nextDouble();
        double resultado;

        if (num > 0) {
            resultado = 2 * num;

        }else if ( num < 0) {
            resultado = 3 * num;

        } else {
            resultado = 0;
        }
        System.out.printf("O resultado é: %.2f%n", resultado);
        entrada.close();

    }

}