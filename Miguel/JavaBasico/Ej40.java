public class Ej40 {
    public static void main(String[] args) {
        //reread
        int n1 = 1;
        int n2 = 1;
        System.out.println("1\n1");
        for (int i = 3; i <= 40; i++){
            int tmp;
            tmp = n1 + n2;
            n1 = n2;
            n2 = tmp;
            System.out.println(tmp);
        }
    }
}
