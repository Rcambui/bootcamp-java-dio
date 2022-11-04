public class ExercicioMetodos {
    /*Crie metodos que realizem as 4 operacoes matematicas:
     * Soma, subtraçao, divisao e multiplicacao
     */

    public static void operacoes(double numero1, double numero2) {
        double resultadoSoma = numero1 + numero2;
        System.out.println("A soma dos dois valores é " + resultadoSoma);

        double resultadoSubtracao = numero1 - numero2;
        System.out.println("O resultado ta subtraçao é " + resultadoSubtracao);

        double resultadoMulti = numero1 * numero2;
        System.out.println("O resultado da multiplicacao é " + resultadoMulti);

        double resultadoDivisao = numero1 / numero2;
        System.out.println("O resultado da divisao é " + resultadoDivisao);
        
    }

    /* Crie um metodo que mande uma mensagem de acordo com a hora do dia */

    public static void mensagem(int hora) {
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Voce deve estar com o relogio quebrado, essa hora nao existe");
                break;
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Tenha um bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Tenha uma boa tarde");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Aproveite a noite e nao fique acordado ate tarde");
    }

    
}
