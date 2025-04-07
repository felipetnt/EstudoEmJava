package exercicioVinteNove;

public class exercicio {
    public static void main(String[] args) {
    int[][] mat = {
        {1,2,3}, 
        {4,5,6}, 
        {7,8,9}
    }; 
    int[][] mat2 = {   
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int[][] matrizSomada = new int[3][3];

    int i;
    int j;
// colunas
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                matrizSomada[i][j] = mat[i][j] + mat2[i][j];
            }
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.println(matrizSomada[i][j]+"");
            }
        }
    }
}

