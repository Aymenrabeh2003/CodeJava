import java.util.Scanner;

public class Ej33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDNI;
        String dni;
        System.out.println("Escribe el numero dni de 8 aracteres y te dire" +
                "su letra");
        numeroDNI = scanner.nextInt();
        char letra;
        int residuo = numeroDNI % 23;
        if (numeroDNI > 9999999 && numeroDNI <= 999999999 ){
            switch (residuo){
                case 0:
                    letra = 'T';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 1:
                    letra = 'R';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 2:
                    letra = 'W';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 3:
                    letra = 'A';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 4:
                    letra = 'G';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 5:
                    letra = 'M';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 6:
                    letra = 'Y';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 7:
                    letra = 'F';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 8:
                    letra = 'P';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 9:
                    letra = 'D';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 10:
                    letra = 'X';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 11:
                    letra = 'B';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 12:
                    letra = 'N';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 13:
                    letra = 'J';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 14:
                    letra = 'Z';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 15:
                    letra = 'S';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 16:
                    letra = 'Q';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 17:
                    letra = 'V';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 18:
                    letra = 'H';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 19:
                    letra = 'L';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 20:
                    letra = 'C';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 21:
                    letra = 'K';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 22:
                    letra = 'E';
                    dni = String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
            }
        } else {
            System.out.println("El DNI debe tener 8 numeros");
        }
    }
}
