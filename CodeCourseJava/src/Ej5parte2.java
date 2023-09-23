import java.util.Scanner;

public class Ej5parte2 {
    public static void main(String[] args) {
        /*
        String frase = "Hola, buenos dias, como estamos?";
        String frase_resumen = frase.substring(19,32);
        System.out.println(frase_resumen);
        */
        //comparar strings

        String alumno1, alumno2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe dos nombres y te dire si son iguales:");

        alumno1 = scanner.next();
        alumno2 = scanner.next();

        boolean same = alumno1.equals(alumno2);

        if (same){

            System.out.println("Son iguales");

        } else {
            System.out.println("No son iguales");
        }

        //La clase String tiene muchos metodos que se pueden buscar
        //en la API de Java.
    }
}
