//Calculo do IMC
import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String condicao;
        if (imc < 18.5) {
            condicao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            condicao = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            condicao = "Acima do peso";
        } else {
            condicao = "Obeso";
        }
        System.out.printf("O seu IMC é: %.2f%n", imc);
        System.out.println("Condição: " + condicao);
    }
}
