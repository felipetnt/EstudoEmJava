// Faça um algoritmo que copie o conteúdo de um vetor em um segundo vetor
package exercicioVinteSete;
public class exercicio {
    public static void main(String[] args) {
        int[] vetorOriginal = {1, 2, 3, 4, 5};
        int[] vetorCopia = new int[vetorOriginal.length]; // criando um vetor copia do mesmo tamanho que o vetor original.
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorCopia[i] = vetorOriginal[i];
        }
        System.out.println("Vetor Copia:\n");
        for (int num : vetorCopia) {
            System.out.println("" + num);
        }
    }
}
