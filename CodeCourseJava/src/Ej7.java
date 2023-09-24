import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        //condicionales
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la edad por favor");
        int edad = scanner.nextInt();
        /*

        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor");
        }*/

        if(edad < 18){
            System.out.println("Eres adolescente");
        } else if(edad < 40){
            System.out.println("Eres joven");
        } else if(edad < 65){
            System.out.println("Eres maduro");
        } else{
            System.out.println("Tu muerte se acerca");
        }
    }

}
