import javax.swing.*;

public class Ej6parte3 {
    public static void main(String[] args) {
        double x = 1000.0;
        System.out.printf("%1.3f",x/3);

        String num1 = JOptionPane.showInputDialog("Introduce numero");
        double num2 = Double.parseDouble(num1);
        System.out.println("La raiz de " + num2 +" es: ");
        System.out.printf("%1.2f", Math.sqrt(num2));
    }
}
