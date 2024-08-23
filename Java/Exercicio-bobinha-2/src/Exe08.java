import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();

        int maior, medio, menor;  //ordem decrescente

        // Determina o maior, o médio e o menor
        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
            if (valor2 > valor3) {
                medio = valor2;
                menor = valor3;
            } else {
                medio = valor3;
                menor = valor2;
            }
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
            if (valor1 > valor3) {
                medio = valor1;
                menor = valor3;
            } else {
                medio = valor3;
                menor = valor1;
            }
        } else {
            maior = valor3;
            if (valor1 > valor2) {
                medio = valor1;
                menor = valor2;
            } else {
                medio = valor2;
                menor = valor1;
            }
        }
        System.out.println("Os valores em ordem decrescente são: " + maior + ", " + medio + ", " + menor);
    }
}
