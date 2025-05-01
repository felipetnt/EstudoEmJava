import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ServiceCarros concessionaria = View.lerConcessionaria();
        ArrayList<Carro> carroPlaca = concessionaria.getPlaca("JMP");
        ArrayList<Carro> carroCavalos = concessionaria.getCavalos(100);
        ArrayList<Carro> carroMarca = concessionaria.getMarca("JEEP");
        Printer.printConcessionaria(concessionaria);
        Printer.printArrayCarros("Todos os carros com a marca JEEP: ", carroMarca);
        Printer.printArrayCarros("Todos os carros com o inicio de placa JMP: ", carroPlaca);
        Printer.printArrayCarros("Todos os carros com mais de 100 cavalos: ", carroCavalos);
    
    }
} 