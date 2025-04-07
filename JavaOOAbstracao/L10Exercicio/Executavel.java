package L10Exercicio;
public class Executavel {
    public static void main(String[] args) {
        Autodromo corrida = Leitura.lerCorrida();
        Autodromo.mediaTempos = ServiceAutodromo.calcularMedia(corrida);
        ServiceAutodromo.rankearPilotos(corrida);
        ServiceAutodromo.atribuirMaisLento(corrida);
        ServiceAutodromo.atribuirMaisRapido(corrida);
        Printer.printCorrida(corrida);
    }
}

