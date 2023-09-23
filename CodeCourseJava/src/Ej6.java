import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        //Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre_usuario = scanner.nextLine();

        System.out.println("Introduce edad:");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre_usuario+
                ". El año que viene tendrás "+(edad+1)+
                " años");
    }
}
