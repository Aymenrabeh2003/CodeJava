import java.util.Scanner;

public class Ej29 {
    public static void main(String[] args) {
        //reread
        int numero;
        for (numero = 3; numero <= 100; numero++){
            boolean esPrimo = true;
                for(int i = 2; i <= Math.sqrt(numero); i++){
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo){
                    System.out.println(numero);
                }
        }
    }
}
