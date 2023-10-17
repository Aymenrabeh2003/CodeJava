import java.util.Scanner;

public class Descendente {
    int numero;
    int numero2;

    public Descendente(){

    }

    public void order(){
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        numero2 = scanner.nextInt();

            if (numero > numero2) {
                System.out.println(numero + " " + numero2);
            } else {
                System.out.println(numero2 + " " + numero);

        }
        System.out.println(numero + " " + numero2 + " de forma descendente");
    }
}
