import java.util.Scanner;

public class Ej43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividendo;
        int divisor;
        int count = 0;
        System.out.println("Escribe el dividendo y el divisor");
        dividendo = scanner.nextInt();
        divisor = scanner.nextInt();

        for (int i = dividendo; dividendo >= divisor; dividendo = dividendo - divisor){
            count++;
        }
        System.out.println("Se han realizado "+count+" restas succesivas," +
                " el residuo es: "+dividendo);
    }
}
