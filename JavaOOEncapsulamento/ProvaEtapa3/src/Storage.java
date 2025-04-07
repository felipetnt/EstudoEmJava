import java.util.ArrayList;
class Storage {
    Pasta[] pastas = new Pasta[0];

    public void adicionar(Pasta pasta) {
        Pasta[] aux = new Pasta[pastas.length + 1];
        int i = 0;
        for(i = 0; i < pastas.length; i++){
            aux[i] = pastas[i];
        }
        aux[i] = pasta;
        pastas = aux;
    }

    public String toString(){
        String s = "";
        for(Pasta pasta : pastas){
            s += pasta.toString() + pasta.ano;
        }
        return s;
    }

    public String toString2(){
        String s = "";
        for(Pasta pasta : pastas){
            s += pasta.toString2();
        }
        return s;
    }

    public ArrayList<Documento> getPastasExtensao(String extencao) {
        ArrayList<Documento> documentosExt = new ArrayList<>();
        for(Pasta pasta : pastas){
            for(Documento documento : pasta.documentos){
                documentosExt = pasta.searchDocumentosByExtensao(extencao);
            }
        }
        return documentosExt;
    }

    public ArrayList<Pasta> getPastasAno(int ano) {
        ArrayList<Pasta> pastasAno = new ArrayList<>();
        int i = 0;
        for(Pasta pasta : pastas){
            if(pasta.ano == ano){
                pastasAno.add(pasta);
            }
        }
        return pastasAno;
    }

    public int totalBytes(){
        int total = 0;
        for(Pasta pasta : pastas){
            total += pasta.totalBytesDoc();
        }
        return total;
    }

}
