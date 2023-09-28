import java.util.Scanner;

public class Ej47 {
    public static void main(String[] args) {
        String [] palabras = new String[5];
        char asterisco = '*';
        Scanner scanner = new Scanner(System.in);
        int palabraMayor=0;
        int espacio = 0;
        System.out.println("Escribe 5 palabras y te las pondré en un marco:");
        for (int i = 0; i < 5; i++){
            palabras[i] = scanner.next();
        }
        for (int i = 0; i < 5; i++){
            if (palabras[i].length() > palabraMayor){
                palabraMayor = palabras[i].length();
            }
        }
        for (int i = 0; i <= palabraMayor+1; i++){
            System.out.print(asterisco+"");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("");
            }
            if (palabraMayor >= palabras[i].length()){
                espacio = palabraMayor - palabras[i].length();
                System.out.print(asterisco+""+palabras[i]+"");
                for (int f = 0; f < espacio; f++){
                    System.out.print(" ");
                }
                System.out.print(asterisco);
            }
            System.out.println();
        }
        for (int i = 0; i <= palabraMayor+1; i++){
            System.out.print(asterisco);
        }

    }
}
