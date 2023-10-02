import java.util.Scanner;

public class Ej39 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Escribe el numero y te dire los numeros divisores:");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                System.out.println(i+" Es divisor de "+numero);
            }
        }
    }
}
