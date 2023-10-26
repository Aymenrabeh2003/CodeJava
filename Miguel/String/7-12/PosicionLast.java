public class PosicionLast {

    public static void main(String[] args) {

        int indice = PosicionLast.last("Hola como estas. hola, que tal?","hola");

        if (indice != -1){
            System.out.println("La ultima instancia de hola se encuentra en el indice "+indice);
        } else{
            System.out.println("No se encuentra");
        }

    }
    public static int last(String cad1, String pal){
        return cad1.lastIndexOf(pal);
    }
}
