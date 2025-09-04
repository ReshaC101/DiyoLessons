import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ASCII code (0–128): ");
        int code = input.nextInt();

        System.out.println("The character is: " + (char)code);
    }
}
