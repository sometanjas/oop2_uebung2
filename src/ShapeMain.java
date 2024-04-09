import java.util.ArrayList;

public class ShapeMain {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle(5.0, 5.0));
        shapes.add(new Circle(5));

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}