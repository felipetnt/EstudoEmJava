
    // Crie um algoritmo para ler uma letra do alfabeto e mostrar uma mensagem: se é 
// vogal ou consoante. 
package exercicioVinte;
import java.util.Scanner;
public class exercicio {
// Crie um algoritmo para ler uma letra do alfabeto e mostrar uma mensagem: se é 
// vogal ou consoante. 
    public static void main(String[] args) {

    System.out.println("Afim de descobrir se a letra do alfabeto eh uma vogal ou consoante, digite aqui a letra!: \n");
    Scanner scanner = new Scanner(System.in);
    char letra = scanner.next().charAt(0);
    letra = Character.toLowerCase(letra);
        switch (letra)
        {
            case 'a':   // if(strcmp(letra, a)==0)
                System.out.println("sua letra eh uma vogal.");
                break;
            case 'e':   // if(strcmp(letra, e)==0)
                System.out.println("sua letra eh uma vogal.");
                break;
            case 'i':   // if(strcmp(letra, i)==0)
                System.out.println("sua letra eh uma vogal.");
                break;
            case 'o':   // if(strcmp(letra, o)==0)
                System.out.println("sua letra eh uma vogal.");
                break;
            case 'u':   // if(strcmp(letra, u)==0)
                System.out.println("sua letra eh uma vogal.");
                break;
            
            default:
                System.out.println("sua letra eh uma consoante.");
                break;
        }
    scanner.close();
    }
}
