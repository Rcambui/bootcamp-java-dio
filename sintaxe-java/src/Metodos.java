public class Metodos {
    //exemplo de metodo que retorna um valor:
    public int somar(int num1, int num2) {
        int soma = num1 + num2;
        return soma;
    }
    //metodos privados: nao podem ser vistos por outras classes
    private static void cadastrar() {
        System.out.println("Exemplo de metodo sem retorno");
    }
    public static void main(String[] args) {
       cadastrar();
       
    }
}
