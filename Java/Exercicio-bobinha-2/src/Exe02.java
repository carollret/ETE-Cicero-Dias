import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        String sexo;
        String estadoCivil;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite seu sexo (M/F): ");
        sexo = entrada.nextLine().trim().toUpperCase();

        System.out.print("Digite seu estado civil: ");
        estadoCivil = entrada.nextLine().trim().toUpperCase();

        if (sexo.equals("F") && estadoCivil.equals("CASADA")) {
            System.out.print("Quanto tempo de casada (em anos): ");
            int tempoCasada = entrada.nextInt();

            System.out.println(nome + ", você está casada há " + tempoCasada + " anos.");
        } else {
            System.out.println(nome + ", você não é casada!");
        }
        entrada.close();
    }
}