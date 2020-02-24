package ch1;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        super.area = 3.14*(radius*radius);
        return area;
    }
}
