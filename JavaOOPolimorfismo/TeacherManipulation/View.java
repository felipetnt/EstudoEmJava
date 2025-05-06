package JavaOOPolimorfismo.TeacherManipulation;

public class View {

    public static Professor lerProfessor(){
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

    public static School lerEscola(){
        School escola = new School();
        boolean continuar;
        do{
            Professor professor = lerProfessor();
            if(!escola.isIgual(professor)){
                escola.professores.add(professor);
                System.out.println("Professor cadastrado com sucesso!");
            } else {
                System.out.println("Professor já cadastrado!");
            }
            continuar = Leitura.lerContinue();
        } while(continuar);
        return escola;
    }


}