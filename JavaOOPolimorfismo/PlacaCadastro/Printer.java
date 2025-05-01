import java.util.ArrayList;

public class Printer {
    public static void printConcessionaria(ServiceCarros concessionaria){
        System.out.println(concessionaria + "\n");
    }

    public static void printArrayCarros(String msg, ArrayList<Carro> carros){
        System.out.println(msg);
        System.out.println(carros);
    }
}
