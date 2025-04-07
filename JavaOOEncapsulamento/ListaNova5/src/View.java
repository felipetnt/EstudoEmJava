public class View {
    public static Atleta lerAtleta() {
        Atleta atleta = new Atleta();
        atleta.nome = Leitura.lerString("Digite seu nome como atleta:  ", "Nome invalido... ", 3, 50);
        atleta.numeroInscricao = Leitura.lerString("Digite seu numero de Inscricao: ");
        atleta.tempoDeProva = Leitura.lerInt("Digite seu tempo de prova: ", "Tempo de prova invalido... " ,0, 8);
        atleta.idade = Leitura.lerInt("Digite seu idade: ", "Idade invalida... " ,0, 100);
        return atleta;
    }

    public static Evento lerEvento(int limite) {
        Evento evento = new Evento();
        for (int i = 0; i < limite; i++) {
            evento.atletas[i] = lerAtleta();
        }
        return evento;
    }

}
