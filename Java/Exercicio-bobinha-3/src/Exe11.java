import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ContadorMaiorQueOito = 0;

        for (double i = 0; i < 20; i++) {

            System.out.print("Digite um número: ");
            double numero = entrada.nextDouble();
            entrada.nextLine();

            if ( numero > 8) {
                ContadorMaiorQueOito +=1;

            }
            System.out.printf("A quantidades maiores que 8 é: " + ContadorMaiorQueOito);
        }
    }
}