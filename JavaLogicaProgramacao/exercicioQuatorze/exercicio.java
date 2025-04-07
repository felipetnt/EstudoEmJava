//Crie um algoritmo que retorne verdadeiro quando um número fornecido for par. 
package exercicioQuatorze;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero, caso par o codigo imprime-o");
        int numero = scanner.nextInt();
        if(numero % 2 == 0){
            System.out.println(""+ numero);
        }
        scanner.close();
    }
}
