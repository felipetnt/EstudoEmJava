// Faça um programa que receba o valor da venda, escolha a condição de 
// pagamento no menu e mostre o total da venda final conforme condições a seguir: 
// Venda a Vista - desconto de 10% 
// Venda a Prazo 30 dias - desconto de 5% 
// Venda a Prazo 60 dias - mesmo preço 
// Venda a Prazo 90 dias - acréscimo de 5% 
// Venda com cartão de débito - desconto de 8% 
// Venda com cartão de crédito - desconto de 7% 
// i
package exercicioDezessete;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prazo;
        double valorVenda;
        int type;
        double conta = 0;
        int cartaoType;
        System.out.println("Insira aqui qual foi o valor da venda: \n");
        valorVenda = scanner.nextDouble();
        System.out.println("Insira, se o pagamento eh no dinheiro (1) ou no cartao (2) ou a vista(3): \n");
        type = scanner.nextInt();
        switch (type) {
            case 1:
                System.out.println("Insira o prazo da venda:(30, 60 ou 90)");
                prazo = scanner.nextInt();
                switch (prazo) {
                    case 30:
                        conta = valorVenda - (valorVenda * 5/100);
                        break;
                    case 60:
                        conta = valorVenda;
                        break;
                    case 90:
                        conta = valorVenda + (valorVenda * 5/100);
                        break;
                    default:
                        System.out.println("Insira um prazo valido.");
                        break;
                }
                break;
            case 2:
                System.out.println("Insira o tipo de cartao - credito(1) debito(2)");
                cartaoType = scanner.nextInt();
                switch (cartaoType) {
                    case 1:
                        conta = valorVenda - (valorVenda * 7/100);
                        break;
                    case 2:
                        conta = valorVenda - (valorVenda * 8/100);
                        break;
                    default:
                        System.out.println("Insira um numero valido.");
                        break;
            case 3:
                conta = valorVenda - (valorVenda * 10/100);
                break;
            }
        }
        System.out.println("Sua conta total foi: "+ conta);
        scanner.close();
    }
}
