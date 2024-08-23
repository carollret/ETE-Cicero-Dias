import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        boolean valor1 = entrada.nextBoolean();

        System.out.print("Digite o segundo valor: ");
        boolean valor2 = entrada.nextBoolean();

        String resultado;

        if (valor1 && valor2) {
            resultado = "Ambos são VERDADEIRAS";
        }else if (!valor1 && !valor2){
            resultado = "Ambos são FALSOS";
        }else{
            resultado = "Ambos é MISTO";
        }
        System.out.println(resultado);

    }
}