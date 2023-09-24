import javax.swing.*;
public class Ej8 {
    public static void main(String[] args) {
        //bucles
        String clave = "Aymen";
        String pass="";

        while(!clave.equals(pass)){
           pass = JOptionPane.showInputDialog("Escribe la clave");
           if (!clave.equals(pass)){
               System.out.println("Contraseña incorrecta");
           }
        }
        System.out.println("Contraseña correcta");
    }
}
