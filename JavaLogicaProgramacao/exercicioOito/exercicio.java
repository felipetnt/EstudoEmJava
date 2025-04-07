// Faça um algoritmo que leia um número N e imprima “F1”, “F2” ou “F3”, conforme 
// a condição:
// • “F1”, se N <= 10 
// • “F2”, se N > 10 e N <= 100 
// • “F3”, se n > 100 
package exercicioOito;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero N: \n");
        int n = scanner.nextInt();
        if(n <= 10 && n > 0){
            System.out.println("F1");
        } else {
            if(n > 10 && n <= 100){
                System.out.println("F2");
            } else {
                if(n > 100){
                    System.out.println("F3");
                } else {
                    System.out.println("Insira um numero positivo e inteiro.");
                }
            }
        }
        scanner.close();
    }
}
