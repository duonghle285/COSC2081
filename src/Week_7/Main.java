package Week_7;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(12, 15);
        System.out.println("The area of the cylinder: " + cylinder1.getArea(cylinder1.getRadius(), cylinder1.getHeight()));
        System.out.println(cylinder1);
    }
}
