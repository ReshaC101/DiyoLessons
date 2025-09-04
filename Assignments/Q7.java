import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int r = input.nextInt();

        System.out.println("Enter length/height: ");
        int h = input.nextInt();

        int volume = (22 * r * r * h) / 7;  // π approx 22/7
        System.out.println("The volume of the cylinder is: " + volume);
    }
}

