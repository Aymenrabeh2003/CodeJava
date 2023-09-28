import javax.swing.*;

public class Ej9parte2 {
    public static void main(String[] args) {
        //array tipo strings y con el for-each

        String [] paises = new String[8];

        for ( int i = 0; i < 8; i++ ){
            paises[i]= JOptionPane.showInputDialog("Introduce pais " + (i+1));
        }
/*
        paises[0]="España";
        paises[1]="Francia";
        paises[2]="Portugal";
        paises[3]="Argentina";
        paises[4]="Brazil";
        paises[5]="Marruecos";
        paises[6]="Rumania";
        paises[7]="Suecia";
*/
        for (String pais:paises) {
            System.out.println("Pais: "+ pais);
        }
    }
}
