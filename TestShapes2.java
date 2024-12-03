abstract class Shape {
    abstract double calculateArea(); 
    abstract double calculatePerimeter();
}
class Circle extends Shape { 
        private double radius;
    public Circle(double radius) { 
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    double calculatePerimeter() { 
        return 2 * Math.PI * radius;
    }
}
class Triangle extends Shape { 
    private double side1, side2, side3;
    public Triangle(double side1, double side2, double side3) { 
        this.side1 = side1;
        this.side2 = side2; 
        this.side3 = side3;
    }
    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    double calculatePerimeter() { 
        return side1 + side2 + side3;
    }
}
public class TestShapes2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Circle:"); 
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("\nTriangle:"); 
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}