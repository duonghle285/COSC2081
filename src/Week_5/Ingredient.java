//package Week_5;
//import java.util.Scanner;
//
//public class Ingredient {
//    private String name;
//    private String measurementUnit;
//
//    public Ingredient(String name, String measurementUnit) {
//        this.name = name;
//        this.measurementUnit = measurementUnit;
//    }
//
//    public String getName() {
//        System.out.println("Please input the name of the ingredient: ");
//        Scanner scanner = new Scanner(System.in);
//        name = scanner.nextLine();
//        return name;
//    }
//
//    public String getMeasurementUnit() {
//        System.out.println("Please input the measurement of the ingredient: ");
//        Scanner scanner = new Scanner(System.in);
//        measurementUnit = scanner.nextLine();
//        while (measurementUnit == "spoon" || measurementUnit == "teaspoon" || measurementUnit == "mg" || measurementUnit == "kg") {
//            return measurementUnit;
//            if ()
//        }
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setMeasurementUnit(String measurementUnit) {
//        this.measurementUnit = measurementUnit;
//    }
//
//    public void visualize() {
//        System.out.print(name + " is measured with " + measurementUnit);
//    }
//}
