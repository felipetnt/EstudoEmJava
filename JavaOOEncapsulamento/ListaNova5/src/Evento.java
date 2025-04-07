public class Evento {
    Atleta[] atletas = new Atleta[2];

    public int countAtletasElite(){
        int qtd = 0;
        for(Atleta atleta : atletas){
            if(atleta.isElite()){
                qtd++;
            }
        }
        return qtd;
    }

    public Atleta[] getAtletasElite(){
        Atleta[] atletasElite = new Atleta[countAtletasElite()];
        int i = 0;
        for(Atleta atleta : atletas){
            if(atleta.isElite()){
                atletasElite[i++] = atleta;
            }
        }
        return atletasElite;
    }

    public Atleta getMelhorAtleta(){
        int melhorTempoProva = 10000;
        Atleta melhorAtleta = atletas[0];
        for(Atleta atleta : atletas){
            if(atleta.tempoDeProva > melhorTempoProva){
                melhorAtleta = atleta;
            }
        }
        return melhorAtleta;
    }

    public int countAtletasIdade(int max, int min){
        int count = 0;
        for(Atleta atleta : atletas){
            if(atleta.idade > min && atleta.idade < max){
                count++;
            }
        }
        return count;
    }

    public Atleta [] getAtletasIdade (int max, int min){
        Atleta[] atletasFaixaIdade = new Atleta[countAtletasIdade(max, min)];
        int i = 0;
        for(Atleta atleta : atletas){
            if(atleta.idade > min && atleta.idade < max){
                atletasFaixaIdade[i++] = atleta;
            }
        }
        return atletasFaixaIdade;
    }

    public double getSomaTempos(){
        double somaTempos = 0;
        for(Atleta atleta : atletas){
            somaTempos += atleta.tempoDeProva;
        }
        return somaTempos;
    }

    public double getMedia(double somaTempos, int totalCompetidores){
        double media;
        media = somaTempos / totalCompetidores;
        return media;
    }

}
