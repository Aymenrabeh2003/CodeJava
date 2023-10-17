public class MayorDeTres {
    int[] numeros = new int[3];

    public MayorDeTres(int[] numeros){
        for (int i = 0; i < numeros.length; i++){
            this.numeros = numeros;
        }
    }

    public void elMayor(){
        int mayor = 0;
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("El mayor es "+ mayor);
    }
}
