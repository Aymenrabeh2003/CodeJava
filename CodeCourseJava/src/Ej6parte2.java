import javax.swing.JOptionPane;
public class Ej6parte2 {
    public static void main(String[] args) {
        //uso del OptionPane para la entrada de datos
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad = JOptionPane.showInputDialog("Introduce la edad");
        int edadInt = Integer.parseInt(edad); //esto nos permite pasar de string a int
        //para pasar de int a string se usa String.valueOf("nombre de la variable int")

        System.out.println("Hola " + nombre_usuario+
                ". El año que viene tendrás "+(edadInt+1)+
                " años");

    }
}
