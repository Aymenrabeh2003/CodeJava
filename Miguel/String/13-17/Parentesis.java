import java.util.Scanner;

public class Parentesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad;
        System.out.println("Escribe un texto con parentesis" +
                " y te dire si estan bien puestos o no: ");
        cad = scanner.nextLine();
        if (Parentesis.parentesisCorrecto(cad)){
            System.out.println("La cadena es correcta");
        } else {
            System.out.println("La cadena no esta correcta");
        }
    }
    public static boolean parentesisCorrecto(String cad){
        int count = 0;

        for (int i = 0; i < cad.length(); i++){
            if (cad.charAt(i) == '('){
                count++;
            } else if (cad.charAt(i) == ')') {
                count--;
            }
        }
        return count == 0;
    }
}
