public class Jogador { // Um Jogador tem nome, idade, quantidade de gols na
    // temporada, nome do país de origem e qualificação do jogador.

    private String nome;

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }
    public String getNome() {
        return nome;
    }

    private String nomePaisOrigem;

    public String setNomePaisOrigem(String nomePaisOrigem) {
        this.nomePaisOrigem = nomePaisOrigem;
        return nomePaisOrigem;
    }
    public String getNomePaisOrigem() {
        return nomePaisOrigem;
    }

    private int idade;

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }
    public int getIdade() {
        return idade;
    }

    private int quantidadeGols;

    public int setQuantidadeGols(int quantidadeGols) {
        this.quantidadeGols = quantidadeGols;
        return quantidadeGols;
    }
    public int getQuantidadeGols() {
        return quantidadeGols;
    }

    public String qualificacao(){
        String qualificacao;
        if(quantidadeGols < 15){
            qualificacao = "Fraco";
        } else {
            if(quantidadeGols < 32){
                qualificacao = "Mediana";
            } else {
                qualificacao = "Boa";
            }
        }
        return qualificacao;
    }

    public double salario(){
        double salario = 0;
        if(qualificacao().equals("Fraco")){
            salario = 500;
        } else {
            if(qualificacao().equals("Mediana")){
                salario = 5000;
            } else {
                if(qualificacao().equals("Boa")){
                    salario = 10000;
                }
            }
        }
        return salario;
    }

    public String toString(){
        return "Nome: " + nome
                +"\nIdade: " + idade
                + "\nQuantidadeGols: " + quantidadeGols
                + "\nPais de Origem: " + nomePaisOrigem
                + "\nQuantidade de Gols: " + qualificacao()
                + "\nSalario: " + salario();
    }
}
