import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("You entered a negative number: " + n);
        }
    }
}


