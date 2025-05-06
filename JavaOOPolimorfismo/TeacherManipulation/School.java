package JavaOOPolimorfismo.TeacherManipulation;

import java.util.ArrayList;

public class School {
    ArrayList<Professor> professores = new ArrayList<>();

    public ArrayList<Professor> getProfessoresSalario(double salario) {
        ArrayList<Professor> professoresSalario = new ArrayList<>();
        if(professores.isEmpty()) {
            System.out.println("Lista de professores vazia!");
        } else {
            for (Professor professor : professores) {
                if (professor.indicarSalario(salario)) {
                    professoresSalario.add(professor);
                }
            }
        }
        return professoresSalario;
    }

    public ArrayList<Professor> getProfessoresTitulacao(String titulacao) {
        ArrayList<Professor> professoresTitulacao = new ArrayList<>();
        if(professores.isEmpty()) {
            System.out.println("Lista de professores vazia!");
        } else {
            for (Professor professor : professores) {
                if (professor.isTitulacao(titulacao)) {
                    professoresTitulacao.add(professor);
                }
            }
        }
        return professoresTitulacao;
    }

    public ArrayList<Professor> getProfessoresSobrenome(String sobrenome) {
        ArrayList<Professor> professoresSobrenome = new ArrayList<>();
        if(professores.isEmpty()) {
            System.out.println("Lista de professores vazia!");
        } else {
            for (Professor professor : professores) {
                if (professor.isSobrenome(sobrenome)) {
                    professoresSobrenome.add(professor);
                }
            }
        }
        return professoresSobrenome;
    }

    public boolean isIgual(Professor professor) {
        for (Professor p : professores) {
            if (p.equals(professor)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String professoresImpress = "Lista de professores:\n";
        for(Professor professor : professores) {
            professoresImpress += professor.toString();
        }
        
        return professoresImpress;
    }
}
