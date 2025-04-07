// Faça um algoritmo que calcule e apresente o valor do volume de uma lata de 
// óleo, utilizando a fórmula VOLUME = 3,14159 * RAIO2 * ALTURA. 
package exercicioTres;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite aqui, quanto eh o raio da lata de oleo: \n");
        double raio = scanner.nextDouble();
        System.out.print("Insira a altura da lata: \n");
        double altura = scanner.nextDouble();
        double volume;
        volume = raio * raio * 3.14159 * altura;
        System.out.println("O volume da sua lata vale "+ volume);
        scanner.close();
    }
}