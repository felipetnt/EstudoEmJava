package L10Exercicio;
import java.util.Scanner;
public class Leitura {
    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }
    public static double lerDouble(String msg){
        System.out.println(msg);
        return lerDouble();
    }
    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }
    public static int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }
    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }
    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }
    public static Autodromo lerCorrida(){
        int qtdPilotos = lerInt("Quantos pilotos participaram da corrida?");
        return lerCorrida(qtdPilotos);
    }
    public static Autodromo lerCorrida(int qtdPilotos){
        Autodromo corrida = new Autodromo();
        corrida.pilotos = new Piloto[qtdPilotos];
        for (int i = 0; i < corrida.pilotos.length; i++) {
            corrida.pilotos[i] = lerPilotos();
        }
        return corrida;
    }
    public static Piloto lerPilotos() {
        Piloto piloto = new Piloto();
        piloto.nome = lerString("Informe o nome do piloto");
        piloto.escuderia = lerString("Informe a escuderia do piloto");
        piloto.tempoDeVolta = lerDouble("Informe o tempo do piloto em minutos.", "Voce inseriu um minuto invalido por favor insira novamente.", 1, 60);
        return piloto;
    }
    public static double lerDouble(String msg, String errorMsg, double min, double max){
        double valor;
        do {
            valor = lerDouble(msg);
            if( valor > max || valor < min ){
                System.out.println(errorMsg);
            }
        } while (valor < min || valor > max);
        return valor;
    }
}
