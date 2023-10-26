public class SubcadenasSubstring {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 9;
        String cad1 = "Holita";
        String subcad = SubcadenasSubstring.subcadena(cad1,num1,num2);
        System.out.println("La subcadena es "+subcad);
    }
    public static String subcadena(String cad1, int ind1, int ind2){
        if (ind1 < 0 || ind2 > cad1.length()|| ind1 >= ind2) {
            System.out.println("Error");
            return null;
        }
        return cad1.substring(ind1,ind2);
    }
}
