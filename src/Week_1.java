import java.util.Scanner;

public class Week_1 {
    public static void exercise1() {
        System.out.println("******************");
        System.out.println("* Le Hoang Duong *");
        System.out.println("******************");
    }

    public static void exercise2() {
        int x = 10;
        int y = 20;
        System.out.println("In: x=" + x + " and y=" + y);
    }

    public static void exercise3() {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter the number of seconds");
        int S = myNum.nextInt();
        int h = S / 3600;
        S = S % 3600;
        int m = S / 60;
        S = S % 60;
        int s = S;
        System.out.printf("Time left until midnight: %d:%d:%d", h, m, s);
    }

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
}