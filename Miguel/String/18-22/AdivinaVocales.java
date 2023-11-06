import java.util.Scanner;

public class AdivinaVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String cad;
        String cad2;
        System.out.println("Escribe una cadena y el siguiente jugador debe adivinar las vocales exactas: ");
        cad = scanner.nextLine();
        String cadenaOculta = AdivinaVocales.ocultarVocales(cad);
        System.out.println("Descifra la cadena: "+ cadenaOculta);
        cad2 = scanner1.nextLine();
        if (cad.equals(cad2)){
            System.out.println("Lo has hecho perfecto");
        } else {
            System.out.println("Has hecho un fallo, aqui tienes el resultado correcto: "
            + cad);
        }
    }
/*
    private static String ocultarVocales(String cad) {
        String nuevo = "";
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < vocales.length(); i++){
            char caracter = cad.charAt(i);
            if (vocales.indexOf(caracter) != -1){
                nuevo += '.';
            } else {
                nuevo += caracter;
            }
        }
        return nuevo;
    }

 */
    private static String ocultarVocales(String cad) {

        cad = cad.replace('a', '.');
        cad = cad.replace('e', '.');
        cad = cad.replace('i', '.');
        cad = cad.replace('o', '.');
        cad = cad.replace('u', '.');

        cad = cad.replace('A', '.');
        cad = cad.replace('E', '.');
        cad = cad.replace('I', '.');
        cad = cad.replace('O', '.');
        cad = cad.replace('U', '.');

        return cad;
    }


    /*
    public static String ocultarVocales(String cad){
        char[] vocales = new char[]{'a','e','i','o','u'};

        for (int i = 0; i < cad.length(); i++){
            char charact = cad.charAt(i);
            for (int j = 0; j < vocales.length; j++){
                if (charact == vocales[j]) {
                    charact = '.';
                    break;
                }
            }
        }
        return cad;
    }
    */
    /*
    public static void prueba(){
        String original = "casa de papel";
        String nuevo = "";
        String vocales = "aeiouAEIOU";
        for (int i=0;i<original.length();i++){
            if (vocales.contains(""+original.charAt(i))){
                nuevo = nuevo +".";
            }else{
                nuevo = nuevo + original.charAt(i);
            }

        }
    }

     */
}

