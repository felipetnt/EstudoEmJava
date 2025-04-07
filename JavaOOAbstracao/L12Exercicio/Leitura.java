package L12Exercicio;
import java.util.Scanner;
public class Leitura {
    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }
    public static String lerString(String msg){
        System.out.print(msg);
        return lerString();
    }
}

