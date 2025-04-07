// Uma empresa de vendas tem três corretores. A empresa paga ao corretor uma 
// comissão calculada de acordo com o valor de suas vendas. Se o valor da venda 
// de um corretor for maior que R$ 50.000.00 a comissão será de 12% do valor 
// vendido. Se o valor da venda do corretor estiver entre R$ 30.000.00 e R$ 
// 50.000.00 (incluindo extremos) a comissão será de 9.5%. Em qualquer outro 
// caso, a comissão será de 7%. Escreva um algoritmo que gere um relatório 
// contendo nome, valor da venda e comissão de cada um dos corretores. O 
// relatório deve mostrar também o total de vendas da empresa. 
package exercicioNove;
import java.util.Scanner;
public class exercicio {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira seu nome:  \n");
        String nome = scanner.nextLine();
        System.out.print("Insira seu valor de venda: \n");
        double valorVenda = scanner.nextDouble();
        double comissao;
        double vendasTotais = 0;

        if(valorVenda > 50000){
            comissao = valorVenda * (12/100);
            System.out.println("\nO sr(a)"+ nome);
            System.out.println("\nSua comissao foi de R$"+ comissao);
            vendasTotais = valorVenda + vendasTotais;
        } else {
            if(valorVenda >= 30000 && valorVenda <= 50000){
                comissao = valorVenda * (9.5/100);
                System.out.println("\nO sr(a)"+ nome);
                System.out.println("\nSua comissao foi de R$"+ comissao);
                vendasTotais = valorVenda + vendasTotais;
            } else {
                if(valorVenda < 30000 && valorVenda > 0){
                    comissao = valorVenda * (7/100);
                    System.out.println("\nO sr(a)"+ nome);
                    System.out.println("\nSua comissao foi de R$"+ comissao);
                    vendasTotais = valorVenda + vendasTotais;
                } else {
                    System.out.println("Insira um valor positivo.");
                }
            }
        }
        System.out.println("O valor de vendas totais dos 3 corretors foi:"+ vendasTotais);
        scanner.close(); 
    }
}
