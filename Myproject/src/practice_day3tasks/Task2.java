package practice_day3tasks;

abstract class Shapee {
    abstract double area();

    void displayShapeeType() {
        System.out.println("I am a shape");
    }
}

class Circle1 extends Shapee {
    double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 extends Shapee {
    double length, width;

    Rectangle1(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Shapee s = new Circle1(3);
        s.displayShapeeType();                // Non-abstract method
        System.out.println("Area: " + s.area()); // Abstract method implementation
    }
}


