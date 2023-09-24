import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        double precio;
        double descuento;
        double precioFinal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el precio y te dire el descuento");
        precio = scanner.nextDouble();

        if (precio < 6){
            descuento = 0;
            precioFinal = precio - ((descuento/100)*precio);
            System.out.println("El precio final: "+ precioFinal + "euros con el " +
                    ""+descuento+"% de descuento");
        }
        if(precio >= 6 && precio < 60 ){
            descuento = 5;
            precioFinal = precio - ((descuento/100)*precio);
            System.out.println("El precio final: "+ precioFinal + " euros con el " +
                    ""+descuento+"% de descuento");
        }
        if(precio >= 60){
            descuento = 10;
            precioFinal = precio - ((descuento/100)*precio);
            System.out.println("El precio final: "+ precioFinal + "euros con el " +
                    ""+descuento+"% de descuento");
        }


    }
}
