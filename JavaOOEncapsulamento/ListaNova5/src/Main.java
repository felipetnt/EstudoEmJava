//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Evento evento = View.lerEvento(2); // quantidade que o requerente pedir.
        Atleta[] atletasElite = evento.getAtletasElite();
        Atleta melhorAtleta = evento.getMelhorAtleta();
        Atleta[] atletasFaixaIdade = evento.getAtletasIdade(30, 34);
        double mediaTempos = evento.getMedia(evento.getSomaTempos(), 2);
        Printer.print(atletasElite);
        Printer.print(atletasFaixaIdade);
        Printer.print("O melhor atleta da competicao foi: ", melhorAtleta);
        Printer.print("A media dos tempos da competicao foi: ", mediaTempos);

    }
}