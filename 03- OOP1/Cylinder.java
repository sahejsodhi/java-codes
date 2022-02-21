public class Circle {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
        if (radius < 0) {
            this.radius = 0;
        }
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public double getArea() {
        return (this.radius * this.radius * Math.PI);
    }
}

public class Cylinder extends Circle {
    private double height;
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public double getVolume() {
        double volume = super.getArea() * this.height;
        return volume;
    }
}
