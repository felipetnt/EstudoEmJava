public class Universidade {

    Laboratorio[] laboratorios = new Laboratorio[0];

    public int countLaboratoriosByResponsavel(String tipo) {
        int qtd = 0;
        for(Laboratorio lab: laboratorios){
            if(lab.responsavelT.cargo.equals(tipo)){
                qtd++;
            }
        }
        return qtd;
    }

    public Laboratorio[] searchLaboratoriosByResponsavel(String tipo) {
        Laboratorio[] laboratoriosByResponsavel = new Laboratorio[countLaboratoriosByResponsavel(tipo)];
        int i = 0;
        for(Laboratorio lab: laboratorios){
            if(lab.responsavelT.cargo.equals(tipo)){
                laboratoriosByResponsavel[i++] = lab;
            }
        }
        return laboratoriosByResponsavel;
    }

    public int countTotalItensType(boolean itemType){
        int qtdLab;
        int qtdTotal = 0;
        for(Laboratorio lab : laboratorios){
            qtdLab = lab.countLaboratorioItensType(itemType);
            qtdTotal += qtdLab;
        }
        return qtdTotal;
    }
    public int countTotalItens(){
        int qtdLab;
        int qtdTotal = 0;
        for(Laboratorio lab : laboratorios){
            qtdLab = lab.countLaboratorioItens();
            qtdTotal += qtdLab;
        }
        return qtdTotal;
    }

    public double custoUniversidadeItens() {
        double custoLab;
        double custoUniversidade = 0;
        for(Laboratorio lab : laboratorios){
            custoLab = lab.custoLaboratorioItens();
            custoUniversidade += custoLab;
        }
        return custoUniversidade;
    }

    public void adicionar (Laboratorio lab) {
        Laboratorio[] aux = new Laboratorio[laboratorios.length + 1];
        for(int i = 0; i < laboratorios.length; i++){
            aux[i] = laboratorios[i];
        }
        aux[laboratorios.length] = lab;
        laboratorios = aux;
    }
}
