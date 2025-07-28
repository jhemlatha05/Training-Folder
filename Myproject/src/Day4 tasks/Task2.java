package practice_day4tasks;


	class Task2 implements Runnable {
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Count: " + i);
	        }
	    }

	    public static void main(String[] args) {
	        Task2 counter = new Task2();
	        Thread thread = new Thread(counter); // Pass Runnable object to Thread
	        thread.start(); // Start thread
	    }
	}



