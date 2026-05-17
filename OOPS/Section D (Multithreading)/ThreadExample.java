// Create a class that extends Thread
class MyThread extends Thread {
    
    // Override the run() method
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class ThreadExample {
    public static void main(String[] args) {
        
        // Create object of MyThread
        MyThread t1 = new MyThread();
        
        // Start the thread
        t1.start();
        
        // Main thread work
        for(int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}