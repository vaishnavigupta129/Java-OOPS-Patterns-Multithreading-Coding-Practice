// Shared resource class
class Buffer {
    private int data;
    private boolean hasData = false;

    // Produce data
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // wait if buffer is full
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data = value;
        System.out.println("Produced: " + data);
        hasData = true;

        notify(); // notify consumer
    }

    // Consume data
    public synchronized void consume() {
        while (!hasData) {
            try {
                wait(); // wait if buffer is empty
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify(); // notify producer
    }
}

// Producer thread
class Producer extends Thread {
    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class
public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}