public class Printer {
    public static void print(Atleta[] atletas) {
        for(Atleta atleta: atletas) {
            System.out.println(atleta);
        }
    }

    public static void print(String msg, double media) {
        System.out.println(msg + media);
    }

    public static void print(String msg, Atleta atleta) {
        System.out.println(msg + atleta);
    }

}
