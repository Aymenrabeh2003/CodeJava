import java.util.Scanner;

public class Longitud3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad;
        int k;
        boolean algunaPalabraMayorK = false;
        System.out.println("Escribe un texto y te diré si todas las palabras son cortas o si hay alguna que es mayor a K: ");
        cad = scanner.nextLine();
        System.out.println("Escribe el número k:");
        k = scanner.nextInt();
        String[] palabras = Longitud2.dividirEnPalabras(cad);

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > k) {
                algunaPalabraMayorK = true;
                break;
            }
        }

        if (algunaPalabraMayorK) {
            System.out.println("Hay al menos una palabra que es mayor a K.");
        } else {
            System.out.println("Todas las palabras son menores o iguales a K.");
        }
    }


}
