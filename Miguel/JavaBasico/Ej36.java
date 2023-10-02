import java.util.Scanner;

public class Ej36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];
        int valorMax = 0;
        System.out.println("Escribe 10 numeros:");
        for (int i = 0; i <= 9; i++){
            numeros[i] = scanner.nextInt();
        }
        for (int numero:numeros) {
            if (numero > valorMax){
                valorMax = numero;
            }
        }
        System.out.println("El valor maximo es " + valorMax);
    }
}
