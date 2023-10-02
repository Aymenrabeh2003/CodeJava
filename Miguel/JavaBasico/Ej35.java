import java.util.Scanner;

public class Ej35 {
    public static void main(String[] args) {
        int n;
        double valor=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres añadir?");
        n = scanner.nextInt();
        System.out.println("Escribe "+n+" numeros:");
        int [] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        for (int num : numeros){
            valor += num;
        }
        System.out.println("La suma es "+valor+" la media es "+(valor/n));
    }
}
