public class ServiceAutodromo {
    public static double calcularMedia(Autodromo corrida){
        calcularSoma(corrida, Autodromo.somaTempos);
        Autodromo.mediaTempos = calcularMedia(Autodromo.somaTempos, Autodromo.quantidadePilotos); // somaTempos / qtdPilotos;
        return Autodromo.mediaTempos;
    }
    public static void calcularSoma(Autodromo corrida, double somaTempos) {
        for (Piloto piloto : corrida.pilotos){
            Autodromo.somaTempos = piloto.tempoDeVolta + Autodromo.somaTempos;
        }
    }
    public static double calcularMedia(double soma, double contagem){
        return soma / contagem;
    }
    public static void ranquearPilotos(Autodromo corrida){
        for (int i = 0; i < corrida.pilotos.length - 1; i++) {
            for (int j = 0; j < corrida.pilotos.length - i - 1; j++) {
                bubbleSort(corrida.pilotos, j, corrida);
            }
        }
    }
    public static void bubbleSort(Piloto[] pilotos ,int j, Autodromo corrida){
        if (corrida.pilotos[j].tempoDeVolta > corrida.pilotos[j + 1].tempoDeVolta) {
            bubbleSort(j, corrida);
        }
    }
    public static void bubbleSort(int j, Autodromo corrida){
        Piloto aux = corrida.pilotos[j];
        corrida.pilotos[j] = corrida.pilotos[j + 1];
        corrida.pilotos[j + 1] = aux;
    }
    public static void pilotoMaisRapido(Autodromo corrida){ // Metodo para selecionar o piloto mais rapido de acordo com o tanto de pilotos da corrida.
        corrida.pilotoMaisRapido = corrida.pilotos[0];
    }
    public static void pilotoMaisLento(Autodromo corrida){ // Metodo para selecionar o piloto mais lento de acordo com o tanto de pilotos da corrida.
        corrida.pilotoMaisLento = corrida.pilotos[corrida.pilotos.length - 1];
    }
}
