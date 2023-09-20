public class Ej4 {
    public static void main(String[] args) {
        //calculos con la clase Math
        //double raiz = Math.sqrt(2);
        //System.out.println(raiz);

       /* float num = 5.85F;
        int resultado = Math.round(num);
        System.out.println(resultado);*/

        double base = 5;
        double exponente = 3;
        int resultado = (int)Math.pow(base, exponente);
        System.out.println("Es resultado de "+base+" elevado " +
                "a "+exponente+" es "+resultado);
    }
}
