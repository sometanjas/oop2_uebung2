import static java.lang.Math.pow;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(Math.PI * pow(this.radius, 2) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Area of the Circle with radius=" + radius  + " is " + getArea();
    }
}
