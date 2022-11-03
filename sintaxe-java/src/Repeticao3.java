import java.util.Scanner;

public class Repeticao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Desenvolva um gerador de tabuada,
         * capaz de gerar a tabuada de qualquer numero inteiro entre 1 e 10.
         * O usuario deve informar de qual numero ele deseja ver a tabuada
         */

        int numero;
        
         System.out.println("Digite o numero que gostaria de ver a tabuada: ");
         numero = scan.nextInt();

         System.out.println("Tabuada de " + numero + ":");

         for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));

         }
            /*Faça um programa que calcule a fatorial de um numero inteiro
             * Ex: 5! = 120 (5 x 4 x 3 x 2 x 1)
             */

            int fatorial;
            int multiplicacao = 1;

            System.out.println("Digite o numero: ");
            fatorial = scan.nextInt();

            for(int x = fatorial; x >= 1; x-- ) {
                multiplicacao *= x;
            }

            System.out.println("O fatorial de " + fatorial + " é: " + multiplicacao);
     }
}

