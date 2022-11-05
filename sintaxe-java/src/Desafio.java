import java.util.Scanner;

public class Desafio {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

       int A = leitor.nextInt();
       int N = leitor.nextInt();
       System.out.println("Valor de A e N " + A + N);

       int i = A;
       int soma = 0;

       while (i <= N) {
            soma += i;
            i += A;
       }
       
       System.out.println("O valor é : " + soma);

       int num = leitor.nextInt();

       if (num % 3 == 0 && num % 5 == 0) {

       }

       int numero = leitor.nextInt();
       boolean verificacao = false;
       
       int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

       //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
       for (i = 0; i < elementos.length; i++) {
         if (numero == elementos[i]) {
           System.out.println("Achei " + numero + " na posicao " + i);
           verificacao = true;
           break;
         }
       }
       
       if (verificacao == false) {
         System.out.println("Numero " + numero + "nao encontrado!");
       }
    }
}
