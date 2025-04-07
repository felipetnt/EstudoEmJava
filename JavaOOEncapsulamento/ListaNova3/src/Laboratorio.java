public class Laboratorio {
    String local;
    Item[] itens;
    ResponsavelT responsavelT;

    public int countLaboratorioItensType(Boolean itemType){
        int qtd = 0;
        for(Item item : itens){
            if(item.isType("TECNOLOGICO") == itemType){
                qtd++;
            }
        }
        return qtd;
    }

    public double custoLaboratorioItens(){
        double precoLab = 0;
        for(Item item : itens){
            precoLab += item.preco;
        }
        return precoLab;
    }
    public int countLaboratorioItens(){
        int qtd = 0;
        for(Item item : itens){
                qtd++;
        }
        return qtd;
    }
    public String toString(){
        String retorno =
                "O Local do laboratorio: " + local +
                "O responsavel do laboratorio: " + responsavelT +
                "Os itens do laboratorio: " ;
        for(Item item : itens){
            retorno += item.toString();
        }
        return retorno;
    }
}
