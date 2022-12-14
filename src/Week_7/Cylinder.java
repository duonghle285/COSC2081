package Week_7;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(double radius, double height) {
        return (Math.PI * Math.pow(radius, 2) * 2) + (2 * Math.PI * radius) * height;
    }

    public String toString() {
        return "The cylinder info: Cylinder[radius=" + getRadius() + ", height=" + height + "]";
    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(12, 15);
        System.out.println("The area of the cylinder: " + cylinder1.getArea(cylinder1.getRadius(), cylinder1.height));
        System.out.println(cylinder1);
    }
}
