import java.util.Scanner;

public class MainDni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDNI;
        System.out.println("Escribe el numero dni de 8 aracteres y te dire" +
                "su letra");
        numeroDNI = scanner.nextInt();
        char letra = MainDni.returnLetter(numeroDNI);
        System.out.println("La letra del DNI es: "+letra);
    }
    public static char returnLetter(int numeroDNI){
        char letra;
        int residuo = numeroDNI % 23;
        if (numeroDNI > 9999999 && numeroDNI <= 999999999 ){
            switch (residuo){
                case 0:
                    letra = 'T';
                    return letra;
                case 1:
                    letra = 'R';
                    return letra;
                case 2:
                    letra = 'W';
                    return letra;
                case 3:
                    letra = 'A';
                    return letra;
                case 4:
                    letra = 'G';
                    return letra;
                case 5:
                    letra = 'M';
                    return letra;
                case 6:
                    letra = 'Y';
                    return letra;
                case 7:
                    letra = 'F';
                    return letra;
                case 8:
                    letra = 'P';
                    return letra;
                case 9:
                    letra = 'D';
                    return letra;
                case 10:
                    letra = 'X';
                    return letra;
                case 11:
                    letra = 'B';
                    return letra;
                case 12:
                    letra = 'N';
                    return letra;
                case 13:
                    letra = 'J';
                    return letra;
                case 14:
                    letra = 'Z';
                    return letra;
                case 15:
                    letra = 'S';
                    return letra;
                case 16:
                    letra = 'Q';
                    return letra;
                case 17:
                    letra = 'V';
                    return letra;
                case 18:
                    letra = 'H';
                    return letra;
                case 19:
                    letra = 'L';
                    return letra;
                case 20:
                    letra = 'C';
                    return letra;
                case 21:
                    letra = 'K';
                    return letra;
                case 22:
                    letra = 'E';
                    return letra;
            }
        }
        return '-';
    }
}
