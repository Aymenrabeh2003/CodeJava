public class MainPotencia {
    public static void main(String[] args) {
        System.out.println(potencia(2,8));
    }

    public static double potencia(double x, int n){
        if (n==1){
            return x;
        }
        return x*potencia(x,n-1);
    }
}
