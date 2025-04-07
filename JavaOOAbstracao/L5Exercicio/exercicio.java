package L5Exercicio;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args){
		double numero1;
		double numero2 = 0;
		double resultado;
        int type;
    
		Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o tipo de operacao que voce ira fazer: \n 1 - Adicao \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao \n 5 - Fatorial \n 6 - Exponencial");
		type = scanner.nextInt();
        System.out.println("Insira aqui o primeiro numero: ");
        numero1 = scanner.nextDouble();
        if(type >= 1 && type <= 4 || type == 6){
            System.out.println("Insira aqui o segundo numero: ");
            numero2 = scanner.nextDouble();
        }
		scanner.close();
        switch (type) {
            case 1: // Adicao
                resultado = Adicao(numero1, numero2);
                System.out.println("A adicao dos numeros da: " + resultado);
                break;
            case 2: //Subrtacao
                resultado = Subtracao(numero1, numero2);
                System.out.println("A subtracao dos numeros da: " + resultado);
                break;
            case 3: // Multiplicacao
                resultado = Multiplicacao(numero1, numero2);
                System.out.println("A multiplicacao dos numeros da: " + resultado);
                break;
            case 4: // divisao
                resultado = Divisao(numero1, numero2);
                System.out.println("A divisao dos numeros da: " + resultado);
                break;
            case 5: // Fatorial
                resultado = Fatorial(numero1);
                System.out.println("O fatorial do numero da: " + resultado);
                break;
            case 6: // Exponencial
                resultado = Exponencial(numero1, numero2);
                System.out.println("O exponencial dos numeros da: " + resultado);
                break;
            default:
                System.out.println("Insira um numero de operacao valido. ");
                break;
        }
		
		
	}
	public static double Adicao(double numero1, double numero2){
		return numero1 + numero2;
    }
    public static double Subtracao(double numero1, double numero2){
		return numero1 - numero2;
    }
    public static double Multiplicacao(double numero1, double numero2){
		return numero1 * numero2;
    }
    public static double Divisao(double numero1, double numero2){
		return numero1 / numero2;
    }
    public static double Fatorial(double numero1){
        double fatoriall = 1;
        int j;
        if(numero1 == 1 || numero1 == 0){
            return fatoriall = 1;
        }
		for(j = 2; j <= numero1; j++){
            fatoriall = j * fatoriall;
        }
        return fatoriall;
    }
    public static double Exponencial(double numero1, double numero2){
		int i;
        double exponencial = 1;
        for(i = 1; i <= numero2; i++){
            exponencial = numero1 * exponencial;
        }
        return exponencial;
    }
}
