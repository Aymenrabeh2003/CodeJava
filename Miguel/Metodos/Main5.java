import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];
        MayorDeTres java = null;
        System.out.println("Escribe 3 numeros y te dire el mayor:");
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
            java = new MayorDeTres(numeros);
        }
        java.elMayor();
    }
}
