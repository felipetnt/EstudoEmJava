public class Printer {
    public static void print(String msg, Arduino[] arduinos) {
        System.out.println(msg);
        print(arduinos);
    }

    public static void print(Arduino[] arduinos) {
        for(Arduino arduino : arduinos) {
            System.out.println(arduino);
        }
    }
    public static void print(String msg, double preco) {
        System.out.println(preco);
    }
}
