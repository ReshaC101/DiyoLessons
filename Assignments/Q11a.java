import java.util.Scanner;

public class Q11a {

    public class SwapWithTemp {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number: ");
            int a = input.nextInt();

            System.out.println("Enter second number: ");
            int b = input.nextInt();

            int temp = a;  // store first number in temp
            a = b;         // assign second number to first
            b = temp;      // assign temp to second

            System.out.println("After swapping (using temp):");
            System.out.println("First number = " + a);
            System.out.println("Second number = " + b);
        }
    }

}
