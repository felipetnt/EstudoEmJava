public class View {
    public static Item lerItem(){
        Item item = new Item();
        System.out.print("Sobre o produto: \n");
        item.descricao = Leitura.lerString("Insira a descricao do seu item: ");
        item.codigo = Leitura.lerString("Insira o codigo do seu item: ");
        item.tipo = Leitura.lerString("Insira o tipo do seu item: ");
        item.preco = Leitura.lerDouble("Insira o preco do seu item: ");
        return item;
    }
    public static ResponsavelT lerResponsavel(){
        ResponsavelT responsavel = new ResponsavelT();
        responsavel.nome = Leitura.lerString("Insira seu nome: ");
        responsavel.matricula = Leitura.lerString("Insira sua matricula: ");
        responsavel.cargo = Leitura.lerString("Insira seu cargo: ");
        return responsavel;
    }
    public static Universidade lerUniversidade(){
        Universidade uni = new Universidade();
        int i = 0;
        boolean continuar;
        do{
            uni.adicionar(lerLaboratorio());
            continuar = Leitura.lerContinue();
        } while (continuar);
        return uni;
    }
    public static Laboratorio lerLaboratorio(){
        Laboratorio lab = new Laboratorio();
        lab.responsavelT = lerResponsavel();
        lab.local = Leitura.lerString("Insira a local do laboratorio: ");
        int quantidade = Leitura.lerInt("Insira o quantidade de itens que deseja nesse laboratorio: ");
        lab.itens = new Item[quantidade];
        for(int i = 0; i < lab.itens.length; i++){
            lab.itens[i] = lerItem();
        }
        return lab;
    }
}
