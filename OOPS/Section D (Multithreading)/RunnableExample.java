// Create a class that implements Runnable
class MyRunnable implements Runnable {
    
    // Override run() method
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
public class RunnableExample {
    public static void main(String[] args) {
        
        // Create object of MyRunnable
        MyRunnable obj = new MyRunnable();
        
        // Pass Runnable object to Thread
        Thread t1 = new Thread(obj);
        
        // Start the thread
        t1.start();
        
        // Main thread work
        for(int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}