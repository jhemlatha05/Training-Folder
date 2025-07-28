package practice_day5tasks;

public class CountThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Counting: " + i);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountThread t = new CountThread();
        t.start();
        t.join();  // main thread waits here
        System.out.println("Main thread done.");
    }
}

