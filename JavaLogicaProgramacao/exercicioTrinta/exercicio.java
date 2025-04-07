package exercicioTrinta;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Escreva um algoritmo que lê uma matriz M(5,5) e calcule as somas:  
// a) da linha 4 de M; 
// b) da coluna 2 de M; 
// c) da diagonal principal; 
// d) da diagonal secundária; 
// e) de todos os elementos da matriz; 
// f) Escreva estas somas e a matriz
        int m[][] = new int[5][5];
        int somaLinha4 = 0;
        int somaColuna2 = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        int somaTotal = 0;
        int i;
        int j;
        System.out.println("Insira aqui, todos os algarismos da matriz");
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                m[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                System.out.println(m[i][j]+"");
            }
        }
        for(j = 0; j < 5; j++){
            somaLinha4 = somaLinha4 + m[4][j];
        }
        for(i = 0; i < 5; i++){
            somaColuna2 = somaColuna2 + m[i][2];
        }
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                if(i == j){
                    somaDiagonalPrincipal = somaDiagonalPrincipal + m[i][j];
                }
            }
        }
        for (i = 0; i < 5; i++) {
                somaDiagonalSecundaria = m[i][4 - i] + somaDiagonalSecundaria;
        }
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                somaTotal = m[i][j] + somaTotal;
            }
        }
        System.out.println("\nAqui esta a soma da linha 4: " + somaLinha4);
        System.out.println("\nAqui esta a soma da coluna2: " + somaColuna2);
        System.out.println("\nAqui esta a soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("\nAqui esta a soma da diagonal secundaria: " + somaDiagonalSecundaria);
        System.out.println("\nAqui esta a soma total" + somaTotal);
    }
}
