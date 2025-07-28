package practice_day5tasks;

public class RunnableCounter implements Runnable {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Count: " + i);
        }
    }

    public static void main(String[] args) {
        RunnableCounter task = new RunnableCounter();
        Thread thread = new Thread(task);
        thread.start();
    }
}

