public class Ej9parte3 {
    public static void main(String[] args) {
        //array de dos dimensiones
        int[][] matrix = new int[4][5];
        //declarar directamente una matriz de dos dimensiones
        int [][] matrix2 ={
                {10,15,18,19,21},
                {5,25,37,41,15},
                {7,19,32,14,90},
                {85,2,7,40,27}
        };
/*
        for (int i = 0; i < 4; i++){
            System.out.println("");
            for (int j = 0; j < 5; j++){
                matrix[i][j] = j;
                if (matrix[i][j] >= 1 && matrix[i][j] <= 3){
                    matrix[i][j] = 1;
                }else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
        }
*/
        for (int[]fila:matrix2) {
            System.out.println();
            for (int z:fila) {
                System.out.print(z + " ");
            }
        }
    }
}
