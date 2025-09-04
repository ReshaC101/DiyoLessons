import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principal: ");
        int P = input.nextInt();

        System.out.println("Enter Time: ");
        int T = input.nextInt();

        System.out.println("Enter Rate: ");
        int R = input.nextInt();

        int SI = (P * T * R) / 100;

        System.out.println("The Simple Interest is: " + SI);
    }
}
