public class MainPrimos {
    public static void main(String[] args) {
        System.out.println("Los numeros primos: ");
        for (int i = 3; i < 100; i++){
            if (MainPrimo.esPrimo(i)){
                System.out.print(i +" - ");
            }
        }

    }
}
