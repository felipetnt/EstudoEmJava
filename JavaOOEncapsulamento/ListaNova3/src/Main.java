//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universidade uni = View.lerUniversidade();
        Laboratorio[] laboratoriosByResponsavel = uni.searchLaboratoriosByResponsavel("ANALISTA");
        int quantidadeItensByType = uni.countTotalItensType(true);
        double custoTotal = uni.custoUniversidadeItens();
        int quantidadeItens = uni.countTotalItens();
        Printer.print("Aqui esta todos os laboratorios que tem como responsavel ", laboratoriosByResponsavel);
        Printer.print("A quantidade de itens de tecnologia na Universidade eh: ", quantidadeItensByType);
        Printer.print("Aqui esta o custo total da Universidade eh: ", custoTotal);
        Printer.print("Aqui esta todos os locais dos laboratorios: ", uni.laboratorios, quantidadeItens);
    }
}