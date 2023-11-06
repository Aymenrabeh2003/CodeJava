import java.util.Scanner;

public class Encriptar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Texto a encriptar: ");
        String texto = scanner.nextLine();
        System.out.println("n: ");
        int n = scanner.nextInt();

        String textoEncriptado = encriptarCesar(texto, n);
        System.out.println("Texto encriptado: " + textoEncriptado);
    }
    public static String encriptarCesar(String texto, int n) {
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
                char encriptado = (char) (inicio + (caracter - inicio + n) % 26);
                resultado += encriptado;
            } else if (Character.isDigit(caracter)) {
                char encriptado = (char) ('0' + (caracter - '0' + n) % 10);
                resultado += encriptado;
            } else {
                resultado += caracter;
            }
        }

        return resultado;
    }


}
