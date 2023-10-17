import java.util.Scanner;

public class Positivos {
    int numUs = 10;

    public Positivos(){

    }

    public void write10numbers(){
        int numero;
        int cuantos = 0;
        while(numUs>0){
            Scanner scanner = new Scanner(System.in);
            numero = scanner.nextInt();
            if (numero > 0){
                cuantos++;
            }
            numUs--;
        }
        System.out.println("Fin del programa, en total hay "+cuantos+ " " +
                "numeros positivos");
    }
}
