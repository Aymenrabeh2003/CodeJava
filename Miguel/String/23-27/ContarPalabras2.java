import java.util.Scanner;

public class ContarPalabras2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad;
        System.out.println("Escribe un texto y te diré cuantas palabras tiene: ");
        cad = scanner.nextLine();

        System.out.println("Hay "+ ContarPalabras2.contarPalabras(cad)+ " palabras");
    }

    public static int contarPalabras(String cad){
        int count = 0;
        boolean palabra = false;
        int finLinea = cad.length() - 1;

        for (int i = 0; i < cad.length(); i++){
            if(Character.isLetter(cad.charAt(i)) && i != finLinea){
                palabra = true;
            } else if (!Character.isLetter(cad.charAt(i)) &&
                    palabra) {
                count++;
                palabra = false;
            } else if(Character.isLetter(cad.charAt(i)) && i == finLinea){
                count++;
            }
        }
        return count;
    }
}
