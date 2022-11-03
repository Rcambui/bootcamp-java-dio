

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos
        double soma = 10.5 + 15.4;
        System.out.println(soma);
        int subtracao = 113 -25;
        System.out.println(subtracao);
        int multiplicacao = 20 * 7;
        System.out.println(multiplicacao);
        int divisao = 15 / 3;
        System.out.println(divisao);
        int modulo = 18 % 3;
        System.out.println(modulo);
        double resultadoCalculo = (10 * 7) + (20 / 4);
        System.out.println(resultadoCalculo);
        /*Operadores Unarios: Esses operadores sao aplicados juntamente com um outro
         * operador aritmetico. Eles realizam alguns trabalhos básicos ccomo incrementar, 
         * decrementar, inverter valores numericos e boleanos.
         * (++) Operador unário de incremento de valor - incrementa o valor em 1 unidade.
         * (--) Operador unário de decremento de valor - decrementa o valor em 1 unidade
         * (!) Operador unário lógico de negaçao - nega o valor de uma expressao booleana
         */

         int numero = 5;
         numero++;
         // isso é igual a numero = numero + 1
         System.out.println(numero);
         int numero2 = 5;
         numero2--;
         // isso é igual a numero2 = numero2 - 1
         System.out.println(numero2);

         boolean condicao = true;
         condicao = !condicao;
         System.out.println(condicao);

         /* O operador de Condiçao Ternaria é uma forma resumida para definir uma condiçao e escolher por
          um dentre dois valores. Voce deve pensar numa condicao ternaria como se fosse uma condicao IF 
          normal, porem, de uma forma em que toda a sua estrutura estara escrita numa unica linha.
          Ele é representado pelos simbolos "?:"
          */

          int nota = 7;
          String resultado = nota>6 ? "Aprovado" : "Reprovado";
          System.out.println(resultado);
    

        //Operadores Relacionais
        /* == Simbolo de comparacao igualdade
        * != Simbolo de comparacao diferenca
        * < menor que
        * <= menor igual que
        * > maiaor que
        * >= maior ou igual que
        */

        int num1 = 1;
        int num2 = 2;
        boolean simNao = num1 == num2;

        System.out.println ("Numero 1 é igual ao Numero 2? " + simNao);
        
        if (num1 < num2) {
            System.out.println("A nossa condicao é verdadeira");
        } else {
            System.out.println("Numero 1 é maior que numero 2");
        }

        // Operadores Logicos
        /* && Operador Logico "E"
         * || Operador Logico "OU"
         */

         boolean condicao1 = true;
         boolean condicao2 = false;

         if (condicao1 && condicao2) {
            System.out.println("As duas condicoes sao verdadeiras");
        } else if(condicao1 || condicao2) {
            System.out.println("Uma das condicoes é verdadeira");
        }
    }
}
