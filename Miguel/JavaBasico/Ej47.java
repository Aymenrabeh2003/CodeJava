import java.util.Scanner;

public class Ej47 {
    public static void main(String[] args) {
        String [] palabras = new String[5];
        char asterisco = '*';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe 5 palabras y te las pondré en un marco:");
        for (int i = 0; i < 5; i++){
            palabras[i] = scanner.next();
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == 0 || i == 5){
                    System.out.print(asterisco);
                }else {
                    System.out.print(asterisco+""+palabras[i]+""+asterisco);
                }
            }
            System.out.println();
        }
    }
}
