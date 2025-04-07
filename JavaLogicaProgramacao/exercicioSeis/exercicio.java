// Suponha que uma escola utilize, como código de matrícula, um número inteiro 
// no formato AASDDD, onde: 
// • Os dois primeiros dígitos, representados pela letra A, são os dois últimos 
// algarismos do ano da matrícula; 
// • O terceiro dígito, representado pela letra S, vale 1 ou 2, conforme o aluno 
// tenha se matriculado no 1º ou 2º semestre; 
// • Os quatro últimos dígitos, representados pela letra D, correspondem à ordem 
// da matrícula do aluno, no semestre e no ano em questão. 
// Crie um algoritmo que leia o número de matrícula de um aluno e imprima o ano 
// e o semestre em que ele foi matriculado.  
package exercicioSeis;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira sua matricula: \n");
        int AASDDD = scanner.nextInt();
        int AAS;
        int S; // semestre matriculado do aluno.
        int AA; // ano
        AAS = AASDDD / 1000;
        S = AAS % 10;
        AA = AAS / 10;
        System.out.println("\nO semestre que voce se cadastrou na escola foi o "+ S);
        System.out.println("\nO ano que voce foi matriculado foi 20"+ AA);
        scanner.close();
    }
}
