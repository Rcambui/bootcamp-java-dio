public class SobrecargaMetodo {

    /*Calcule a area de Quadrilateros diferentes usando sobrecarga de metodos */

    public static void area(double lado) {
        System.out.println("A area do quadrado é " + (lado * lado));
    }

    public static void area(double lado1, double lado2) {
        System.out.println("A area do retangulo é " + (lado1 * lado2));
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("A area do trapezio é " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("A area do losango é " + (diagonal1 * diagonal2) / 2);
    }
    
}
