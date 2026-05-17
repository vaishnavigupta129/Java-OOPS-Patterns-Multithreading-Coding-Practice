// Daemon thread class
class MyDaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// User thread (normal thread)
class UserThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("User thread working: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class DaemonExample {
    public static void main(String[] args) {
        
        MyDaemonThread d = new MyDaemonThread();
        UserThread u = new UserThread();

        // Set daemon thread BEFORE starting it
        d.setDaemon(true);

        d.start();
        u.start();
    }
}