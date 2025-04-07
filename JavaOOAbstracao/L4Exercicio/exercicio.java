package L4Exercicio;
import java.util.Scanner;
public class exercicio {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double fahrenheit;
      double celsius;
      System.out.println("Insira a temperatura em celsius para transformada em fahrenheit");
      celsius = scanner.nextDouble();
      fahrenheit = lerFahrenheit(celsius);
      scanner.close();
      System.out.println("A temperatura em fahrenheit eh: "+ fahrenheit);
         }
   public static double lerFahrenheit(double celsius){
      return (9  *  celsius  + 160)  /  5;
   }
}
