package ch7;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        drawShape(circle);
        drawShape(rectangle);
    }

    static void drawShape(Shape shape) {
        shape.draow();
    }
}
