import java.util.Scanner;

public class DIgitos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String cad;
        System.out.println("Escribe un texto y te dire cuantos caracteres numericos hay: ");
        cad = scanner.nextLine();
        String[] palabras = Longitud2.dividirEnPalabras(cad);
        System.out.println("Hay en total:");
        for (String palabra: palabras){
           count += DIgitos1.contarDigitos(palabra);
        }
        System.out.println(count);
    }
    public static int contarDigitos(String cad1){
        char[] numeros = new char[]{'0','1','2','3','4','5','6','7','8','9'};
        int contador = 0;

        for (char c : cad1.toCharArray()) {
            if (esDigito(c, numeros)) {
                contador++;
            }
        }
        return contador;
    }
    public static boolean esDigito(char c, char[] numeros){

        for (char numero : numeros){
            if (c == numero){
                return true;
            }
        }
        return false;
    }
}
