// Base class
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

// Circle class
class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length = 4, breadth = 6;

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}