import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();

        if (a == b) {
            System.out.println("Both numbers are equal.");
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is less than " + b);
        }
    }
}

