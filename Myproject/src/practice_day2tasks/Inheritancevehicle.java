package practice_day2tasks;

class Vehicle {
    String brand = "Generic";
    int speed = 60;

    void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + "km/h");
    }
}

class Car extends Vehicle {
    void showDetails() {
        System.out.println("Car - Brand: " + brand + ", Speed: " + speed + "km/h");
    }
}

class Bike extends Vehicle {
    void showDetails() {
        System.out.println("Bike - Brand: " + brand + ", Speed: " + speed + "km/h");
    }
}

class Inheritancevehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.showDetails();
        bike.showDetails();
    }
}



