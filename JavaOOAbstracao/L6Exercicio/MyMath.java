package L6Exercicio;
import java.util.Scanner;
public class MyMath {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int valorInformado;
        int valorInformado2;
		int type;
		int resultado;
		System.out.println("Insira a funcao do programa que deseja - \n 1- Fatorial \n 2 - Imprimir o maior dos valores \n 3- Descobrir se o numero eh par \n 4- Descobrir se eh primo ou nao");
		type = scanner.nextInt();
		System.out.println("Insira o valor que voce deseja");
		valorInformado = scanner.nextInt();
		switch(type){
			case 1: 
				resultado = lerFatorial(valorInformado);	
				System.out.println("O seu resultado eh: "+ resultado);		
				break;
			case 2: 
				System.out.println("Insira o segundo valor para compara-lo com o primeiro: ");
				valorInformado2 = scanner.nextInt();
				resultado = lerMaiorValor(valorInformado, valorInformado2);
				System.out.println("O maior valor informado foi: "+ resultado);
				break;
			case 3: 
				resultado = lerPar(valorInformado);
				if(resultado == 1){
					System.out.println("true");
				} else {
					System.out.println("false");
				}
				break;
			case 4: 
				resultado = lerPrimos(valorInformado);
				if(resultado == 0){
					System.out.println("false");
				} else {
					System.out.println("true");
				}
				break;
			default:
				System.out.println("Insira um numero valido de 1- 4");
				break;
		}
		scanner.close();
	}
	public static int lerFatorial(int valorInformado){
		int i;
		int fatorial = 1;
		if(valorInformado == 1 || valorInformado == 2){
			return fatorial = 1;
		} else { 
			for(i = 2; i <= valorInformado; i++){
				fatorial = fatorial * i;
			}
			return fatorial;
		}
	}
	public static int lerMaiorValor(int valorInformado, int valorInformado2){
		int lerMaiorValor;
		if(valorInformado > valorInformado2){
			lerMaiorValor = valorInformado;
		} else {
			if(valorInformado2 > valorInformado){
				lerMaiorValor = valorInformado2;
			} else {
				lerMaiorValor = valorInformado;
			}
		}
		return lerMaiorValor;
	}
 	public static int lerPar(int valorInformado){
		int retornar;
		if(valorInformado % 2 == 0){
			retornar = 0;
		} else {
			retornar = 1;
		}
		return retornar;
	}
	public static int lerPrimos(int valorInformado){
		int i;
		int retornar = 0;
		int contagem = 0;
		if(valorInformado <= 1){
			retornar = 0;
		} else {
			for (i = 2; i <= valorInformado; i++){
				if(valorInformado % i == 0){
					contagem = contagem + 1;
				}
			}
		}
		if(contagem == 2){
			retornar = 1;
		}
		return retornar;
	}
}
