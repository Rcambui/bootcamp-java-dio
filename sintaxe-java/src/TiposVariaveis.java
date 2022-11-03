

public class TiposVariaveis {
    public static void main(String[] args) {
       //Java uma linguagem fortemente tipada, entao sempre ficar atento aos tipos de dados das variaveis
       
       double salario = 2500.00;
       System.out.println(salario);
       
       /*O tipo float tem que sempre que terminar com um "f" minusculo ou maisculo. Dados do tipo Long tambem
       obedecem a mesma regra*/
       float altura = 1.90f;
       System.out.println(altura);
       long numeroLongo = 28472983472984L;
        System.out.println(numeroLongo);
       short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);
        char sexo = 'M';
        String mensagem = "Um texto usa o tipo de dado chamado String";
        boolean operadorLogico = true;
        System.out.println(sexo + mensagem + operadorLogico);
        //Date dataNascimento = new Date();

        /*Para se criar constantes usamos a palavra "final" no começo, e por conveçao colocamos
        o nome da constante em maisculo*/

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);


    }
}
