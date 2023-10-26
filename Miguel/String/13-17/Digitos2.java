import java.util.Scanner;

public class Digitos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String cad;
        System.out.println("Escribe un texto y te dire cuantos numeros hay: ");
        cad = scanner.nextLine();
        String[] palabras = Longitud2.dividirEnPalabras(cad);
        System.out.println("Hay en total:");
        for (String palabra: palabras){
            count += Digitos2.detectarNumero(palabra);
        }
        System.out.println(count);
    }

    public static int detectarNumero(String cad1){
        char[] numeros = new char[]{'0','1','2','3','4','5','6','7','8','9'};
        int contador = 0;

        for (int i = 0; i < cad1.length(); i++){
            if (Digitos2.esNumero(cad1.charAt(i),numeros)){
                contador++;
                return contador;
            }
        }
        return contador;
    }

    public static boolean esNumero(char num, char[] numeros){

        for (char numero : numeros){
            if (num == numero){
                return true;
            }
        }
        return false;

    }
}
