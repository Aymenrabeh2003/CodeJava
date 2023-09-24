import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args) {
        int numero = 1;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Escribe numeros y te dire si son positivos:");
        while(numero != 0){
            numero = scanner.nextInt();
            if (numero > 0){
                System.out.println("-- "+numero);
            }
        }
        System.out.println("Fin del programa");
    }
}
