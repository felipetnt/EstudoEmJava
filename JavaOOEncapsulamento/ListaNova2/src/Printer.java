public class Printer {
//    public void print(Governo governo) {
//        printTotal(governo.acoes);
//        printPrioritarios(governo.searchAcoesByPrioridade(true));
//        printTrimestre(governo.searchAcoesTrimestre());
//    }
    public void print(String msg, Acao[] acoes){
        System.out.println(msg);
        print(acoes);
    }
    public void print(Acao[] array) {
        for(Acao acao: array){
            System.out.println(acao);
        }
    }
    public void print(String msg, int quantidade, int ano) {
        System.out.println(msg+ano+": " + quantidade);
    }
}
