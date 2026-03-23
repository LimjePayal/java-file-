abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double calculate_area() {
        return Math.PI * r * r;
    }
}

class RectangleShape extends Shape {
    double l, b;

    RectangleShape(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double calculate_area() {
        return l * b;
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new RectangleShape(4, 6);

        s1.display_info();
        System.out.println("Circle Area: " + s1.calculate_area());

        s2.display_info();
        System.out.println("Rectangle Area: " + s2.calculate_area());
    }
}