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
        boolean continuar;
        do{
            concessionaria.carros.add(lerCarro());
            continuar = Leitura.lerContinue();
            if(continuar){
                System.out.println("Voce escolheu inserir mais um carro! Segue o questionario com suas informacoes: \n");
            }
        } while(continuar);

        return concessionaria;
    }

}
