public class Printer {
    public static void print(String msg, Laboratorio[] laboratorios) {
        System.out.println(msg);
        print(laboratorios);
    }

    public static void print(Laboratorio[] laboratorios) {
        for(Laboratorio lab : laboratorios) {
            System.out.println(lab);
        }
    }

    public static void print(String msg, int quantidade) {
        System.out.println(msg + quantidade);
    }

    public static void print(String msg, double preco) {
        System.out.println(msg + preco);
    }

    public static void print(String msg, Laboratorio[] laboratorios, int quantidade) {
        for(Laboratorio lab : laboratorios) {
            System.out.println(lab.local);
        }
        print("A quantidade de itens totais na universidade eh: ", quantidade);
    }
}
