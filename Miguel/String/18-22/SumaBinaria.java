import java.util.Scanner;

public class SumaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero binario: ");
        String cad1 = scanner.nextLine();

        System.out.println("Ingresa el segundo numero binario: ");
        String cad2 = scanner.nextLine();

        if (cad1.length() != cad2.length()) {
            System.out.println("Los numeros binarios deben tener la misma longitud.");
        } else {
            String resultado = cadenaResult(cad1, cad2);
            System.out.println("Resultado de la suma binaria: " + resultado);
        }
    }


    public static String cadenaResult(String cad1, String cad2) {
        String result = "";
        boolean carry = false;

        for (int i = cad1.length() - 1; i >= 0; i--) {
            char caracter1 = cad1.charAt(i);
            char caracter2 = cad2.charAt(i);

            if (caracter1 == '1' && caracter2 == '1') {
                if (carry) {
                    result = "1" + result;
                } else {
                    result = "0" + result;
                    carry = true;
                }
            } else if (caracter1 == '1' || caracter2 == '1') {
                if (carry) {
                    result = "0" + result;
                } else {
                    result = "1" + result;
                }
            } else {
                if (carry) {
                    result = "1" + result;
                    carry = false;
                } else {
                    result = "0" + result;
                }
            }
        }

        if (carry) {
            result = "1" + result;
        }

        return result;
    }


}
