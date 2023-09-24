import java.util.*;
import javax.swing.*;
public class Ej7parte2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        //para hacer saltos de linea usar \n
        System.out.println("Elige una opcion: \n1:" +
                " Cuandrado \n2: Rescantgulo \n3: " +
                "Triangulo \n4: Circulo");
        int figura = scanner.nextInt();
        //hay veces que en el switch no añadimos el break hasta el final
        // ya que necesita este seguir ejecutando cases

        switch (figura){

            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce num del lado"));
                System.out.println("Area: "+ Math.pow(lado,2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce num del ancho"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce num de altura"));
                System.out.println("Area: "+ base*altura);
                break;
            case 3:
                int baset = Integer.parseInt(JOptionPane.showInputDialog("Introduce num de la base del T"));
                int alturat = Integer.parseInt(JOptionPane.showInputDialog("Introduce num de la altura del T"));
                System.out.println("Area: "+ (baset*alturat)/2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce num del radio del circulo"));
                System.out.println("Area: "+ Math.PI*Math.pow(radio,2));
                break;
            default:
                System.out.println("Numero incorrecto");
        }
    }
}
