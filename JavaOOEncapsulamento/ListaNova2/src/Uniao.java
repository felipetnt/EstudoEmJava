public class Uniao {
    Governo []governos;

    public double getTempoExecucao(){
        double soma = 0;
        for(Governo governo:governos){
            soma += governo.somaTempoExecucaoAcao();
        }
        return soma;
    }
}
