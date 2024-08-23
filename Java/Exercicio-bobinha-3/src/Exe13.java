import java.util.Scanner;

public class Exe13 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int count = 0; //contagem

        for (int i = 0; i < 20; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            numero = entrada.nextInt();


            if(numero >= 0 && numero <=100){
                count++;
            }
        }
        System.out.println("A quantidade de números entre 0 a 100: " + count);
        entrada.close();
    }

}