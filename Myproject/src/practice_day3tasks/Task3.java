package practice_day3tasks;

interface RemoteControl {
    void turnOn(); // Abstract method

    default void batteryStatus() {
        System.out.println("Battery is full");
    }
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }
}

public class Task3 {
    public static void main(String[] args) {
        TV myTv = new TV();
        myTv.turnOn();
        myTv.batteryStatus();
    }
}

