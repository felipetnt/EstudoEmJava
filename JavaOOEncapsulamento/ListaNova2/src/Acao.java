public class Acao {
    String descricao;
    int mes;
    int ano;
    int tempoExecucao;
    public boolean isPrioridade(){
        return ano >= 2015 && ano <= 2016;
    }

    public String getPrioridade(){
        if(isPrioridade()){
            return "Prioritaria";
        } else {
            return "Nao Prioritaria";
        }
    }

    public String getTrimestre(){
        if(mes >= 1 && mes <= 3){
            return "Primeiro";
        } else {
            if(mes >= 4 && mes <= 6){
                return "Segundo";
            } else {
                if(mes >= 7 && mes <= 9){
                    return "Terceiro";
                } else {
                    return "Quarto";
                }
            }
        }
    }
    public String toString(){
        return "Descricao: "+ descricao + "\n" +
                "Mes: " + mes + "\n" +
                "Ano: " + ano + "\n" +
                "Prioridade: " + getPrioridade() + "\n" +
                "Trimestre: " + getTrimestre();
    }
}
