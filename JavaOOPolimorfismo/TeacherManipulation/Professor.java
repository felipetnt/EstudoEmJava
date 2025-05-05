package JavaOOPolimorfismo.TeacherManipulation;

public class Professor {
    private String nome;
    private String titulacao;
    private double salario;
    private String matricula;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isTitulacao(String titulacao){
        return getTitulacao().equalsIgnoreCase(titulacao);
    }

    public boolean isSobrenome(String sobrenome){

        if(getNome().contains(sobrenome)){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        Professor o = (Professor) obj;
        return getNome().equals(o.getNome()) && getTitulacao().equals(o.getTitulacao()) && getSalario() == o.getSalario() && getMatricula().equals(o.getMatricula());
    }
    
    
}