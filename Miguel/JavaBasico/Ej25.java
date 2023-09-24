import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        int factorial = 1;
        int numero;
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero y te dire su factorial");
        numero =  scanner.nextInt();

        if (numero < 0){
            System.out.println("Numeros negativos no");
        } else {
            while (n < numero) {
                n++;
                factorial *= n;

            }
            System.out.println("El factorial de "+numero+" es: "+factorial);
        }

    }
}
