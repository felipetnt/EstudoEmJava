public class Printer {
    public static void print(Piloto piloto){
        System.out.println("Nome do piloto: " + piloto.nome);
        System.out.println("Escuderia: " + piloto.escuderia);
        System.out.println("Tempo de volta: " + piloto.tempoDeVolta);
    }
    public static void print(Piloto[] pilotos){
        for (Piloto piloto : pilotos) {
            print(piloto);
        }
    }
    public static void print(Autodromo corrida){
        print(corrida.pilotos);
        System.out.println("O tempo medio dos pilotos foi: " + Autodromo.mediaTempos);// Sempre que disser no CONJUNTO - Autodromo.
        System.out.println("O piloto mais rapido foi: " + corrida.pilotoMaisRapido.nome + " com o tempo de " + corrida.pilotoMaisRapido.tempoDeVolta + " minutos.");
        System.out.println("O piloto mais lento foi: " + corrida.pilotoMaisLento.nome + " com o tempo de " + corrida.pilotoMaisLento.tempoDeVolta + " minutos.");
        //Sempre que disser no singular, piloto. obs: Se pergunte mais sobre o objeto.
    }
}