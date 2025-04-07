package L12Exercicio;
import L19Exercicio.Leitura;

public class exercicio {
    public static void main(String[] args) {
        Impressao imprimir = new Impressao();
        String frase = Leitura.lerString("Digite uma frase: ");
        String fraseEmCaixaAlta = SistemaFrase.trocarCaixaAlta(frase);// coloca todos os caracteres para "Upper Case" - caixa alta
        imprimir.imprimirCaixaAlta(frase);
        String fraseEmCaixaBaixa = SistemaFrase.trocarCaixaBaixa(frase); // coloca todos os caracteres para "Lower Case" - caixa bauixa
        imprimir.imprimirCaixaBaixa(frase);
        int quantidadeCaracteres = frase.length(); // mede a quantidade de caracteres em uma frase, e insere na variavel, o numero dos caracteres.
        System.out.println("A quantidade de caracteres na frase: " + quantidadeCaracteres);
        String fraseComparada = "Eu estou estudando Java";
        if (frase.equals(fraseComparada)) {
            System.out.println("A frase digitada é igual a 'Eu estou estudando Java'.");
        } else {
            System.out.println("A frase digitada NÃO é igual a 'Eu estou estudando Java'.");
        }
        String[] palavras = frase.split("\\s+");  //split == subfuncao da string para dividi-la em um array de string.
        int quantidadePalavras = palavras.length;
        System.out.println("A quantidade de palavras na frase: " + quantidadePalavras);
    }
}
