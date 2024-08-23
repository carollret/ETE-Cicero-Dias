import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salariosMinimos = 1412.00;

        System.out.print("Digite seu salário R$ ");
        double meuSalario = entrada.nextDouble();

        System.out.printf("Você ganha aproximadamente %.2f salários mínimos.%n", meuSalario/salariosMinimos);
    }
}