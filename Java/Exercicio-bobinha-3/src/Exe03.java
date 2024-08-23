import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        entrada.close();

        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
    }
}