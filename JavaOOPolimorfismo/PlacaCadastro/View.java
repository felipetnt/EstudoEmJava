package JavaOOPolimorfismo.PlacaCadastro;

public class View {
    public static Carro lerCarro(){
        Carro carro = new Carro();
        String nome = Leitura.lerString("Insira o nome do carro: ");
        carro.setNome(nome);
        String placa = Leitura.lerString("Insira a placa do seu carro: ");
        carro.setPlaca(placa);
        String marca = Leitura.lerString("Insira o nome da marca do seu carro: ");
        carro.setMarca(marca);
        int cavalos = Leitura.lerInt("Insira a quantidade de cavalos que seu carro possui: ");
        carro.setCavalos(cavalos);
        return carro;
    }
    
    public static ServiceCarros lerConcessionaria(){
        ServiceCarros concessionaria = new ServiceCarros();
        Carro car = new Carro();
        boolean isIgual = false;
        boolean continuar;
        do{
            do{
                car = lerCarro();
                for(int i = 0; i < concessionaria.carros.size(); i++){
                    if(car.equals(concessionaria.carros.get(i))){
                        isIgual = true;
                        break;
                    } else {
                        isIgual = false;
                    }
                }
                if(isIgual == true){
                    System.out.println("Voce ja inseriu esse carro antes, por favor insira um carro novo.");
                }
            }while(isIgual);

            concessionaria.carros.add(car);
            continuar = Leitura.lerContinue();
            if(continuar){
                System.out.println("Voce escolheu inserir mais um carro! Segue o questionario com suas informacoes: \n");
            }
        } while(continuar);

        return concessionaria;
    }

}
