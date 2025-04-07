import java.util.ArrayList;

public class Printer {
    public static void print(String msg, ArrayList<?> documentos) {
        System.out.println(msg);
        print(documentos);
    }

    public static void print(ArrayList<?> documentos) {
        for(Object documento : documentos) {
            System.out.println(documento);
        }
    }
    public static void print(String msg, ArrayList pastas) {
        System.out.println(msg);
        print(pastas);
    }

    public static void print(ArrayList pastas) {
        for(Object pasta : pastas) {
            System.out.println(pasta);
        }
    }
    public static void print(String msg, double doble) {
        System.out.println(doble);
    }
}
