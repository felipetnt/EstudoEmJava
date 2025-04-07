package L10Exercicio;
public class Printer {
    public static void printPiloto(Piloto piloto){
        System.out.println("Nome do piloto: " + piloto.nome);
        System.out.println("Escuderia: " + piloto.escuderia);
        System.out.println("Tempo de volta: " + piloto.tempoDeVolta);
    }
    public static void printCorrida(Autodromo corrida){
        for (Piloto piloto : corrida.pilotos) {
            printPiloto(piloto);
        }
        System.out.println("O tempo médio da corrida foi de: " + Autodromo.mediaTempos);
        System.out.println("O piloto mais rápido foi " + corrida.pilotoMaisRapido.nome + " com o tempo de " + corrida.pilotoMaisRapido.tempoDeVolta + " minutos.");
        System.out.println("O piloto mais lento foi " + corrida.pilotoMaisLento.nome + " com o tempo de " + corrida.pilotoMaisLento.tempoDeVolta + " minutos.");
    }
}