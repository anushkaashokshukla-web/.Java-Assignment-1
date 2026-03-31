abstract class Shape {

    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculate_area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class RectangleShape extends Shape {
    int length, breadth;

    RectangleShape(int l, int b) {
        length = l;
        breadth = b;
    }

    void calculate_area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        // Shape s = new Shape(); ❌ ERROR (cannot instantiate abstract class)

        Shape c = new Circle(5);
        c.display_info();
        c.calculate_area();

        System.out.println();

        Shape r = new RectangleShape(4, 6);
        r.display_info();
        r.calculate_area();
    }
}