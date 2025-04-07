public class Governo {

    Acao[] acoes;

    public int countAcoesAno(int ano){
        int qtd = 0;
        for(Acao acao : acoes){
            if(acao.ano == ano){
                qtd++;
            }
        }
        return qtd;
    }

    public int countAcoesByPrioridade(boolean prioridade){
        int qtd = 0;
        for(Acao acao : acoes){
            if(acao.isPrioridade() == prioridade){
                qtd++;
            }
        }
        return qtd;
    }

    public Acao[] searchAcoesByPrioridade(boolean prioridade) {

        Acao[] acoesPrioridade = new Acao[countAcoesByPrioridade(prioridade)];
        int i = 0;
        for (Acao acao : acoes) {
            if (acao.isPrioridade() == prioridade) {
                acoesPrioridade[i++] = acao;
            }
        }
        return acoesPrioridade;
    }

    public int countAcoesTrimestre (String trimestre){
        int qtd = 0;
        for(Acao acao : acoes){
            if(acao.getTrimestre().equals(trimestre)){
                qtd++;
            }
        }
        return qtd;
    }

    public Acao[] searchAcoesTrimestre(String trimestre) {
        Acao[] acoesTrimestre = new Acao[countAcoesTrimestre(trimestre)];
        int i = 0;
        for (Acao acao : acoes) {
            if (acao.getTrimestre().equals(trimestre)) {
                acoesTrimestre[i++] = acao;
            }
        }
        return acoesTrimestre;
    }

    public double somaTempoExecucaoAcao(){
        double somatorio = 0;
        for (Acao acao : acoes){
            somatorio += acao.tempoExecucao;
        }
        return somatorio;
    }

}
