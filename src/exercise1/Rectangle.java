//package exercise1;
//
//public class Rectangle {
//    private double width;
//    private double height;
//
//    public Rectangle(double width_val, double height_val) {
//        this.width = width_val;
//        if (width < 0) {
//            System.out.println("Error in width value, will change to 1");
//            width = 1;
//        }
//        this.height = height_val;
//        if (height < 0) {
//            System.out.println("Error in height value, will change to 1");
//            height = 1;
//        }
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void visualise() {
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//    }
//}
