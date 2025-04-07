// Faça um algoritmo que leia um conjunto de dados numéricos (X) e imprima o 
// maior (Maximo) dentre eles. Admita que o valor 9999 é utilizado como sentinela. 
// Ex.: 1, 2, 3 => Maior=3 
package exercicioVinteQuatro;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int maiorNumero = n;
            while(n == 9999){
                System.out.println ("Digite abaixo, a quantidade de numeros que serao somados em sequencia, e terao sua media em sequencia: \n");
                n = scanner.nextInt();
                if(n > maiorNumero){
                    maiorNumero = n;
                }
            }
            System.out.println("O maior numero eh " +maiorNumero);
        scanner.close();
    }
}