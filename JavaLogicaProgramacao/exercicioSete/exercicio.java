// Faça um algoritmo que leia dois números A e B e imprima o maior deles. 
package exercicioSete;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Afim de imprimir o maior dos numeros.\nInsira o valor da variavel A: \n");
        int a = scanner.nextInt();
        System.out.print("Insira o valor da variavel B: \n");
        int b = scanner.nextInt();
        if(a > b){
            System.out.println("A eh maior, com valor de: "+ a);
        } else {
            System.out.println("B eh maior, com valor de: "+ b);
        }
        scanner.close();
    }
}