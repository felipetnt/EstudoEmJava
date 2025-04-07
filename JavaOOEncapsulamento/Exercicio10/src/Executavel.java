public class Executavel {
    public static void main(String[] args) {
        Autodromo corrida = View.lerCorrida();
        //1.) Le primeiro a quantidade de pilotos informada pelo usuario
        //2. )Recebe pelo usuario o String - nome, String - escuderia, Int - TempoDeVolta
        Autodromo.mediaTempos = ServiceAutodromo.calcularMedia(corrida);
        //3.) Estabelece uma media entre o tempo dos pilotos, tendo assim - O valor da media.
        ServiceAutodromo.ranquearPilotos(corrida);
        //4.) De acordo com o video do bubblesort, eu recebo o array contendo o tempo de volta dos pilotos
        //4.1) E assim o programa testa o array e vai ordenando, na ordem do mais lento, para o mais rapido.
        ServiceAutodromo.pilotoMaisLento(corrida);
        //5.) Indentifica o piloto mais lento da corrida de acordo com sua posicao no array. [0] primeira posicao.
        //5.1) [numero de pilotos - 1, ja que o array comeca no 0.
        ServiceAutodromo.pilotoMaisRapido(corrida);
        //6) Expliquei no 5 sem querer.
        Printer.print(corrida);
        //7.)Printa a parada toda.
    }
}

