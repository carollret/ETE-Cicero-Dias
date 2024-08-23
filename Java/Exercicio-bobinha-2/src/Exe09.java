import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Por favor, insira M para masculino ou F para feminino.");
            pesoIdeal = Double.NaN; //valor inválido
        }
        if (!Double.isNaN(pesoIdeal)) {
            System.out.printf("O peso ideal é: %.2f kg%n", pesoIdeal);
        }
    }
}