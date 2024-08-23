public class MediaAritmetica {
    public static void main(String[] args) {

        int[] num1 = {8, 9, 7};
        double media1 = calcularMedia(num1);

        int[] num2 = {4, 5, 6};
        double media2 = calcularMedia(num2);
        double somaDasMedias = media1 + media2;
        double mediaDasMedias = somaDasMedias / 2;

        System.out.print("\nA média dos números (8, 9 e 7) é " + media1);
        System.out.print("\nA média dos números (4, 5 e 6) é " + media2);
        System.out.print("\nSomando as duas é  " + somaDasMedias);
        System.out.print("\nA média das medias é " + somaDasMedias);
    }
        private static double calcularMedia(int[] numeros) {
            int soma = 0;
            for (int numero : numeros) {
                soma += numero;
            }
            return (double) soma / numeros.length;

    }


}

