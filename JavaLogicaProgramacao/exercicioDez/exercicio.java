// Suponha que o conceito de um aluno seja determinado em função da sua nota. 
// Suponha, também, que esta nota seja um valor inteiro na faixa de 0 a 100, 
// conforme a seguinte faixa: 
//  Nota
//  Conceito
//  0 a 49  
// 50 a 64 
// 65 a 84 
// 85 a 100 
// Insuficiente
// Regular 
// Bom 
// Ótimo 
package exercicioDez;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua nota de conceito. \n");
        int conceito = scanner.nextInt();
        if(conceito > 0 && conceito < 50){
            System.out.println("Insulficiente.");
        } else {
            if(conceito >= 50 && conceito <= 64){
                System.out.println("Regular.");
            } else {
                if(conceito >= 65 && conceito <= 84){
                    System.out.println("Bom.");
                } else {
                    if(conceito >= 85 && conceito <= 100){
                        System.out.println("Otimo.");
                    } else {
                        System.out.println("Insira um numero positivo inteiro, entre 100 e 0.");
                    }
                }
            }
        }
        scanner.close();
    }
}
