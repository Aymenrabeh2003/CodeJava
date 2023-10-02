import java.util.Scanner;

public class Ej32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe 10 numeros y te los imprimiré al reves:");
        int [] numeros = new int[10];
        for (int i = 0; i < 10; i++){
            numeros[i] = scanner.nextInt();
        }

        for (int i = 9; i >= 0; i--){
            System.out.println("Numero: "+numeros[i]);
        }
    }
}
