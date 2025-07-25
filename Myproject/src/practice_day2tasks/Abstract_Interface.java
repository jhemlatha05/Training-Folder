package practice_day2tasks;

//File: Main.java

abstract class Appliance {
 abstract void turnOn();
}

interface Connectable {
 void connect();
}

class SmartTV extends Appliance implements Connectable {
 public void turnOn() {
     System.out.println("SmartTV is turned ON");
 }

 public void connect() {
     System.out.println("SmartTV is connected to WiFi");
 }
}

public class Abstract_Interface {
 public static void main(String[] args) {
     SmartTV tv = new SmartTV();
     tv.turnOn();
     tv.connect();
 }
}



