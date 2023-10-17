public class MainPositivos {
    public static void main(String[] args) {
        int[] numeros = new int[]{1,2,6,8,9,-3,-6,6,-4,-9};
        int countnum = MainPositivos.positivos(numeros);
        System.out.println("Hay en el array un total de "+
                countnum +" numeros positivos");

    }
    public static int positivos(int[] numeros){
        int count = 0;
        for (int numero : numeros) {
            if (numero >= 0) {
                count++;
            }
        }
        return count;
    }
}
