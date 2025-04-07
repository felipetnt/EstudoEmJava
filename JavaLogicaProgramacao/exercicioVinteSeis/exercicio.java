package exercicioVinteSeis;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        int contagemImpar = 0;
        int contagemPar = 0;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Digite abaixo, a quantidade de numeros que serao somados em sequencia, e terao sua media em sequencia: (Digite 9999 para parar o programa)\n");
             n = scanner.nextInt();
            if(n % 2 == 0){
                contagemPar = contagemPar + 1;
            } else {
                if(n % 2 != 0){
                    contagemImpar = contagemImpar + 1;
                }
            }
        } while (n == 9999);
        System.out.println("\nAqui esta a quantidade de impares que o usario inseriu foi: "+ contagemImpar);
        System.out.println("\nAqui esta a quantidade de pares que o usario inseriu foi: "+ contagemPar);
        scanner.close();
    }
}
