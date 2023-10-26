public class Concatenar {
    public static void main(String[] args) {
        System.out.println("Las cadenas resultantes unidas: " + Concatenar.concat("ho","la"));
    }

    public static String concat(String cad1, String cad2){
        return cad1.concat(cad2);
    }
}
