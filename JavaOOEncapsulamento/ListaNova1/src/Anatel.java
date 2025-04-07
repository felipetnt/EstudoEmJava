public class Anatel {
    public static int quantidadeFranquias;
    Franquia[] franquias;
    Franquia[] franquiasVivo;
    Franquia[] franquiasGbMaior2;
    Franquia[] franquiasDataExpiracao;
    Franquia franquiaMaisBarata;
    int quantidadeFranquiasVivo = 0;
    int quantidadeFranquiasGb = 0;
    int quantidadeFranquiasDataExpiracao = 0;
    public static void ranquear(Anatel anatel) {
        for (int i = 0; i < anatel.franquias.length; i++) {
            for (int j = 0; j < anatel.franquias.length - i - 1; j++) {
                bubbleSort(anatel.franquias, j, anatel);
            }
        }
    }
    public static void bubbleSort(Franquia[] franquias ,int j, Anatel anatel){
        if (anatel.franquias[j].preco > anatel.franquias[j + 1].preco) {
            bubbleSort(j, anatel);
        }
    }
    public static void bubbleSort(int j, Anatel anatel){
        Franquia aux = anatel.franquias[j];
        anatel.franquias[j] = anatel.franquias[j + 1];
        anatel.franquias[j + 1] = aux;
    }
    public static void franquiaMaisBarata(Anatel anatel){
        anatel.franquiaMaisBarata = anatel.franquias[0];
    }
    public static void isVivo(Anatel anatel){
        int i = 0;
        isVivo(anatel, i);
    }
    public static void isVivo(Anatel anatel, int i){
        for(; i < anatel.franquias.length; i++){
            isVivo(anatel, anatel.quantidadeFranquiasVivo, i);
        }
    }
    public static void isVivo(Anatel anatel, int j, int i){
        if(anatel.franquias[i].nome.equals("Vivo")){
            anatel.franquiasVivo[j] = anatel.franquias[i];
            aumentarQuantidade(anatel.quantidadeFranquiasVivo);
            j++;
        }
    }
    public static int aumentarQuantidade(int quantidade){
        return quantidade++;
    }
    public static void isQuantidadeGb(Anatel anatel){
        int i = 0;
        isQuantidadeGb(anatel, i);
    }
    public static void isQuantidadeGb(Anatel anatel, int i){
        for(; i < anatel.franquias.length; i++){
            isQuantidadeGb(anatel, anatel.quantidadeFranquiasGb, i);
        }
    }
    public static void isQuantidadeGb(Anatel anatel, int j, int i){
        if(anatel.franquias[i].quantidadeGB > 2){
            anatel.franquiasGbMaior2[j] = anatel.franquias[i];
            aumentarQuantidade(anatel.quantidadeFranquiasGb);
            j++;
        }
    }
    public static void isDataExpiracao(Anatel anatel){
        int i = 0;
        isDataExpiracao(anatel, i);
    }
    public static void isDataExpiracao(Anatel anatel, int i){
        for(; i < anatel.franquias.length; i++){
            isDataExpiracao(anatel, anatel.quantidadeFranquiasDataExpiracao, i);
        }
    }
    public static void isDataExpiracao(Anatel anatel, int j, int i){
        if(anatel.franquias[i].dataExpiracao > 10 && anatel.franquias[i].dataExpiracao < 20 ){
            anatel.franquiasDataExpiracao[j] = anatel.franquias[i];
            aumentarQuantidade(anatel.quantidadeFranquiasDataExpiracao);
            j++;
        }
    }
}
