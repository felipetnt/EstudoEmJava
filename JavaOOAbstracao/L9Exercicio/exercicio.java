package L9Exercicio;
import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        int i;
        aluno aluno = new aluno();
        instituicao inst = new instituicao();
        System.out.println("Insira a quantidade de alunos na turma");
        inst.quantidadeTurma = new Scanner(System.in).nextInt();
        String[] nomes = new String[inst.quantidadeTurma + 1];
        for (i = 0; i < inst.quantidadeTurma; i++) {
            aluno.nome = Leitor.lerString("Insira seu nome:");
            aluno.matricula = Leitor.lerLong("Insira sua matricula:");
            aluno.situacao = Leitor.lerString("Insira sua situacao: (REGULAR, BOLSISTA)");
            if (aluno.situacao.equals("BOLSISTA")) {
                inst.contagemAlunosBolsistas++;
            } else {
                if (aluno.situacao.equals("REGULAR")) {
                    inst.contagemAlunosRegular++;
                }
            }
            nomes[i] = aluno.nome;
        }
        for(i = 0; i < inst.quantidadeTurma; i++) {
            System.out.println(nomes[i]);
        }
        System.out.println("A quantidade de alunos bolsistas é " + inst.contagemAlunosBolsistas);
        System.out.println("A quantidade de alunos regulares é " + inst.contagemAlunosRegular);
    }
}