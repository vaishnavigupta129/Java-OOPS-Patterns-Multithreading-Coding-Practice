// Thread class
class MyThread extends Thread {
    
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class JoinExample {
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.start();

        try {
            t1.join(); // Main thread waits for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start(); // Starts only after t1 completes
    }
}