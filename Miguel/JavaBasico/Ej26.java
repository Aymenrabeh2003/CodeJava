import javax.swing.*;

public class Ej26 {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Escribe el número y te diré su tabla de multiplicar:");
        int numero = Integer.parseInt(numeroStr);

            if(numero > 0 && numero < 11){
                System.out.println("Tabla de multiplicar del " + numero + ":");
                for (int i = 0; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.println(numero + " x " + i + " = " + resultado);
                }
            } else{
            System.out.println("Número fuera del rango (debe ser del 1 al 10).");
            }
        }
}
