import javax.swing.*;

public class Ej8parte5 {
    public static void main(String[] args) {
        //factorial con el for

        int resultado = 1;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));

        for (int i = numero; i > 0; i--){
            resultado = resultado * i;
        }
        System.out.println("El factorial de "+numero+" es " + resultado);
    }
}
