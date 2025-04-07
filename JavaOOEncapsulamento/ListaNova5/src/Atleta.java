public class Atleta {
    String nome;
    String numeroInscricao;
    int tempoDeProva;
    int idade;

    public boolean isElite(){
        boolean isElite;
        isElite = tempoDeProva < 5;
        return isElite;
    }
    public String toString () {
        return "\nO nome do atleta: " + nome +
                "\nO numero de inscricao: " + numeroInscricao +
                "\nO tempo de prova do atleta: " + tempoDeProva +
                "\nA idade do atleta: " + idade;
    }

}
