// Create a class extending Thread
class MyThread extends Thread {
    
    public MyThread(String name) {
        super(name); // set thread name
    }

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + 
                               " is running with priority " + 
                               Thread.currentThread().getPriority());
        }
    }
}

// Main class
public class ThreadPriorityExample {
    public static void main(String[] args) {
        
        // Create threads
        MyThread t1 = new MyThread("Low Priority Thread");
        MyThread t2 = new MyThread("Medium Priority Thread");
        MyThread t3 = new MyThread("High Priority Thread");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}