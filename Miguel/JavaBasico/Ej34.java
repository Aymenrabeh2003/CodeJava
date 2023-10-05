import java.util.Scanner;

public class Ej34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDNI;
        String dni;
        char letraS = 0;
        /*
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
        */

        System.out.println("Escribe el numero dni de 8 caracteres y te dire" +
                " tu NIE, recuerda (debe ser menor que 30000000 y mayor que 999999):");
        numeroDNI = scanner.nextInt();
        /*
        if (letraS == 'X'){
            numeroDNI += 0;
        } else if(letraS == 'Y'){
            numeroDNI -= 10000000;
        } else if (letraS == 'Z') {
            numeroDNI -= 20000000;
        }
*/
        char letra;
        int residuo = numeroDNI % 23;
        if (numeroDNI > 999999 && numeroDNI <= 30000000 ){
            switch (residuo){
                case 0:
                    letra = 'T';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 1:
                    letra = 'R';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 2:
                    letra = 'W';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 3:
                    letra = 'A';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 4:
                    letra = 'G';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 5:
                    letra = 'M';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 6:
                    letra = 'Y';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 7:
                    letra = 'F';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 8:
                    letra = 'P';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 9:
                    letra = 'D';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 10:
                    letra = 'X';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 11:
                    letra = 'B';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 12:
                    letra = 'N';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 13:
                    letra = 'J';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 14:
                    letra = 'Z';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 15:
                    letra = 'S';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 16:
                    letra = 'Q';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 17:
                    letra = 'V';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 18:
                    letra = 'H';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 19:
                    letra = 'L';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 20:
                    letra = 'C';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 21:
                    letra = 'K';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
                case 22:
                    letra = 'E';
                    if (numeroDNI <= 9999999){
                        letraS ='X';
                    } else if(numeroDNI <= 19999999){
                        numeroDNI -= 10000000;
                        letraS ='Y';
                    } else if (numeroDNI <= 29999999) {
                        numeroDNI -= 20000000;
                        letraS ='Z';
                    }
                    dni = letraS+String.valueOf(numeroDNI)+letra;
                    System.out.println(dni);
                    break;
            }
        } else {
            System.out.println("El NIE debe tener 8 numeros");
        }
    }
}
