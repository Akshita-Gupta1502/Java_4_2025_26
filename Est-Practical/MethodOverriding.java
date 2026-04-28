
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    void area() {
        double result = (22/7) * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        s.area();

        s = new Rectangle(5, 4);
        s.area();
    }
}