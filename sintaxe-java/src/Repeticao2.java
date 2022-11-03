import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Faça um programa que leia 5 numeros
         * e informe o maior numero
         * e a media desses numeros.
         */

         int numero;
         int maior = 0;
         int indice = 0;
         int soma = 0;

         do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if(numero > maior) maior = numero;
            soma += numero;
            indice += 1;
         } while(indice < 5);

         System.out.println("Maior numero: " + maior);
         System.out.println("A media dos numeros: " + (soma/5));

         /*faca um programa que peça N numeros inteiros, calcule e
          * mostre a quantidade de numeros pares e numeros impares.
          */

          int quantidadeNumeros;
          int numero2;
          int pares = 0;
          int impares = 0;
          int i = 0;

          System.out.println("Quantos numeros: ");
          quantidadeNumeros = scan.nextInt();

          do {
            System.out.println("Digite um numero: ");
            numero2 = scan.nextInt();
            if (numero2 % 2 == 0) {
                pares ++;
            } else {
                impares ++;
            }
            i ++;
          } while(i < quantidadeNumeros);

          System.out.println("A quantidade de numeros pares é: " + pares + " ,e a de numeros impares é: " + impares);
    
    }
}
