import java.util.Scanner;

public class Ej30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra;
        String palabra_invertida = null;
        System.out.println("Escribe la palabra: ");
        palabra = scanner.next();
        boolean palindromo = true;

        for (int i = 0; i < palabra.length(); i++){
            System.out.print(palabra.charAt(i));
        }
        System.out.println("");
        for (int i = palabra.length()-1; i >= 0; i--){
            System.out.print(palabra_invertida = String.valueOf(palabra.charAt(i)));
        }
        if (palabra.equals(palabra_invertida)){
            palindromo = false;
        }
        System.out.println("");
        if (palindromo){
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

    }
}
