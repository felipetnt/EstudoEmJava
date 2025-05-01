import java.util.ArrayList;
public class ServiceCarros {

    ArrayList<Carro> carros = new ArrayList<>();

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }
    
    public ArrayList<Carro> getPlaca(String placa){
        ArrayList<Carro> carrosPlaca = new ArrayList<>();
        for(Carro carro : carros){
            if(carro.isInicioPlaca(placa)){
                carrosPlaca.add(carro);
            }
        }
        return carrosPlaca;
    }

    public ArrayList<Carro> getCavalos(int cavalos){
        ArrayList<Carro> carrosCavalos = new ArrayList<>();
        for(Carro carro : carros){
            if(carro.isCavalos(cavalos)){
                carrosCavalos.add(carro);
            }
        }
        return carrosCavalos;
    }

    public ArrayList<Carro> getMarca(String marca){
        ArrayList<Carro> carrosMarca = new ArrayList<>();
        for(Carro carro : carros){
            if(carro.isMarca(marca)){
                carrosMarca.add(carro);
            }
        }
        return carrosMarca;
    }

    @Override
    public String toString() {
        String value = "Aqui estao todos os carros preenchidos: \n";
        for(Carro carro : carros){
            value = value + carro.toString();
        }
        return value;
    }


}







