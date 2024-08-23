import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contagemPares = 0;
        int numero;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                contagemPares++;
            }
        }
        System.out.println("Quantidade de números pares: " + contagemPares);
        entrada.close();
    }
}