import javax.swing.*;

public class Ej8parte3 {
    public static void main(String[] args) {
        String genero= "";
        do {
            genero = JOptionPane.showInputDialog("Introduce " +
                    "el genero (M/H)");
        }while(!genero.equalsIgnoreCase("H") &&
        !genero.equalsIgnoreCase("M"));

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura: "));
        int pesoideal = 0;

        if (genero.equalsIgnoreCase("H")){

            pesoideal =  altura - 110;

        } else if(genero.equalsIgnoreCase("M")){

            pesoideal = altura - 120;

        }

        System.out.println("El genero " +genero+" que tiene de altura "
        +altura+" su peso ideal es "+pesoideal+" kg");
    }
}
