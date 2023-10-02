import java.util.Scanner;

public class Ej44 {
    public static void main(String[] args) {
        int valor;
        String numero_Binario;
        int resultado = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero binario y te lo" +
                " pasaré a decimal:");
        numero_Binario = scanner.next();
        for (int i = 0; i < numero_Binario.length(); i++){
            char numero_B = numero_Binario.charAt(i);
            valor = (numero_B - '0') * (int) Math.pow(2, i);
            resultado = resultado + valor;

        }
        System.out.print(resultado);
    }
}
