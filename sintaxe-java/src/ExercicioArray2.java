
import java.util.Random;

public class ExercicioArray2 {
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        /*Faça um programa que leia 20 numeros inteiros aleatorios 
         * (entre 0 e 100) e armazeneos em um vetor.
         * Ao final mostre os numeros e seus sucessores.
         */

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++ ) {
            int numero = aleatorio.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
            
        }

        System.out.println("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1)  + " ");
            
        }

        System.out.println();
        /*Gere e imprima uma matriz M 4x4 com valores
         * aleatorios entre 0 - 9.
         */

         int [][] M = new int[4][4];

         for (int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++) {
                M[i][j] = aleatorio.nextInt(9);
            }
         }

         for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
         }

    }
}
