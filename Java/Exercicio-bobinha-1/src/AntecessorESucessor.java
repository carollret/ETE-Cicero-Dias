import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();
        int antecessor = num-1;
        int sucessor = num+1;

        System.out.printf("O numero é %d, seu sucessor é %d e seu antecessor é %d", num, num+1, antecessor);

    }
}