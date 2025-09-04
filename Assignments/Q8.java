import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        int F = input.nextInt();
        int C = (F - 32) * 5 / 9;
        System.out.println("Celsius = " + C);

        System.out.println("Enter temperature in Celsius: ");
        C = input.nextInt();
        F = (C * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + F);
    }
}
