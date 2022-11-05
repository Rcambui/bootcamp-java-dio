

public class Result {

    /*
     * Complete the 'calcularResultado' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING url as parameter.
     */

    public static int calcularResultado(String url) {
        int indexIni = 0;
        int indexFim = 0;
        int contadorIgual = 0;
        int contadorFim = 0;
        int base = 0;
        int delta = 0;
        int altura = 0;
        for (int i = 0; i < url.length(); i++) {
            if(url.charAt(i) == '=') {
                indexIni = i;
                contadorIgual++;
            }
            if (url.charAt(i) == '&') {
                indexFim = i;
                contadorFim++;
            }
            if (contadorIgual == 3) {
                altura = Integer.parseInt(url.substring(indexIni + 1, url.length()));
            } else if (contadorIgual == 2 && contadorFim == 2) {
                delta = Integer.parseInt(url.substring(indexIni + 1, indexFim));
            } else if (contadorIgual == 1 && contadorFim == 1) {
                base = Integer.parseInt(url.substring(indexIni + 1, indexFim));
            }
        }
        return (base + delta) * altura;
    }

} 
    

