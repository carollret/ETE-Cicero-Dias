import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = entrada.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = entrada.nextInt();

        if ((A + B) > C) {
            System.out.print("A soma de A e B é maior que C.");
        }else {
            System.out.print("A soma de A e B não e maior que C.");
        }

    }
}
