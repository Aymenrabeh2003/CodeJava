public class Ej5 {
    public static void main(String[] args) {
        //Strings
        String nombre = "Juan";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene "+ nombre.length() +" letras.");
        System.out.println("La primera letra de "+nombre+ " es "+ nombre.charAt(0));
        //para sacar la ultima letra, en caso de que sea largo
        int ultima_letra;
        ultima_letra = nombre.length();
        System.out.println("Y la ultima letra es la "+nombre.charAt(ultima_letra-1));
    }
}
