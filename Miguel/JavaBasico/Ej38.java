import java.util.Scanner;

public class Ej38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra = "";
        int count = 0;
        char[] vocales = new char[]{'a','e','i','o','u'};

        System.out.println("Escribe una palabra y te dire cuantas vocales");
        palabra = scanner.next();

        for (char vocal:vocales){
            for (int i = 0; i < palabra.length(); i++){
                if (vocal == palabra.charAt(i)){
                  count++;
                }
            }
        }

        System.out.println("Hay "+count+" vocales en la palabra");
    }
}
