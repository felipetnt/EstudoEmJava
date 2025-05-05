package JavaOOPolimorfismo.TeacherManipulation;

public class View {

    public Professor lerProfessor(){
        Professor professor = new Professor();
        String nome = Leitura.lerString("Insira seu nome: ");
        professor.setNome(nome);
        String titulacao = Leitura.lerString("Insira sua titulacao como professor: ");
        professor.setTitulacao(titulacao);
        String matricula = Leitura.lerString("Insira sua matricula em sua instituicao: ");
        professor.setMatricula(matricula);
        double salario = Leitura.lerDouble("Insira seu salairo como professor: ");
        professor.setSalario(salario);
        return professor;
    }

    


}