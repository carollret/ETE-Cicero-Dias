import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite um número: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(nome);
        }
        entrada.close();
    }
}