package practice_day5tasks;

public class CountdownTimer extends Thread {
    public void run() {
        for(int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);
            try { Thread.sleep(1000); } catch(Exception e) {}
        }
        System.out.println("Time’s up!");
    }

    public static void main(String[] args) {
        new CountdownTimer().start();
    }
}


