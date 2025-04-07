import java.util.Scanner;

public class ServicePlaca {

    Arduino[] arduinos = new Arduino[0];

    public int countArduinos(boolean type){
        int count = 0;
        for( Arduino arduino : arduinos ){
            if(arduino.isMLP){
                count++;
            }
        }
        return count;
    }
    public String toString(){
        String retorno = "Aqui esta todas as Placas arduino: ";
        for(Arduino arduino : arduinos){
            retorno += arduino.toString();
        }
        return retorno;
    }

    public double custoTotalArduinosFalse(){
        double custoTotal = 0;
        Arduino[] arduinosFalseMLP = getArduinosFalseMLP();
        for( Arduino arduino : arduinosFalseMLP ){
            custoTotal += arduino.preco;
        }
        return custoTotal;
    }
    public Arduino[] getArduinosMLP(boolean type) {
        Arduino[] arduinosMLP = new Arduino[countArduinos(true)];
        int i = 0;
        for( Arduino arduino : arduinos ){
            if(arduino.isMLP == type){
                arduinosMLP[i++] = arduino;
            }
        }
        return arduinosMLP;
    }

    public Arduino[] getArduinosFalseMLP() {
        Arduino[] arduinosMLP = new Arduino[countArduinos(false)];
        int i = 0;
        for( Arduino arduino : arduinos ){
            if(!arduino.isMLP){
                arduinosMLP[i++] = arduino;
            }
        }
        return arduinosMLP;
    }

    public void checkArduino(){
        int i = 0;
        for (Arduino arduino: arduinos) {
            if (arduino.codigo.equals(arduinos[i].codigo)) {
                System.out.println("Placa com código " + arduino.codigo + " já cadastrada!");
            }
            i++;
        }
    }

    public double custoTotal(){
        double custoTotal = 0;
        for (Arduino arduino: arduinos) {
            custoTotal += arduino.preco;
        }
        return custoTotal;
    }

    public void adicionar(Arduino arduino) {
        int i = 0;
        Arduino[] aux = new Arduino[arduinos.length + 1];
        for(Arduino arduinoAux : arduinos){
            aux[i++] = arduinoAux;
        }
        aux[arduinos.length] = arduino;
        arduinos = aux;
    }
}
