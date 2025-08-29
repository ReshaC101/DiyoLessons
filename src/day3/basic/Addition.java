package day3.basic;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        int sum = a + b;

        System.out.println("The sum of the numbers you've enetered: " + sum);
    }
}
