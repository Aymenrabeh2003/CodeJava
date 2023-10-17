import java.util.Scanner;

public class MainPrimo {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este numero es primo?");
        numero = scanner.nextInt();
        boolean esPrimo = MainPrimo.esPrimo(numero);
        if (esPrimo){
            System.out.println("El numero es primo");
        } else{
            System.out.println("NO es primo");
        }

    }
    public static boolean esPrimo(int numero){
        if(numero == 2){
            return true;
        } else if (numero <= 1) {
            return false;
        } else if (numero % 2 == 0){
            return false;
        }else{
            for(int i = 3; i < (numero/2); i += 2){
                if (numero % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
