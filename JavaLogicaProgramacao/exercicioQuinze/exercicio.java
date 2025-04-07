// Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de
// serviços é de: 
// •  R$ 5.50 por diária, se o número de diárias for maior que 15; 
// •  R$ 6.00 por diária, se o número de diárias for igual a 15; 
// •  R$ 8.00 por diária, se o número de diárias for menor que 15. 
// Construa um algoritmo que mostre o nome e o total da conta de um cliente. 
// package exercicioQuinze;
package exercicioQuinze;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args){
        int aux = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para descobrir o valor pago na diaria do hotel, insira a quantidade de dias.");
        int quantidade = scanner.nextInt();
        double diaria = 0;
        if(quantidade > 15){
            diaria = 60 + 5.50;
        } else {
            if(quantidade == 15){
                diaria = 60 + 6;
            } else {
                if(quantidade < 15 && quantidade > 0){
                    diaria = 60 + 8;
                } else {
                    aux = 0;
                    System.out.println("\nDias negativos, nao existem.");
                }
            }
        }
        
        if(aux == 1){
            double contaTotal;
            contaTotal = quantidade * diaria;
            System.out.println("\nSua conta total deu: R$"+ contaTotal);
            System.out.println("\nTendo como diaria: R$"+ diaria);
        }
        scanner.close();
    }
}
