import javax.swing.*;

public class Ej24 {
    public static void main(String[] args) {
        int nota = 0;
        int sumatorio = 0;
        int numNotas=0;
        int media = 0;
        int numdeDiez = 0;
        while (nota >= 0) {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Di una nota"));
            if (nota > 0) {
                sumatorio = sumatorio + nota;
                numNotas++;
            }
            if (nota == 10){
                numdeDiez++;
            }
            media = sumatorio / numNotas;
        }
        System.out.println("Ha habido "+numdeDiez+" dieces en total");
        System.out.println("La media es "+media);
    }
}
