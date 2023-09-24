import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        //reread this exercise
        int numero;
        boolean esPrimo = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este numero es primo?");
        numero = scanner.nextInt();

        if(numero == 2){
            System.out.println("El numero es primo");
        } else if (numero <= 1) {
            System.out.println("NO es primo");
        } else if (numero % 2 == 0){
            System.out.println("NO es primo");
        }else{
            for(int i = 3; i < (numero/2); i += 2){
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
                
            }
            if (esPrimo){
                System.out.println("El numero es primo");
            } else{
                System.out.println("NO es primo");
            }
        }
        

    }
}
