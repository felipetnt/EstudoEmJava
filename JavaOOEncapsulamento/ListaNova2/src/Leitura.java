import java.util.Scanner;
public class Leitura {
    public double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }
    public double lerDouble(String msg){
        System.out.println(msg);
        return lerDouble();
    }
    public int lerInt(){
        return new Scanner(System.in).nextInt();
    }
    public int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }
    public String lerString(){
        return new Scanner(System.in).nextLine();
    }
    public String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }
    public int lerInt(String msg, String errorMsg, int min, int max){
        int valor;
        do {
            valor = lerInt(msg);
            if( valor > max || valor < min ){
                System.out.println(errorMsg);
            }
        } while (valor < min || valor > max);
        return valor;
    }
}
