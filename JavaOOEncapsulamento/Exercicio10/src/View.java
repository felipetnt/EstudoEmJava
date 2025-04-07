public class View {
    public static Autodromo lerCorrida(){
        Autodromo.quantidadePilotos = Leitura.lerInt("Quantos pilotos participaram da corrida?");
        return lerCorrida(Autodromo.quantidadePilotos);
    }
    public static Autodromo lerCorrida(int qtdPilotos){
        Autodromo corrida = new Autodromo();
        corrida.pilotos = new Piloto[qtdPilotos];
        lerCorrida(corrida);
        return corrida;
    }
    public static void lerCorrida(Autodromo corrida){
        for (int i = 0; i < corrida.pilotos.length; i++) {
            corrida.pilotos[i] = lerPilotos();
        }
    }
    public static Piloto lerPilotos() {
        Piloto piloto = new Piloto();
        piloto.nome = Leitura.lerString("Informe o nome do piloto");
        piloto.escuderia = Leitura.lerString("Informe a escuderia do piloto");
        piloto.tempoDeVolta = Leitura.lerInt("Informe o tempo do piloto em minutos.", "Voce inseriu um minuto invalido por favor insira novamente.", 1, 60);
        return piloto;
    }
}
