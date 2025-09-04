import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length: ");
        int length = input.nextInt();

        System.out.println("Enter width: ");
        int width = input.nextInt();

        int area = length * width;

        System.out.println("The area of rectangle is: " + area);
    }
}
