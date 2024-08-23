import java.util.Scanner;

public class SaldoEmConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("## Saldo em conta ## \nDigite seu saldo: ");
        double saldo = entrada.nextDouble();
        double reajuste = saldo * 0.01;
        double saldoReajustado = saldo + reajuste;
        System.out.printf("\nSeu novo saldo com reajuste é %.2f%n", saldoReajustado);

    }
}