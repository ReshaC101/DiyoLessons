package day6.basic;

public class TypCastingDemo {
    public static void main(String[] args) {
        byte b1 = 127;
        //implicit type conversion
        //by java compiler
        int i1 = b1;
        System.out.println("b1===" + b1);
        System.out.println("i1===" + i1);


        int i2 = 127;
        //explicit type conversion
        //by java programmer
        byte b2 = (byte)i2;
        System.out.println("b2===" + b2);
        System.out.println("i2===" + i2);

        int i3 = 200;
        byte b3 = (byte)i3;
        System.out.println("i3===" + i3);

        int i4 = 100;
        double d1 = i4;
        System.out.println("i4===" + i4);
        System.out.println("d1===" + d1);


    }
}
