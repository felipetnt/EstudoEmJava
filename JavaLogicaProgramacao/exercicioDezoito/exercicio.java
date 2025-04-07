// Construa um algoritmo que, tendo como dados de entrada o preço de um 
// produto e um código de origem, mostre o preço junto de sua procedência (ex. 
// 500,00 – Sul). Caso o código não seja nenhum dos especificados, o produto 
// deve ser encarado como importado. 
// Código de origem  
// 1 – Sul 
// 5 ou 6 – Nordeste 
// 2 – Norte 
// 3 – Leste 
// 4 – Oeste 
// 7 ou 8 ou 9 – Sudeste 
// 10 até 20 – Centro Oeste 
// 25 até 35 – Nordeste 
package exercicioDezoito;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira aqui codigo do produto");
        int codigo = scanner.nextInt();
        System.out.println("Insira aqui o preco do produto");
        double preco = scanner.nextDouble();
        switch (codigo) {
            case 1:
                System.out.println("Sul - "+ preco);
                break;
            case 2:
                System.out.println("Norte - "+ preco);
                break;
            case 3:
                System.out.println("Leste - "+ preco);
                break;
            case 4:
                System.out.println("Oeste  - "+ preco);
                break;
            case 5:
                System.out.println("Nordeste - "+ preco);
                break;
            case 6:
                System.out.println("Nordeste - "+ preco);
                break;
            case 7:
                System.out.println("Sul - "+ preco);
                break;
            case 8:
                System.out.println("Sudeste - "+ preco);
                break;
            case 9:
                System.out.println("Sudeste - "+ preco);    
                break;
            
            default:
        
                if(codigo >= 10 && codigo<= 20){
                    System.out.println("Centro Oeste - "+ preco);
                } else {
                    if(codigo >= 25 && codigo<= 35){
                        System.out.println("Nordeste- "+ preco);
                    } else {
                        System.out.println("Importado - "+ preco);
                    }
                }
                break;
            }
        scanner.close();
    }
}
