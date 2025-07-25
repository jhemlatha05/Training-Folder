package practice_day2tasks;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add Int: " + c.add(5, 7));
        System.out.println("Add Double: " + c.add(4.5, 3.2));
        System.out.println("Add String: " + c.add("Hello ", "World"));
    }
}


