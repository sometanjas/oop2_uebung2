public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return Math.round(this.height * this.width * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Area of the Rectangle with height=" + height +
                ", with width=" + width + " is " + getArea();
    }
}
