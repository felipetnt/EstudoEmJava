// Considere que, para cada um dos hotéis fazenda da região, se tenha registrado 
// o nome do hotel, a sua distância do centro da cidade, o número médio de 
// visitantes no último feriado e o tipo de acesso ao hotel (0 – acesso não asfaltado; 
// 1 – acesso asfaltado). Construa um algoritmo que forneça: 
// a) O número de hoteis que distam mais de 15km do centro; 
// b) A quantidade média de visitantes no último feriado, nos hoteis com acesso 
// não asfaltado; 
// c) O nome e a distância do centro em Km, de todos os hoteis de acesso 
// asfaltado que tiveram menos de 1.000 visitantes. 
// Ex.: HA, DA=10, V=100, AC=0 
//        HB, DA=20, V=50, AC=1 
package exercicioVinteTres;
import java.util.Scanner;
public class exercicio {
    public static void main(){
        int numeroDeHoteisFazenda;
        String nome;
        int acessoAsfaltado;
        int distancia;
        int numeroMedioVisitantes;
        int i = 0;
        int somadevisitantes = 0;
        int contagemHoteisDistancia = 0;
        int mediavisitantes = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de hoteis fazenda que tem na sua regiao\n");
        numeroDeHoteisFazenda = scanner.nextInt();
        while(i <= numeroDeHoteisFazenda){
            System.out.println("Digite abaixo o nome do hotel fazenda que voce fara o cadastro\n");
            nome = scanner.nextLine();
            System.out.println("Agora digite aqui se o acesso eh asfaltado ou nao, digite:\n0- caso nao seja asfaltado\n1 - caso  seja asfaltado \n");
            acessoAsfaltado = scanner.nextInt();
            System.out.println("Agora digite aqui sua distancia do centro em kilometros:\n");
            distancia = scanner.nextInt();
            System.out.println("A quantidade media de visitantes no ultimo feriado:\n");
            numeroMedioVisitantes = scanner.nextInt();
    
            if(distancia > 15){
                contagemHoteisDistancia = contagemHoteisDistancia + 1;
            }
            if(acessoAsfaltado == 0){
                somadevisitantes = somadevisitantes + numeroMedioVisitantes;
                mediavisitantes = numeroMedioVisitantes / somadevisitantes;
            }
            if(acessoAsfaltado == 1 && numeroMedioVisitantes < 1000){
                System.out.println("O hotel asfaltado %s que possui um total de %d visitantes em media durante o feriado, possui %d km de distancia do centro \n"+ nome);
                System.out.println("O hotel asfaltado %s que possui um total de %d visitantes em media durante o feriado, possui %d km de distancia do centro \n"+ numeroMedioVisitantes);
                System.out.println("O hotel asfaltado %s que possui um total de %d visitantes em media durante o feriado, possui %d km de distancia do centro \n"+ distancia);
            }
            i++;
    
        }
        System.out.println("A quantidade de hoteis que possuem mais de 15km de distancia em relacao ao centro foram: %d "+contagemHoteisDistancia);
        System.out.println("A media de visitantes no ultimo feriado nos hoteis sem o asfalto foi de: %.0f "+ mediavisitantes);
        scanner.close();
    }
}
