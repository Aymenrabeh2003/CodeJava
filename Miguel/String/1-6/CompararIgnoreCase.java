public class CompararIgnoreCase {
    public static void main(String[] args) {
        System.out.println(CompararIgnoreCase.compararIgnoreCase("Hola","olaa"));
    }
    public static String compararIgnoreCase(String pal1, String pal2){
        int num = pal1.compareToIgnoreCase(pal2);
        if (num > 0){
            return "La primera palabra es mayor que la segunda";
        } else if (num < 0) {
            return "La segunda palabra es mayor que la primera";
        }
        return "Son iguales";
    }
}
