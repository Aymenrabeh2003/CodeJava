import java.util.Scanner;

public class CifradoCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una opción: \n1. Encriptar\n2. Desencriptar");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce texto:");
        String texto = scanner.nextLine();

        System.out.println("Introduce n:");
        int n = scanner.nextInt();

        if (opcion == 1) {
            String textoEncriptado = Encriptar.encriptarCesar(texto, n);
            System.out.println("Texto encriptado: " + textoEncriptado);
        } else if (opcion == 2) {
            String textoDesencriptado = Desencriptar.desencriptarCesar(texto, n);
            System.out.println("Texto desencriptado: " + textoDesencriptado);
        } else {
            System.out.println("Error 404");
        }

    }
}
