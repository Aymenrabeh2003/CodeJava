import java.util.Scanner;

public class PalabrasAlfabeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad;
        System.out.println("Escribe una palabra y te dire si es o no alfabetica: ");
        cad = scanner.next();
        boolean esAlfabetica = PalabrasAlfabeticas.esAlfabetica(cad);

        if (esAlfabetica){
            System.out.println("La cadena "+cad+" es alfabetica");
        } else{
            System.out.println("No es alfabetica");
        }
    }
    public  static boolean esAlfabetica(String palabra){
        char charactTemp = palabra.charAt(0);
        for (int i = 0; i < palabra.length(); i++){
            char numeroChar = palabra.charAt(i);

            if (numeroChar >= charactTemp){
                charactTemp = numeroChar;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
