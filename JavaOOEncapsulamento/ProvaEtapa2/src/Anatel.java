public class Anatel {
    Franquia []franquias = new Franquia[0];

    public void adicionar (Franquia franquia){
        if(franquias == null){
            franquias = new Franquia[0];
        }
        Franquia [] franquiasTemp = new Franquia[franquias.length + 1];
        int i = 0;
        for(Franquia fran : franquias){
            franquiasTemp[i++] = fran;
        }
        franquiasTemp[i] = franquia;
        franquias = franquiasTemp;
    }

    public int countFranquiasByGB(int limite){
        int count = 0;
        for(Franquia franquia : franquias){
            if(franquia.quantidadeGB == limite){
                count++;
            }
        }
        return count;
    }

//    public String toString(){
//        String s = "";
//        for(Franquia franquia : franquias) {
//            s += franquia.toString();
//        }
//        return s;
//    }

    public String toString(){
        String s = "";
        for(int i = 0; i < franquias.length; i++){
            s += franquias[i].toString();
        }
        return s;
    }
}
