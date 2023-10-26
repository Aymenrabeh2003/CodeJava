import java.util.Scanner;

public class Longitud1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad;
        int k;
        int numeroPalMayorK = 0;
        System.out.println("Escribe un texto y te diré cuantas palabras tiene: ");
        cad = scanner.nextLine();
        System.out.println("Número:");
        k = scanner.nextInt();
        System.out.println("Las palabras mayores que "+ k +" digitos hay: ");

        String[] palabras = Longitud1.dividirEnPalabras(cad);

        for (int i = 0; i < palabras.length; i++) {
            numeroPalMayorK += Longitud1.contarPalabrasConLongitudK(palabras[i], k);
        }
        System.out.println(numeroPalMayorK);
    }

    public static int contarPalabrasConLongitudK(String cad, int k){
        int countPal = 0;
        if (cad.length() > k){
            countPal = 1;
        }
        return countPal;
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
