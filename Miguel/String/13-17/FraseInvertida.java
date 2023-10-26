import java.util.Scanner;

public class FraseInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad;
        System.out.println("Escribe un texto y te lo devolveré de forma invertida (por palabras): ");
        cad = scanner.nextLine();
        String[] palabras = Longitud2.dividirEnPalabras(cad);
    }

    public static String fraseInvertida(String[] palabras){
        String[] palabrasInv;
        for (int i = palabras.length; i > 0; i--){
            palabrasInv
        }
    }
}
