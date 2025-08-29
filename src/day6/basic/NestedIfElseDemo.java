package day6.basic;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 7;
        if (a > b) {
            if (a > c) {
                System.out.println("a is the largest one");
            } else {
                System.out.println("c is the largest one");
            }
        } else {
            if (b > c) {
                System.out.println("b is largest one ");
            } else {
                System.out.println(" c is the largest one!");

            }
        System.out.println("Rest of the code");

        }
    }
}

