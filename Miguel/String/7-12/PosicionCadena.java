public class PosicionCadena {
    public static void main(String[] args) {
        String frase = "La programación es divertida.";
        int indice = PosicionCadena.index(frase, "divertida");

        if (indice != -1){
            System.out.println("Empieza por el "+ indice);
        } else {
            System.out.println("No se encuentra");
        }
    }
    public static int index(String cad1, String cad2){
        return cad1.indexOf(cad2);
    }
}
