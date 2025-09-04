import java.util.Scanner;

public class Q11b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = input.nextInt();

        System.out.println("Enter second number: ");
        int b = input.nextInt();

        a = a + b;  // sum of both
        b = a - b;  // original a
        a = a - b;  // original b

        System.out.println("After swapping (without temp):");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }

}
