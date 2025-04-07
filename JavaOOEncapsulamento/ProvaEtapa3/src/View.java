import java.util.ArrayList;

public class View {
    public static Documento lerDocumento() {
        Documento documento = new Documento();
        documento.nome = Leitura.lerString("Nome do documento: ");
        documento.extencao = Leitura.lerString("Insira a extensao: (png, pdf, jpeg ou jpg)");
        documento.bytes = Leitura.lerInt("Bytes do documento: ");
        return documento;
    }
    public static Pasta lerPasta() {
        boolean continuar;
        Pasta pasta = new Pasta();
        pasta.ano = Leitura.lerInt("Ano: ");
        do{
            System.out.println("Sobre o documento: ");
            pasta.adicionar(lerDocumento());
            continuar = Leitura.lerContinue("Deseja inserir mais um documento? (Sim/Nao)");
        } while(continuar);

        return pasta;
    }
    public static int exibirMenu(int ano){
        System.out.println("\nMenu Principal\n");
        System.out.println("1. Cadastrar pasta");
        System.out.println("2. Apresentar pasta");
        System.out.println("3. Apresentar todos os documentos de todas as pastas");
        System.out.println("4. Apresentar todos os documentos das pastas de " + ano );
        System.out.println("5. Tamanho em Bytes do armazenamento da empresa");
        System.out.println("6. Permitir ao usuário digitar uma extensão e apresentar todos os documentos que atendem a demanda de todas as pastas.\n");
        return Leitura.lerInt();
    }
    public static void lerMenu(){
        int opcao;
        boolean continuar;
        Storage service = new Storage();
        do{
            opcao = exibirMenu(2021);
            switch(opcao){
                case 1:
                   service.adicionar(View.lerPasta());
                   break;
                case 2:
                    System.out.println(service.toString2());
                    break;
                case 3:
                    System.out.println(service);
                    break;
                case 4:
                    System.out.println("Aqui estao as pastas de 2021: ");
                    ArrayList<Pasta> pastaAno = service.getPastasAno(2021);
                    Printer.print(pastaAno);
                    break;
                case 5:
                    int totalBytes = service.totalBytes();
                    System.out.println("O total de bytes que a empresa teve foi: " + totalBytes);
                    break;
                case 6:
                    String extensao = Leitura.lerString("Insira a extensao que deseja; ");
                    ArrayList<Documento> documentosExt = service.getPastasExtensao(extensao);
                    Printer.print(documentosExt);
                break;

                default:
                    System.out.println("Insira um numero valido!");
            }
            continuar = Leitura.lerContinue("Deseja continuar no menu? (Sim/Nao)");
        }while(continuar);
    }
}
