import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("The largest number is: " + largest);
    }
}
