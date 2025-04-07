// O cardápio de uma lanchonete é o seguinte: 
// Especificação
//   Preço unitário
//  100 Cachorro quente  
// 101 Bauru simples   
// 102 Bauru c/ovo   
// 103 Hamburger   
// 104 Cheeseburger   
// 105 Refrigerante   
// 1,10  
// 1,30  
// 1,50  
// 1,10  
// 1,30  
// 1,00 
package exercicioOnze;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        int aux = 1;
        double total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o codigo do produto da lanchonete: \n");
        int codigo = scanner.nextInt();
        if(codigo == 100){
            System.out.println("Digite quantos cachorros quentes deseja: \n");
            int quantidade = scanner.nextInt();
            total = quantidade * 1.10;
        } else {
            if(codigo == 101){
                System.out.println("Digite quantos bauru simples deseja: \n");
                int quantidade = scanner.nextInt();
                total = quantidade * 1.30;
            } else {
                if(codigo == 102){
                    System.out.println("Digite quantos bauru com ovo deseja: \n");
                    int quantidade = scanner.nextInt();
                    total = quantidade * 1.50;
                } else {
                    if(codigo == 103){
                        System.out.println("Digite quantos hamburgueres deseja: \n");
                        int quantidade = scanner.nextInt();
                        total = quantidade * 1.10;
                    } else {
                        if(codigo == 104){
                            System.out.println("Digite quantos cheeseburgueres deseja: \n");
                            int quantidade = scanner.nextInt();
                            total = quantidade * 1.30;
                        } else {
                            if(codigo == 105){
                                System.out.println("Digite quantos refrigerantes deseja: \n");
                                int quantidade = scanner.nextInt();
                                total = quantidade * 1.00;
                            } else {
                                System.out.println("Favor insira um codigo valido");
                                aux = 0;
                            }
                        }
                    }
                }
            }
        }
        if(aux == 1){
            System.out.println("Sua conta total deu : "+ total);
        }
        scanner.close();
    }
}
