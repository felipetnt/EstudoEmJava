package L2Exercicio;

import java.util.Scanner;

public class simplificado {
    public static void main(String[] args) {
        //    Faça  um  programa  Java  que  receba  o  nome  de  um  estudante  e  duas  notas,  na  sequência, 
        //    apresente  todos  os  valores  informados,  a  média  e  se  ele  está  aprovado  ou  reprovado. 
        //    Detalhe:  você  não  deve  permitir  que  os  valores  informados  como  notas  sejam  inferiores  a  0 
        //    ou  superiores  a  10.  E  o  usuário  deve  informar  se  quer  continuar  a  usar  o  programa 
        //    informando S-Sim ou N-Não.
        double nota1 = 0;
        double nota2 = 0;
        double media = 0;
        String nome = "null";
        while(nome.equalsIgnoreCase("Nao")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insira seu nome: (Insira .Nao. Se quiser finalizar o programa)");
            nome = scanner.nextLine();
            System.out.println("Insira sua nota 1:");
            nota1 = scanner.nextDouble();
            System.out.println("Insira seu nome:");
            nota2 = scanner.nextDouble();
            media = nota1 + nota2 / 2;
            scanner.close();
            if(media > 0 && media < 6){
                System.out.println("Aqui sr(a)"+ nome);
                System.out.println("Sua media foi"+ media);
                System.out.println("E voce esta Reprovado(a)");
            } else {
                if(media >= 6 && media <= 10){
                    System.out.println("Aqui sr(a)"+ nome);
                    System.out.println("Sua media foi"+ media);
                    System.out.println("E voce esta Aprovado(a)");
                } else {
                    System.out.println("Insira um valor valido.");
                }
            }
        }
    }
}
