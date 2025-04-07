// Crie um algoritmo chamado Zodiaco. Este algoritmo deve ler a data do seu 
// aniversário e atribuir um valor para a variável inteira chamada signo, conforme 
// lista abaixo: 
// a) 1o signo do zodíaco: Aquário (21/jan a 19/fev) 
// b) 2o signo do zodíaco: Peixes (20/fev a 20/mar) 
// c) 3o signo do zodíaco: Áries (21/mar a 20/abr) 
// d) 4o signo do zodíaco: Touro (21/abr a 20/mai) 
// e) 5o signo do zodíaco: Gêmeos (21/mai a 20/jun) 
// f) 6o signo do zodíaco: Câncer (21/jun a 21/jul) 
// g) 7o signo do zodíaco: Leão (22/jul a 22/ago) 
// h) 8o signo do zodíaco: Virgem (23/ago a 22/set) 
// i) 9o signo do zodíaco: Libra (23/set a 22/out) 
// j)
//  10o signo do zodíaco: Escorpião (23/out a 21/nov) 
// k) 11o signo do zodíaco: Sagitário (22/nov a 21/dez) 
// l) 12o signo do zodíaco: Capricórnio (22/dez a 20/jan) 
// O algoritmo deve imprimir uma mensagem, como o exemplo: "Você é do seguinte 
// signo do zodíaco: Libra" 
package exercicioTreze;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Afim de descobrir seu signo. \nInsira o dia que voce nasceu: \n");
        int dia = scanner.nextInt();
        System.out.print("Insira o mes que voce nasceu: \n");
        int mes = scanner.nextInt();
        if( dia > 21 && mes == 1 || 19 > dia && mes == 2 ){
            System.out.print("Voce eh do signo aquario!");
        } else {
            if( dia > 20 && mes == 2 || 20 > dia && mes == 3 ){
                System.out.print("Voce eh do signo peixes!");
            } else {
                if( 21 < dia && mes == 3 || 20 > dia && mes == 4 ){
                    System.out.print("Voce eh do signo aries!");
                } else {
                    if( 21 < dia && mes == 4 || 20 > dia && mes == 5 ){
                        System.out.print("Voce eh do signo touro!");
                    } else { 
                        if( 21 < dia && mes == 5 || 20 > dia && mes == 6 ){
                            System.out.print("Voce eh do signo gemeos!");
                        } else {
                            if( 21 < dia && mes == 6 || 21 > dia && mes == 7 ){
                                System.out.print("Voce eh do signo cancer!");
                            } else {
                                if( 22 < dia && mes == 7 || 22 > dia && mes == 8 ){
                                    System.out.print("Voce eh do signo leao!");
                                } else {
                                    if( 23 < dia && mes == 8 || 22 > dia && mes == 9 ){
                                        System.out.print("Voce eh do signo virgem!");
                                    } else {
                                        if( 23 < dia && mes == 9 || 22 > dia && mes == 10 ){
                                            System.out.print("Voce eh do signo libra!");
                                        } else {
                                            if( 23 < dia && mes == 10 || 21 > dia && mes == 11 ){
                                                System.out.print("Voce eh do signo escorpiao!");
                                            } else {
                                                if( 22 < dia && mes == 11 || 21 > dia && mes == 12 ){
                                                    System.out.print("Voce eh do signo sagitario!");
                                                } else {
                                                    if( 22 < dia && mes == 12 || 20 > dia && mes == 1 ){
                                                        System.out.print("Voce eh do signo capricornio!");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }   
                    }
                }
            }
        }
        scanner.close();
    }
}
