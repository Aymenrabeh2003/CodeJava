public class Comparar {
    public static void main(String[] args) {
        System.out.println(Comparar.comparar("hola","holaa"));
    }
    public static String comparar(String pal1, String pal2){
        int num = pal1.compareTo(pal2);
        if (num > 0){
            return "La primera palabra es mayor que la segunda";
        } else if (num < 0) {
            return "La segunda palabra es mayor que la primera";
        }
        return "Son iguales";
    }
}