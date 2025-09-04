import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = input.nextInt();

        System.out.println("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        if (op == '+') {
            System.out.println("Result = " + (a + b));
        } else if (op == '-') {
            System.out.println("Result = " + (a - b));
        } else if (op == '*') {
            System.out.println("Result = " + (a * b));
        } else if (op == '/') {
            if (b != 0) System.out.println("Result = " + (a / b));
            else System.out.println("Cannot divide by zero!");
        } else {
            System.out.println("Invalid operator");
        }
    }
}
