public class Documento {
    String nome;
    String extencao;
    int bytes;

    public String toString(){
        String ret = "Nome: " + nome + "\n";
        ret += "Extensao: " + extencao + "\n";
        ret += "Bytes: " + bytes + "\n";
        return ret;
    }
}
