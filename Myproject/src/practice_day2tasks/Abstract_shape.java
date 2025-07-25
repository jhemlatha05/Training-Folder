package practice_day2tasks;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius = 5;

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 4, width = 6;

    double area() {
        return length * width;
    }
}

class Abstract_shape {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
    }
}

