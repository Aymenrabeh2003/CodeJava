import java.util.Scanner;

public class ContarPalabras1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad;
        int count = 0;
        System.out.println("Escribe un texto y te diré cuantas palabras tiene: ");
        cad = scanner.nextLine();
        String[] palabras = Longitud2.dividirEnPalabras(cad);

        for (int i = 0; i < palabras.length; i++){
            count++;
        }

        System.out.println("Hay "+ count+ " palabras");

    }

}
