import java.util.Scanner;

public class MainTriangulo {
    public static void main(String[] args) {
        int ln1;
        int ln2;
        int ln3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ESCRIBE LOS CM DE 3 LINEAS Y TE DIRE SI SE PUEDE FORMAR O NO UN TRIANGULO:");
        ln1 = scanner.nextInt();
        ln2 = scanner.nextInt();
        ln3 = scanner.nextInt();

        if (MainTriangulo.esTriangulo(ln1,ln2,ln3)){
            System.out.println("Es un triangulo");
        } else{
            System.out.println("No es un triangulo");
        }
    }
    public static boolean esTriangulo(int ln1, int ln2, int ln3){
        return ln1 < ln2 + ln3 || ln2 < ln1 + ln3 || ln3 < ln2 + ln1;
    }
}
