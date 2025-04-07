import java.io.FileReader;
import java.util.Scanner;

public class View {
    public static void exibirMenu() {
        boolean continuar;
        FIFA fifa = new FIFA();
        int opcao;
        do {
            opcao = exibicaoMenu();
            switch (opcao) {
                case 1: //LISTAR JOGADORES
                    int totalJogadores = Leitura.lerInt("Insira o total de jogadores: ");
                    fifa.jogadores = View.lerJogadores(fifa.jogadores, totalJogadores);
                    break;
                case 2:// O jogador com mais gols na temporada
                    Jogador melhorJogador = fifa.getMelhorJogador();
                    System.out.println("O melhor jogador da temporada foi: " + melhorJogador);
                    break;
                case 3:// Todos os jogadores Medianos
                    Jogador[] jogadoresByQualificacao = fifa.getJogadoresByQualificacao(fifa.countJogadoreByQualificacao("Mediana"), "Mediana" );
                    Printer.print("Aqui estao os jogadores Medianos: ", jogadoresByQualificacao);
                    break;
                case 4:
                    double media = fifa.getMedia(fifa.somaDeGolsIdade(18), fifa.countJogadoresIdade(18) );
                    Printer.printDouble("A media de jogadores maiores de 18: ", media);
                case 5: //Gasto total da fifa...
                    double custoTotal = fifa.getCustoTotal();
                    Printer.printDouble("A fifa teve gasto total: ", custoTotal);
                    break;
                default:
                    System.out.println("Insira um numero valido!");
            }
            continuar = Leitura.lerContinue();
        } while (continuar);
    }

    public static Jogador lerJogador() {
        Jogador jogador = new Jogador();
        String nome = Leitura.lerString("Insira o nome do jogador: ");
        jogador.setNome(nome);
        String paisDeOrigem = Leitura.lerString("Insira o pais do origem: ");
        jogador.setNomePaisOrigem(paisDeOrigem);
        int idade = Leitura.lerInt("Insira o idade do jogador: ");
        jogador.setIdade(idade);
        int quantidadeGols = Leitura.lerInt("Insira o quantidade de gols do jogador: ");
        jogador.setQuantidadeGols(quantidadeGols);
        return jogador;
    }

    public static Jogador[] lerJogadores(Jogador[] jogadores, int qtdJogadores) {
        jogadores = new Jogador[qtdJogadores];
        for (int i = 0; i < qtdJogadores; i++) {
            jogadores[i] = lerJogador();
        }
        return jogadores;
    }

    public static int exibicaoMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Listar todos os jogadores");
        System.out.println("2 - O jogador com mais gols na temporada");
        System.out.println("3 - Os jogadores com classificacao media");
        System.out.println("4 - Gasto da FIFA");
        System.out.println("0 - Sair");
        return new Scanner(System.in).nextInt();
    }
}
