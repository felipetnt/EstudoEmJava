// Crie um algoritmo que peça o nome, a altura e o peso de duas pessoas e 
// apresente o nome da mais pesada e o nome da mais alta.
package exercicioDezesseis;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        double altura1;
        String nome1;
        String nome2;
        double altura2;
        double peso1;
        double peso2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = scanner.nextLine();
        System.out.print("Digite a altura da primeira pessoa (em metros): ");
        altura1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira pessoa (em kg): ");
        peso1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o nome da segunda pessoa: ");
        nome2 = scanner.nextLine();
        System.out.print("Digite a altura da segunda pessoa (em metros): ");
        altura2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda pessoa (em kg): ");
        peso2 = scanner.nextDouble();

        if(altura1 > altura2){
            System.out.println("\nO(a) "+nome1);
            System.out.println(" Eh maior que "+nome2);
        } else {
            if(altura2 > altura1){
                System.out.println("\nO(a) "+nome2);
                System.out.println(" Eh maior que o(a) "+nome1);
            } else {
                System.out.println("\nA altura de voces sao iguais.");
            }
        }
        if(peso1 > peso2){
            System.out.println("\nO(a) "+nome1);
            System.out.println(" Eh mais pesado que o(a)"+nome2);
        } else {
            if(peso2 > peso1){
                System.out.println("\nO(a) "+nome2);
                System.out.println(" Eh mais pesado que o(a) "+nome1);
            } else {
                System.out.println("\nO peso de voces sao iguais.");
            }
        }
        scanner.close();
    }
}
