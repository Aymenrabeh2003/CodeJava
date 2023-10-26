import java.util.Scanner;

public class Longitud2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad;
        System.out.println("Escribe un texto y te dire cual es la " +
                "palabra con más caracteres: ");
        cad = scanner.nextLine();
        String[] palabras = Longitud2.dividirEnPalabras(cad);

        for (String palabra : palabras) {
            boolean comprobarDig = Longitud2.contarDigitos(palabra, 6);

            if (comprobarDig) {
                System.out.println("Hay una palabra que es mayor a K");
                break;
            }
        }

    }

    public static boolean contarDigitos(String cad, int k){
        return cad.length() >= k;
    }

    public static String[] dividirEnPalabras(String cadena){
        // Quitar espacios en blanco al principio y al final
        cadena=cadena.trim();
        // Reemplazar uno o más espacios en blanco por un solo espacio
        cadena=cadena.replaceAll(" +", " ");
        // Dividir la cadena en partes por el carácter espacio (devuelve un array con cada una de las partes)
        return cadena.split(" ");
    }
}
