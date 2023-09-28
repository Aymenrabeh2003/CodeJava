public class Ej9 {
    public static void main(String[] args) {
        //matrices

        int [] mi_matriz = new int[5];
        //o
        //int matriz[] = new int[5];
        //mi_matriz = new int[]{1,5,8,-45,8};
        //aunque mejor asi
        int[] numeros = new int[]{4,5,6,7,8};

        for (int i = 0; i < numeros.length; i++){
            //con ese array es más complicado, ya que la
            //posición no es tan clara, se usaria en caso de
            //que la matriz sea corta

            //aunque se puede usar el .length
            System.out.println("Numero: "+numeros[i]);
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Numero: "+mi_matriz[i]);
        }

    }
}
