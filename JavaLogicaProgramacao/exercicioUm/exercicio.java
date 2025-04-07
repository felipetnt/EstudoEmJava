package exercicioUm;
import java.util.Scanner;
public class exercicio{
public static void main(String [] args){
    int media;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira o primeiro dado da media.");
    int numero = scanner.nextInt();
    System.out.println("Insira o segundo dado da media.");
    int numero2 = scanner.nextInt();
    media = (numero + numero2) / 2;
    System.out.println("A media vale "+ media);
    scanner.close();
    }
}