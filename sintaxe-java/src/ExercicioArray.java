import java.util.Scanner;

public class ExercicioArray {
    public static void main(String[] args) {
        /* Crie um vetor de 6 numeros inteiros
         * e mostre-os na ordem inversa.
         */
        int[] vetor = {-6, -5, 15, 50, 8, 4};
        int indice = 0;
        
        System.out.print("Vetor: ");
        while(indice < vetor.length) {
            System.out.print(vetor[indice] + " ");
            indice++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
            
        }

        /* Faça um programa que leia um vetor de 6 caracteres, e
         * diga quantas consoantes foram lidas.
         * Imprima as consoantes.
         */

        System.out.println("");
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int index = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") || 
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u"))) {
                    consoantes[index] = letra;
                    quantidadeConsoantes++;
             }

             index++;
        } while(index < consoantes.length);

        System.out.println("Quantidade: " + quantidadeConsoantes);
        System.out.println("Consoantes: ");
        for (String conso : consoantes) {
            if (conso != null)
            System.out.print(conso + " " );
        }
    }
}
