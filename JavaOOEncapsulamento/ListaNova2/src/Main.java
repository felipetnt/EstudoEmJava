
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Printer printer = new Printer();
        int qtdTotal = view.lerQuantidadeAcoes();
        Governo gov = view.lerGoverno(qtdTotal);
        Acao[] acoesPrioridade = gov.searchAcoesByPrioridade(true);
        Acao[] acoesTrimestre = gov.searchAcoesTrimestre("Terceiro");
        int qtd = gov.countAcoesAno(2017);
        printer.print("Todas acoes",gov.acoes);
        printer.print("Acoes Prioritarias",acoesPrioridade);
        printer.print("Acoes do Terceiro Semestre",acoesTrimestre);
        printer.print("Esta eh a quantidade de acoes executadas em ",qtd, 2017);
    }
}