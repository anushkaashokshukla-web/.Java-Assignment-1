class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 4, b = 6;
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class MainShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}