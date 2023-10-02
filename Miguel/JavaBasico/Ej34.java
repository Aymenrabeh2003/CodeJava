import java.util.Scanner;

public class Ej34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDNI;
        String dni;
        int opcion;
        char letraS = 0;
        System.out.println("Cual es tu situación y te dire la letra del" +
                "inicio de tu NIE:");
        System.out.println("1) Estranjero Temporal \n" +
                "2) Estranjero por motivo laboral \n" +
                "3) Estranjero sin permiso de residencia o trabajo");
        opcion = scanner.nextInt();
        if (opcion == 1){
            letraS ='X';
        } else if(opcion == 2){
            letraS ='Y';
        } else if (opcion == 3) {
            letraS ='Z';
        }
        System.out.println("Escribe el numero dni de 7 caracteres y te dire" +
                " su letra:");
        numeroDNI = scanner.nextInt();
        char letra;
        int residuo = numeroDNI % 23;
        if (numeroDNI > 999999 && numeroDNI <= 99999999 ){
            switch (residuo){
                case 0:
                    letra = 'T';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 1:
                    letra = 'R';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 2:
                    letra = 'W';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 3:
                    letra = 'A';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 4:
                    letra = 'G';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 5:
                    letra = 'M';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 6:
                    letra = 'Y';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 7:
                    letra = 'F';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 8:
                    letra = 'P';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 9:
                    letra = 'D';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 10:
                    letra = 'X';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 11:
                    letra = 'B';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 12:
                    letra = 'N';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 13:
                    letra = 'J';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 14:
                    letra = 'Z';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 15:
                    letra = 'S';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 16:
                    letra = 'Q';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 17:
                    letra = 'V';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 18:
                    letra = 'H';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 19:
                    letra = 'L';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 20:
                    letra = 'C';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 21:
                    letra = 'K';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 22:
                    letra = 'E';
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
            }
        } else {
            System.out.println("El NIE debe tener 7 numeros");
        }
    }
}
