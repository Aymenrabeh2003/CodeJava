import java.util.Scanner;

public class Reemplazar {
    public static void main(String[] args) {
        String cadena;
        char char1;
        char char2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la cadena " +
                "y el char que quieres reemplazar y por cual:");
        cadena = scanner.next();
        char1 = scanner.next().charAt(0);
        char2 = scanner.next().charAt(0);

        System.out.println(Reemplazar.change(cadena,char1,char2));


    }

    public static String change(String cad, char char1, char char2){
        return cad.replace(char1,char2);
    }

}
