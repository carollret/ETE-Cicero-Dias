import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite o código da condição de pagamento (1 a 4): ");
        int codigoPagamento = scanner.nextInt();

        double valorAPagar;

        switch (codigoPagamento) {
            case 1:
                valorAPagar = preco * 0.90;
                break;
            case 2:
                valorAPagar = preco * 0.85;
                break;
            case 3:
                valorAPagar = preco;
                break;
            case 4:
                valorAPagar = preco * 1.10;
                break;
            default:
                System.out.println("Código de pagamento inválido.");
                valorAPagar = Double.NaN;
                break;
        }
        if (!Double.isNaN(valorAPagar)) {
            System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
        }
    }
}