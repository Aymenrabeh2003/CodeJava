import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        int numUs = 10;
        int numero;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Escribe 10 numeros:");
        while(numUs>1){

            numero = scanner.nextInt();
            if (numero > 0){
                System.out.println("-- "+numero);
            }
            numUs--;
        }
        System.out.println("Fin del programa");
    }
}
