package Week_7;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "The circle info: Circle[radius=" + radius + ", area=" + getArea(radius) + "]";
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(12);
        System.out.println(circle1);
    }
}


