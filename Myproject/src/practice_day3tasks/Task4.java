package practice_day3tasks;

//File name: Main.java

interface Remotecontrol {
 // Abstract method (must be implemented by the class)
 void turnOn();

 // Default method (can be used directly by the class)
 default void batteryStatus() {
     System.out.println("Battery is full");
 }

 // Static method (called using interface name only)
 static void info() {
     System.out.println("RemoteControl Interface v1.0");
 }
}

//Class implementing the interface
class TV1 implements Remotecontrol {
 public void turnOn() {
     System.out.println("TV is turned ON");
 }
}

//Main class
public class Task4 {
 public static void main(String[] args) {
     // Create object of TV
     TV1 myTv = new TV1();

     // Call implemented abstract method
     myTv.turnOn();

     // Call default method
     myTv.batteryStatus();

     // Call static method using interface name
     Remotecontrol.info();
 }
}



