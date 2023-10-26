public class Contiene {
    public static void main(String[] args) {
        if (Contiene.contain("holaaa","holaa")){
            System.out.println("Si que la contiene");
        } else{
            System.out.println("No la contiene");
        }
    }

    public static boolean contain(String cad1, String cad2){

        return cad1.contains(cad2);
    }
}
