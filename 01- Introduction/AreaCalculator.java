public class AreaCalculator {
     public static final double INVALID_VALUE = -1.0;
     
     public static double area(double radius) {
         if (radius < 0d) {
             return INVALID_VALUE;
         }
         return (Math.PI * radius * radius);
     }
     
     public static double area(double x, double y) {
         if ((x < 0d) || (y < 0d)) {
             return INVALID_VALUE;
         }
         return (x * y);
     }
}
