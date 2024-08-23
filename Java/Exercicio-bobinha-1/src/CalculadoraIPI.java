import java.util.Scanner;
// IPI - importo sobre produtos industralizados
public class CalculadoraIPI {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI: ");
        double percentualIPI = entrada.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = entrada.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitarioPeca1 = entrada.nextDouble();
        System.out.print("Digite a quantidade de peças 1: ");
        int quantidadePeca1 = entrada.nextInt();

        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = entrada.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitarioPeca2 = entrada.nextDouble();
        System.out.print("Digite a quantidade de peças 2: ");
        int quantidadePeca2 = entrada.nextInt();

        double valorTotal = (valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2) * (percentualIPI / 100 + 1);

        System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotal);

    }
}