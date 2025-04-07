public class ResponsavelT {
    String matricula;
    String nome;
    String cargo; // TECNICO, ANALISTA.
    public String toString(){
        return  "\nMatricula: " + matricula +
                "\nNome: " + nome +
                "\nCargo: " + cargo;
    }
    public boolean isCargo(String cargoRequerido) {
        boolean isCargo;
        isCargo = cargo.equals(cargoRequerido);
        return isCargo;
    }
}
