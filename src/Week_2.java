import java.util.Scanner;

public class Week_2 {
    public static void exercise1() {
        System.out.println("Enter the length:");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == length - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void exercise3() {
        System.out.println("Enter the sides of the triangle:");
        Scanner scanner = new Scanner(System.in);
        double s1, s2, s3;
        s1 = scanner.nextDouble();
        s2 = scanner.nextDouble();
        s3 = scanner.nextDouble();

        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
            System.out.println("Not triangle");
        } else {
            if (s1 == s2 && s2 == s3) {
                System.out.println("Equilateral triangle");
            }
            else if (s1 == s2 || s1 == s3 || s2 == s3) {
                System.out.println("Isosceles triangle");
            }
            else {
                System.out.println("Scalene triangle");
            }
        }
    }

    public static void exercise4() {

    }

    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        exercise4();
    }
}

