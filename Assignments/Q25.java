import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = input.nextInt();
        input.nextLine();

        String topName = "";
        int topScore = -1;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter name: ");
            String name = input.nextLine();
            System.out.println("Enter score: ");
            int score = input.nextInt();
            input.nextLine();

            if (score > topScore) {
                topScore = score;
                topName = name;
            }
        }

        System.out.println("Top student: " + topName + " with score " + topScore);
    }
}

