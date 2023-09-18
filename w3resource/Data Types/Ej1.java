import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el valor de temperatura de Fº" +
                "para pasarlo a Cº:");
        double f = scanner.nextInt();
        double c;
        c = (f - 32) / 1.8;
        System.out.println("El resultado de Cº es: "+ c);
    }
}
