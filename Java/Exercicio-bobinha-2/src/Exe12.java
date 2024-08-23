import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de identificação do aluno: ");
        String numeroIdentificacao = scanner.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double ma = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        String conceito;
        if (ma >= 90) {
            conceito = "A";
        } else if (ma >= 75) {
            conceito = "B";
        } else if (ma >= 60) {
            conceito = "C";
        } else if (ma >= 40) {
            conceito = "D";
        } else {
            conceito = "E";
        }
        String aprovacao = conceito.equals("A") || conceito.equals("B") || conceito.equals("C") ? "Aprovado" : "Reprovado";

        System.out.printf("Número de identificação: %s%n", numeroIdentificacao);
        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Nota 3: %.2f%n", nota3);
        System.out.printf("Média dos exercícios: %.2f%n", mediaExercicios);
        System.out.printf("Média de aproveitamento: %.2f%n", ma);
        System.out.printf("Conceito: %s%n", conceito);
        System.out.println(aprovacao);
    }
}
