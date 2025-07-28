package practice_day4tasks;

class Task1 extends Thread {
	
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from Thread!");
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Task1 thread = new Task1();
        thread.start(); // Start the thread
    }
}
