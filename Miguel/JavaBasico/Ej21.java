import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        int anyo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un año y te dire si es bisiesto o no:");
        anyo = scanner.nextInt();

        if (anyo % 4 == 0){
            if (anyo % 100 == 0 && (anyo % 400 != 0)){
                System.out.println("El año "+anyo+" no es bisiesto.");
            }
            System.out.println("El año "+anyo+" es bisiesto.");
        } else {
            System.out.println("El año "+anyo+" no es bisiesto.");
        }
    }
}
