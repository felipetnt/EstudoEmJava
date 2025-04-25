
public class Carro {
    private String placa;
    private String nome;
    private String marca;
    private int cavalos;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getCavalos() {
        return cavalos;
    }
    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    @Override
    public boolean equals(Object obj) {
        Carro o = (Carro) obj;
        return getPlaca().equals(o.getPlaca()) && getCavalos() == (o.getCavalos()) && getNome().equals(o.getNome()) && getMarca().equals(o.getMarca());
    }

    public boolean isCavalos(int cavalos){
        if(getCavalos() > cavalos){
            return true;
        }
        return false;
    }
    public boolean isMarca(String marca){
        if(getMarca().equals(marca)){
            return true;
        }
        return false;
    }

    public boolean isInicioPlaca(String inicioPlaca){
        for (int i = 0; i < 3; i++) {
            if (placa.charAt(i) == inicioPlaca.charAt(i)) {
                
            }
        }
        return false;
    }
}


    

}
