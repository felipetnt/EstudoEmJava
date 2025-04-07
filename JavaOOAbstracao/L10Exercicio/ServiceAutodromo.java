package L10Exercicio;
public class ServiceAutodromo {
    public static double calcularMedia(Autodromo corrida){
        double qtdPilotos = 0;
        double somaTempos = 0;
        for (Piloto piloto : corrida.pilotos){
            qtdPilotos++;
            somaTempos = piloto.tempoDeVolta + somaTempos;
        }
        corrida.mediaTempos = somaTempos / qtdPilotos;
        return corrida.mediaTempos;
    }
    public static void rankearPilotos(Autodromo corrida){

        for (int i = 0; i < corrida.pilotos.length - 1; i++) {
            for (int j = 0; j < corrida.pilotos.length - i - 1; j++) {
                if (corrida.pilotos[j].tempoDeVolta > corrida.pilotos[j + 1].tempoDeVolta) {
                    Piloto aux = corrida.pilotos[j];
                    corrida.pilotos[j] = corrida.pilotos[j + 1];
                    corrida.pilotos[j + 1] = aux;
                }
            }
        }
    }

    public static void atribuirMaisRapido(Autodromo corrida){
        corrida.pilotoMaisRapido = corrida.pilotos[0];
    }

    public static void atribuirMaisLento(Autodromo corrida){
        corrida.pilotoMaisLento = corrida.pilotos[corrida.pilotos.length - 1];
    }
}
