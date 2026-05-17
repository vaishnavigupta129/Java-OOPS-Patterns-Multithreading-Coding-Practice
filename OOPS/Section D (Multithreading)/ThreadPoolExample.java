import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task class implementing Runnable
class Task implements Runnable {
    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    public void run() {
        System.out.println("Executing Task " + taskId + 
                           " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // simulate work
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Main class
public class ThreadPoolExample {
    public static void main(String[] args) {

        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 5 tasks
        for(int i = 1; i <= 5; i++) {
            executor.execute(new Task(i));
        }

        // Shutdown the executor
        executor.shutdown();
    }
}