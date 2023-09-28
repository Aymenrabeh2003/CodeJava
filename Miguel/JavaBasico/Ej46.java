import java.util.Scanner;

public class Ej46 {
    public static void main(String[] args) {
        int numero=0;
        int intentos = 0;
        int aleatorio = (int)(Math.random()*100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        while (numero != aleatorio){
            numero = scanner.nextInt();
            if (numero != aleatorio){
                System.out.println("Numero incorrecto");
                if (numero > aleatorio){
                    System.out.println("Tu numero es mayor");
                } else{
                    System.out.println("Tu numero es menor");
                }
            }
            intentos++;
        }
        System.out.println("Numero correcto: Numero intentos: " +intentos);
        System.out.println(aleatorio);
    }
}
