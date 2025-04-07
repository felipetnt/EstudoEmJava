// Crie um algoritmo chamado Estacoes. Este algoritmo deve ler uma data e 
// armazenar na variável mes um número entre 1 e 12, correspondendo a um dos 
// meses do ano. No final, você deve imprimir uma mensagem conforme o exemplo:  
// "A estação do ano correspondente ao mês 3 é Verão" 
// Considere a estação prevalente para cada mês: 
// a) Janeiro (1): Verão 
// b) Fevereiro (2): Verão 
// c) Março (3): Verão 
// d) Abril (4): Outono 
// e) Maio (5): Outono 
// f) Junho (6): Outono 
// g) Julho (7): Inverno 
// h) Agosto (8): Inverno 
// i) 
// Setembro (9): Inverno 
// j) 
// Outubro (10): Primavera 
// k) Novembro (10): Primavera 
package exercicioDezenove;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int estacao;
        System.out.println("Insira o numero da estacao que deseja se inserir.");
        estacao = scanner.nextInt();
        scanner.close();
        switch (estacao){
            case 1:
                System.out.println("Voce selecionou o mes 1, correspondente ao verao");
                break;
            case 2:
                System.out.println("Voce selecionou o mes 1, correspondente ao verao");
                break;
            case 3:
                System.out.println("Voce selecionou o mes 1, correspondente ao verao");
                break;
            case 4:
                System.out.println("Voce selecionou o mes 1, correspondente ao outono");
                break;
            case 5:
                System.out.println("Voce selecionou o mes 1, correspondente ao outono");
                break;
            case 6:
                System.out.println("Voce selecionou o mes 1, correspondente ao outono");
                break;
            case 7:
                System.out.println("Voce selecionou o mes 1, correspondente ao inverno");
                break;
            case 8:
                System.out.println("Voce selecionou o mes 1, correspondente ao inverno");
                break;
            case 9:
                System.out.println("Voce selecionou o mes 1, correspondente ao inverno");
                break;
            case 10:
                System.out.println("Voce selecionou o mes 1, correspondente ao primavera");
                break;
            case 11:
                System.out.println("Voce selecionou o mes 1, correspondente ao primavera");
                break;
            case 12:
                System.out.println("Voce selecionou o mes 1, correspondente ao primavera");
                break;
            
            default:
                System.out.println("Insira um numero valido (1 a 12)");
                break;
        }
    }
}
