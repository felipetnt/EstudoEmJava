import java.util.Scanner;

public class View {
    public static void exibirMenu() {
        boolean continuar;
        ServicePlaca service = new ServicePlaca();
        int opcao;
        do {
            opcao = exibicaoMenu();
            switch (opcao) {
                case 1:
                    service.adicionar(lerArduino());
                    break;
                case 2:
                    Printer.print("Aqui esta todos as placas Arduinos mostradas: \n", service.arduinos);
                    break;
                case 3:
                    double custo = service.custoTotal();
                    Printer.print("O custo total do arduino: \n", custo);
                    break;
                case 4:
                    Arduino[] arduinosMLP = service.getArduinosMLP(true);
                    Printer.print("Aqui esta todas as placas MLP: \n", arduinosMLP);
                    break;
                case 5:
                    double custoArduinosFalse = service.custoTotalArduinosFalse();
                    Printer.print("O preco do custo dos Arduinos nao MLP : \n", custoArduinosFalse);
                    break;
            }
            continuar = Leitura.lerContinue();
        } while (continuar);
    }

    public static boolean lerMLP() {
        String isMLP;
        boolean resultMLP;
        isMLP = Leitura.lerString("Insira se a placa Arduino produz sinal MLP: (Sim, Nao)");
        resultMLP = isMLP.equalsIgnoreCase("Sim");
        return resultMLP;
    }

    public static Arduino lerArduino() {
        Arduino arduino = new Arduino();
        arduino.codigo = Leitura.lerString("Insira o codigo do Arduino: ");
        arduino.pinos = Leitura.lerInt("Insira a quantidade de pinos: ");
        arduino.entradasAnalogicas = Leitura.lerInt("Insira a quantidade de entradas analogicas: ");
        arduino.preco = Leitura.lerDouble("Insira o preco do Arduino: ");
        arduino.isMLP = lerMLP();
        return arduino;
    }

    public static int exibicaoMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar Placas");
        System.out.println("2 - Apresentar todas as placas");
        System.out.println("3 - Custo total com as placas");
        System.out.println("4 - Todas as placas que produzem sinal MLP");
        System.out.println("5 - Custo das placas que não produzem sinal MLP");
        System.out.println("0 - Sair");
        return new Scanner(System.in).nextInt();
    }
}
