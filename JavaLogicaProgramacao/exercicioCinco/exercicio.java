// Faça um algoritmo que leia dois valores para as variáveis A e B e efetue a troca 
// dos valores de forma que a variável A passe a possuir o valor da variável B e a 
// variável B passe a possuir o valor da variável A. Apresente os valores trocados. 
package exercicioCinco;

import java.util.Scanner;

public class exercicio {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor da variavel A, para ser substituida pelo valor da variavel B \n");
        float a = scanner.nextFloat();
        System.out.print("Insira o valor da variavel B, para ser substituida pelo valor da variavel A \n");
        float b = scanner.nextFloat();
        float aux;
        aux = a;
        a = b;
        b = aux;
        System.out.println("\nO valor de A agora vale: "+ a);
        System.out.println("\nO valor de B agora vale: "+ b);
        scanner.close();
     }
}
