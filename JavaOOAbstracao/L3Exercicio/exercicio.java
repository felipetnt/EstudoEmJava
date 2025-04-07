package L3Exercicio;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int valorInformadoUsuario;
        int valoresImpares = 0;
        double media = 0;
        double soma = 0;
        double contagem = 0;
        for(i = 1; i <= 51; i++){
            System.out.println("Insira aqui o valor numero "+ i);
            valorInformadoUsuario = scanner.nextInt();
            if(valorInformadoUsuario % 2 != 0 && valorInformadoUsuario > 0){
                valoresImpares = valoresImpares + 1;
            }
            if(valorInformadoUsuario > 0){
                soma = soma + valorInformadoUsuario;
                contagem = contagem + 1;
                media = soma / contagem;
                System.out.println(valorInformadoUsuario + "");
            }
        }
        scanner.close();
        System.out.println("A media total de todos os 5000 numeros eh "+ media);
        System.out.println("O numero de valores impares eh "+ valoresImpares);
    }
}
