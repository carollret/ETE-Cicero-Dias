import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = entrada.nextInt();

        int C;

        if (A == B) {
            C = A * B;
        }else {
            C = A + B;
        }
        System.out.printf("O valor de C é: " + C);
    }
}
