public class Ej41 {
    public static void main(String[] args) {
        double n1 = 1;
        double n2 = 1;
        System.out.println("1\n1");
        for (int i = 3; i <= 40; i++){
            double tmp;
            tmp = n1 + n2;
            n1 = n2;
            n2 = tmp;
            System.out.println(n2/n1);
        }
    }
}
