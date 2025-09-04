import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        int pounds = input.nextInt();

        int kg = pounds * 454 / 1000;  // 1 pound = 0.454 kg
        System.out.println("Weight in kilograms = " + kg);
    }
}

