import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el valor de inches" +
                " para pasarlo a metros:");
        double i = scanner.nextInt();
        double m;
        m = i * 0.0254;
        System.out.println("El resultado de los metros son: "+ m);

    }
}
