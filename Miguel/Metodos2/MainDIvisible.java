import java.util.Scanner;

public class MainDIvisible {
    public static void main(String[] args) {
        int dividendo;
        int divisor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ESCRIBE DOS NUMEROS Y TE DIRE SI ES O NO DIVISIBLE");
        dividendo = scanner.nextInt();
        divisor = scanner.nextInt();

        if (MainDIvisible.esDivisible(dividendo,divisor)){
            System.out.println("Es divisible");
        } else {
            System.out.println("No es divisible");
        }

    }
    public static boolean esDivisible(int n, int m){
        return n % m == 0;
    }
}