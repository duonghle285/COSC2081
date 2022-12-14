import java.io.*;
import java.util.Scanner;

public class Week_8 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        System.out.println("Please input your name, address and age in order: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String address = scanner.nextLine();
        int age = scanner.nextInt();
        try {
            pw = new PrintWriter(new FileWriter("users.txt", true));
            pw.println(name + "\n" + address + "\n" + age);
            pw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
