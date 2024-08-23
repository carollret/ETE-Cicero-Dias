import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int count0to100 = 0;
        int count101to200 = 0;
        int countGreaterThan200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            int numero = entrada.nextInt();

            if (numero >= 0 && numero <= 100) {
                count0to100++;
            } else if (numero >= 101 && numero <= 200) {
                count101to200++;
            } else if (numero > 200) {
                countGreaterThan200++;
            }
        }
        System.out.println("Quantidade de números entre 0 e 100: " + count0to100);
        System.out.println("Quantidade de números entre 101 e 200: " + count101to200);
        System.out.println("Quantidade de números maiores que 200: " + countGreaterThan200);
        entrada.close();
    }
}