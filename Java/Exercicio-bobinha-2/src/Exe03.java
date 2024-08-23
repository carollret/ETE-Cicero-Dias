import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O numero " + num + " é par!");
        }else{
            System.out.printf("O número " + num + " é ímpar!" );
        }

    }
}