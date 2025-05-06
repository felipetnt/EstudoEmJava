package JavaOOPolimorfismo.TeacherManipulation;

import java.util.ArrayList;

public class Printer {
    public static void printArrayProfessores(String msg, ArrayList<Professor> professores) {
        System.out.println(msg);
        System.out.println(professores);
    }
    public static void printEscola(String msg, School escola) {
        System.out.println(msg);
        System.out.println(escola);
    }
}
