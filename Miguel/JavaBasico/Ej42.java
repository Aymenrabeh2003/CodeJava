import java.util.Scanner;

public class Ej42 {
    public static void main(String[] args) {
        //reread
        Scanner scanner = new Scanner(System.in);
        int n;
        int n1;
        System.out.println("Escribe el numero 1 y el numero 2 y te los multiplicare con sumas succesivas");
        n = scanner.nextInt();
        n1 = scanner.nextInt();
        int mult = 0;
        for (int i = 0; i < n1; i++){
            mult = mult + n;
        }
        System.out.println(mult);
    }
}
