public class Q10 {
    public static void main(String[] args) {

//a. Equation of motion
        int u = 5;
        int t = 4;
        int a= 2;

        int s = (u *t) + (a * t * t) / 2;
        System.out.println("Displacement (s) = " + s);

// (b) Area of triangle using Heron's formula
        int sideA = 3, sideB = 4, sideC = 5;
        int semiPerimeter = (sideA + sideB + sideC) / 2;

        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) *
                (semiPerimeter - sideB) * (semiPerimeter - sideC));
        System.out.println("Area of triangle = " + area);

// (c) Roots of quadratic equation: ax^2 + bx + c = 0
        int A = 1, B = -3, C = 2;
        int discriminant = (B * B) - (4 * A * C);

        if (discriminant > 0) {
            double root1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            double root2 = (-B - Math.sqrt(discriminant)) / (2 * A);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1 = " + root1 + ", Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = (-B) / (2.0 * A);
            System.out.println("Roots are real and equal.");
            System.out.println("Root = " + root);
        } else {
            System.out.println("Roots are imaginary (no real roots).");
        }
    }
}

