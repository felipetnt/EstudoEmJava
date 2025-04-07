// Crie um algoritmo em que o aluno digita duas notas bimestrais e informa se o 
// aluno foi aprovado ou não. Nota: Considere aprovado se a nota for maior que 
// 5.0. 
package exercicioDoze;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite sua nota: \n");
        double nota = scanner.nextDouble();
        if(nota > 5 && nota <= 10){
            System.out.println("Aprovado(a)");
        } else {
            if(nota > 0 && nota <= 5){
                System.out.println("Reprovado(a)");
            } else {
                System.out.println("Insira um numero valido, positivo entre 0 - 10.");
            }
        }
        scanner.close();
    }
}
