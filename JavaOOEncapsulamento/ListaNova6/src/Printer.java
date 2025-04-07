public class Printer {
    public static void print(String msg, Jogador[] jogadores) {
        System.out.println(msg);
        print(jogadores);
    }

    public static void print(Jogador[] jogadores) {
        for(Jogador jogador : jogadores) {
            System.out.println(jogador.toString());
        }
    }
    public static void printDouble(String msg, double doble) {
        System.out.println(doble);
    }
}
