package exercicioVinteOito;
import java.util.Scanner;
public class exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[20];
        System.out.println("Digite 20 elementos para o vetor N:");
        for (int i = 0; i < 20; i++) {
            N[i] = scanner.nextInt();
        }
        System.out.println("\nVetor N:");
        for (int i = 0; i < 20; i++) {
            System.out.print(N[i] + "\n");
        }
        for (int i = 0; i < 10; i++) {
            int temp = N[i];
            N[i] = N[19 - i];
            N[19 - i] = temp;
        }
        System.out.println("\n\nVetor N(modificadoz):");
        for (int i = 0; i < 20; i++) {
            System.out.print(N[i] + " ");
        }
        scanner.close();
    }
}
