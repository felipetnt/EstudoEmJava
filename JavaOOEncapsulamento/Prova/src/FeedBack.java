public class FeedBack {
    public FeedBack(String texto, double nota){
        setTexto(texto);
        setNota(nota);
        if(nota < 0 || nota > 100){
            System.out.println("Erro: Nota Invalida!");
        } else {
            int i = getScore();
            System.out.println("SCORE: " + i);
        }

    }

    private String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getTexto() {
        return texto;
    }

    private double nota;

    public void setNota(double nota) {
        this.nota = nota;
    }
    public double getNota() {
        return nota;
    }

    /*
        TODO
        A NOTA É UM VALOR POSITIVO DE 0 A 100, O ZERO PODE SER UM VALOR PADRÃO.
        O ESCORE É 1 PONTO PARA CADA QUARTO DA NOTA, PODENDO CHEGAR A NO MÁXIMO 4 E NO MÍNIMO 1;
     */
    public int getScore(){
        int score;
        if(nota > 0 && nota <= 25){
            score = 1;
        } else {
            if(nota > 25 && nota < 50){
                score = 2;
            } else {
                if(nota > 50 && nota < 75){
                    score = 3;
                } else {
                    score = 4;
                }
            }
        }
        return score;
    }

    public String toString(){
        return "Texto: " + getTexto() + ", Nota: " + getNota();
    }
}
