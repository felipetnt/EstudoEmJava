public class Item {
    String descricao;
    String codigo;
    String tipo; // TECNOLOGIA, OUTROS.
    double preco;

    public boolean isType(String type){
        boolean tipoValido;
        tipoValido = tipo.equals(type);
        return tipoValido;
    }
    public String toString() {
        return  "\nDescricao: " + descricao +
                "\nCodigo: " + codigo +
                "\nTipo: " + tipo +
                "\n Preco: " + preco;
    }

}
