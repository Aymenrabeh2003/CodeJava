public class AcabaCon {
    public static void main(String[] args) {
        if (AcabaCon.ends("holaaa","aa")){
            System.out.println("Si que la contiene");
        } else{
            System.out.println("No la contiene");
        }
    }
    public static boolean ends(String cad1, String cad2){
        return cad1.endsWith(cad2);
    }
}
