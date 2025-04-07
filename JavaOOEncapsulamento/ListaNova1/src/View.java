public class View {
    public static Anatel lerFranquias(){
        Anatel.quantidadeFranquias = Leitura.lerInt("Insira a quantidade de franquias:");
        return lerCorrida(Anatel.quantidadeFranquias);
    }
    public static Anatel lerCorrida(int quantidadeFranquias){
        Anatel anatel = new Anatel();
        anatel.franquias = new Franquia[quantidadeFranquias];
        lerFranquias(anatel);
        return anatel;
    }
    public static void lerFranquias(Anatel anatel){
        for (int i = 0; i < anatel.franquias.length; i++) {
            anatel.franquias[i] = lerFranquia();
        }
    }
    public static Franquia lerFranquia() {
        Franquia franquia = new Franquia();
        franquia.nome = Leitura.lerString("Insira o nome da franquia: ");
        franquia.servico = Leitura.lerString("Insira a empresa que da o servico de sua franquia: ");
        franquia.dataExpiracao = Leitura.lerInt("Insira o data de expiracao da franquia: ", "Insira um dia valido entre 1 a 10", 1, 30);
        franquia.quantidadeGB = Leitura.lerInt("Insira o quantidade de GB: ");
        franquia.preco = Leitura.lerDouble("Insira o preco da franquia: ");
        return franquia;
    }
}
