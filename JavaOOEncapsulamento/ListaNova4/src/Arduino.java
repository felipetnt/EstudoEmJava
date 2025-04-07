public class Arduino { // Versao Dieciemila
    String codigo;
    int pinos;
    int entradasAnalogicas;
    double preco;
    boolean isMLP;

    public double getCustoTotal() {
        double custo = preco;
        if (isMLP) {
            custo += 0.50 * pinos;
        }
        if (entradasAnalogicas > 3) {
            custo *= 3;
        }
        return custo;
    }

    public String toString() {
        return "\nCodigo: " + codigo +
                "\nQuantidade pinos: " + pinos +
                "\nQuantidade de Entradas: " + entradasAnalogicas +
                "\nPreco: " + preco +
                "\nRecebe sinal MLP: " + isMLP;
    }
}
