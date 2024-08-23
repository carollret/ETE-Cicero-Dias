import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("##Ver número da tabuata## \n" +
                "Digite um número: ");
        int numero = entrada.nextInt();

        int resultado = 0;

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
        System.out.printf("%d x %d = %d \n", numero, i, resultado);
        }

    }
}