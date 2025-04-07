// Faça um algoritmo que:  
// a) Obtenha o valor para a variável HT (horas trabalhadas no mês);  
// b) Obtenha o valor para a variável VH (valor hora trabalhada):  
// c) Obtenha o valor para a variável PD (percentual de desconto);  
// d) Calcule o salário bruto => SB = HT * VH;  
// e) Calcule o total de desconto => TD = (PD/100)*SB;  
// f) Calcule o salário líquido => SL = SB – TD;  
// g) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário 
// Liquido. package exercicioTres;
package exercicioDois;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira quantas horas voce trabalhou no mes: \n");
        float horasTrabalhadas = scanner.nextFloat();
        System.out.print("Insira quanto voce trabalha por hora, em reais: \n");
        float valorHora = scanner.nextFloat();
        System.out.print("Insira o percentual de desconto do seu salario: \n ");
        float percentualDesconto = scanner.nextFloat();
        float salarioBruto;
        float totalDesconto;
        float salarioLiquido;
        salarioBruto = horasTrabalhadas * valorHora;
        totalDesconto = (percentualDesconto/100)*salarioBruto;
        salarioLiquido = salarioBruto - totalDesconto;
        System.out.println("\nO salario bruto vale "+ salarioBruto);
        System.out.println("\nO total de desconto do seu salario eh"+ totalDesconto);
        System.out.println("\nSeu salario liquido vale: "+ salarioLiquido);
        scanner.close();
    }
}
