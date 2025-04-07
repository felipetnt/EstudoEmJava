import java.util.ArrayList;
class Pasta {
    int ano;
    Documento[] documentos = new Documento[0];

    public void adicionar(Documento documento) {
        Documento[] aux = new Documento[documentos.length + 1];
        int i = 0;
        for( i = 0; i < documentos.length; i++){
            aux[i] = documentos[i];
        }
        aux[i] = documento;
        documentos = aux;
    }

    public int totalBytesDoc() {
        int total = 0;
        for(Documento documento : documentos){
            total += documento.bytes;
        }
        return total;
    }

    public ArrayList<Documento> searchDocumentosByExtensao(String extensao) {
        ArrayList<Documento> documentosByExtensao = new ArrayList<>();
        int i = 0;
        for(Documento documento : documentos){
            if(documento.extencao.equals(extensao)){
                documentosByExtensao.add(documento);
            }
        }
        return documentosByExtensao;
    }

    @Override
    public String toString() {
        String s = "Ano da pasta: " + ano + "\n";
        for(Documento documento : documentos){
            s += documento.toString();
        }
        return s;
    }
    public String toString2() {
        String s = "Ano da pasta: " + ano + "\n";
        for(Documento documento : documentos){
            s += documento.nome;
        }
        return s;
    }
}
