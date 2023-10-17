import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        System.out.println("Dime tu edad: ");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        Mayor java = new Mayor(age);
        java.validAge();
        java.showAge();

    }
}