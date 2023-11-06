import java.util.Scanner;

public class Desencriptar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Texto a desencriptar: ");
        String textoEncriptado = scanner.nextLine();
        System.out.println("n: ");
        int n = scanner.nextInt();

        String textoDesencriptado = desencriptarCesar(textoEncriptado, n);
        System.out.println("Texto desencriptado: " + textoDesencriptado);
    }

    public static String desencriptarCesar(String texto, int n) {
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isLetter(caracter)) {
                char inicio = 0;
                if (Character.isLowerCase(caracter)) {
                    inicio = 'a';
                } else if (Character.isUpperCase(caracter)) {
                    inicio = 'A';
                }
                char desencriptado = (char) (inicio + (caracter - inicio - n + 26) % 26);
                resultado += desencriptado;
            } else if (Character.isDigit(caracter)) {
                char desencriptado = (char) ('0' + (caracter - '0' - n + 10) % 10);
                resultado += desencriptado;
            } else {
                resultado += caracter;
            }
        }

        return resultado;
    }
}
