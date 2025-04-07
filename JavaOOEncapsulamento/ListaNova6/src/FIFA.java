public class FIFA {

    Jogador[] jogadores;

    public Jogador getMelhorJogador() {
        Jogador melhorJogador = jogadores[0];
        for(Jogador jogador : jogadores){
            if(jogador.getQuantidadeGols() > melhorJogador.getQuantidadeGols()){
                melhorJogador = jogador;
            }
        }
        return melhorJogador;
    }
    public int countJogadoreByQualificacao(String qualificacao) {
        int count = 0;
        for(Jogador jogador : jogadores){
            if(jogador.qualificacao().equals(qualificacao)){
                count++;
            }
        }
        return count;
    }

    public Jogador[] getJogadoresByQualificacao(int contagem, String qualificacao) {
        Jogador[] jogadoresMedianos = new Jogador[contagem];
        int i = 0;
        for(Jogador jogador : jogadores){
            if(jogador.qualificacao().equals(qualificacao)){
                jogadoresMedianos[i++] = jogador;
            }
        }
        return jogadoresMedianos;
    }

    public double somaDeGolsIdade(int idade){
        double soma = 0;
        for(Jogador jogador : jogadores){
            if(jogador.getQuantidadeGols() > idade){
                soma += jogador.getQuantidadeGols();
            }
        }
        return soma;
    }

    public int countJogadoresIdade(int idade) {
        int count = 0;
        if(getMelhorJogador().getIdade() >= idade){
            count++;
        }
        return count;
    }

    public double getMedia(double soma, int quantidade){
        double media;
        media = soma / quantidade;
        return media;
    }

    public double getCustoTotal(){
        double custoTotal = 0;
        for(Jogador jogador : jogadores){
            custoTotal += jogador.salario();
        }
        return custoTotal;
    }
}
