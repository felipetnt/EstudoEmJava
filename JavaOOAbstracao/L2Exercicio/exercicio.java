package L2Exercicio;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        String nome;
        double nota1, nota2;
        while (true) {
            System.out.print("Digite seu nome: ");
            nome = new Scanner(System.in).nextLine();
            if (nome.equalsIgnoreCase("Nao")) {
                System.out.println("Programa finalizado.");
                break; // Encerra o loop e o programa
            }

            // Solicita e valida a primeira nota
            System.out.print("Digite sua primeira nota (0 a 10): ");
            nota1 = lerNota(nota1);
            while (nota1 < 0 || nota1 > 10) {
                System.out.print("Nota inválida! Digite uma nota entre 0 e 10: ");
                nota1 = lerNota(nota1);
            }

            // Solicita e valida a segunda nota
            System.out.print("Digite sua segunda nota (0 a 10): ");
            nota2 = lerNota(nota1);
            while (nota2 < 0 || nota2 > 10) {
                System.out.print("Nota inválida! Digite uma nota entre 0 e 10: ");
                nota2 = lerNota(nota2);
            }

            // Calcula a média
            double media = media(nota1, nota2);

            // Exibe os resultados
            System.out.println("Nome do estudante: " + nome);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Média: " + media);

            // Verifica se o aluno foi aprovado ou reprovado
            if (media >= 6) {
                System.out.println("Status: Aprovado!");
            } else {
                System.out.println("Status: Reprovado!");
            }

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja continuar? (S-Sim / N-Não): ");
            String continuar = new Scanner(System.in).nextLine();

            if (continuar.equalsIgnoreCase("N")) {
                System.out.println("Programa finalizado.");
                break; // Encerra o programa
            }
        }
    }

    // Método para calcular a média das notas
    public static double media(double nota1, double nota2) {
        return (nota1 + nota2) / 2; // Calcula a média
    }
    public static double lerNota() {
        return new Scanner(System.in).nextDouble(); 
    }
}
