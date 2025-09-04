import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum of these two numbers:"+ sum);
        System.out.println("Sum of " + number1 +" and "+ number2 +" is:"+ sum);
    }
}


