public class Mayor {
    private static int edad;
    public Mayor(int edad){
        Mayor.edad = edad;
    }

    public void showAge(){
        System.out.println(edad);
    }

    public void validAge(){
        if (edad < 18){
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }
}
