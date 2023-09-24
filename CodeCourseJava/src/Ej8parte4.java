import javax.swing.*;

public class Ej8parte4 {
    public static void main(String[] args) {
        int arroba = 1;
        String mail = JOptionPane.showInputDialog("Introduce un mail");

        for(int i = 0; i<mail.length(); i++){
            if (mail.charAt(i) == '@') {
                arroba++;
                break;
            }
        }

        if (arroba == 1){
            System.out.println("Es correcto");
        } else{
            System.out.println("No es correcto");
        }
    }
}
