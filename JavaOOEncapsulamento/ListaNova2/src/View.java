public class View {
    public int lerQuantidadeAcoes(){

        Leitura leitura = new Leitura();
        int qtd;
        return qtd = leitura.lerInt("Apresente a quantidade de acoes:");

    }

    public void popular(Governo governo, int qtd){
        governo.acoes = lerAcoes(qtd);
    }

    public Governo lerGoverno(int qtd) {
        Governo gov = new Governo();
        gov.acoes = lerAcoes(qtd);
        return gov;
    }

    public Acao[] lerAcoes(int qtd) {
        Acao [] acoes = new Acao[qtd];
        for(int i = 0; i < acoes.length; i++){
            acoes[i] = lerAcao();
        }
        return acoes;
    }

    public Acao lerAcao(){
        Acao acao = new Acao();
        Leitura leitura = new Leitura();
        acao.descricao = leitura.lerString("Insira a descricao da acao: ");
        acao.ano = leitura.lerInt("Insira o ano da acao: ", "Insira um ano valido...", 2015, 2020);
        acao.mes = leitura.lerInt("Insira o mes da acao: ", "Insira o mes valido...", 1, 12);
        return acao;
    }

}
