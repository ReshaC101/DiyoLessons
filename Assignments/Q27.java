import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);
        System.out.println("Product of digits = " + product);
    }
}
