package JavaOOPolimorfismo.TeacherManipulation;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        School escola = View.lerEscola();
        ArrayList<Professor> professoresSalario = escola.getProfessoresSalario(12000);
        ArrayList<Professor> professoresTitulacao = escola.getProfessoresTitulacao("Doutor");
        ArrayList<Professor> professoresSobrenome = escola.getProfessoresSobrenome("Silva");
        Printer.printArrayProfessores("Professores com salario maior que 12000: " , professoresSalario); 
        Printer.printArrayProfessores("Professores com titulacao Doutor: " , professoresTitulacao);
        Printer.printArrayProfessores("Professores com sobrenome Silva: " , professoresSobrenome);
        System.out.println(escola.toString());
    }    
}