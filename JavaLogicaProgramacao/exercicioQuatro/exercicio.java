// Considere a seguinte situação: descontam-se inicialmente 10% do salário bruto 
// do trabalhador como contribuição à previdência social. Após esse desconto, há 
// um outro desconto de 5% sobre o valor restante do salário bruto, a título de um 
// determinado imposto. Faça um algoritmo que leia o salário bruto de um cidadão e 
// imprima o seu salário líquido. 
package exercicioQuatro;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o salario bruto: \n");
        double salarioBruto = scanner.nextDouble();
        double salarioLiquido;
        double desconto1;
        desconto1 = salarioBruto - (salarioBruto* 10/100);
        salarioLiquido = desconto1 - (desconto1 * 5/100);
        System.out.println("\nSeu salario liquido vale: "+ salarioLiquido);
        scanner.close();
    }
}
