import java.util.Scanner;

public class Ej45 {
    public static void main(String[] args) {
        int numero_Decimal;
        String resultado = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero decimal y te lo" +
                " pasaré a binario:");
        numero_Decimal = scanner.nextInt();
        while(numero_Decimal > 0){
            if (numero_Decimal % 2 == 0){
                resultado = "0" + resultado;
            } else {
                resultado = "1" + resultado;
            }
            numero_Decimal = numero_Decimal / 2;
        }
        System.out.println(resultado);
    }
}
