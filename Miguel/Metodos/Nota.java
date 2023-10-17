import javax.swing.*;

public class Nota {
    private int nota = 0;
    private int sumatorio = 0;
    private int numNotas=0;
    private int media = 0;
    private int numdeDiez = 0;

    public void diNota(){
        while (nota >= 0) {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Di una nota(-1 para finalizar)"));
            if (nota > 0 && nota < 11) {
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
