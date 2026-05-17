// Class for printing numbers
class NumberPrinter {
    int number = 1;
    int max = 10;

    // Print odd numbers
    public synchronized void printOdd() {
        while (number <= max) {
            if (number % 2 == 0) {
                try {
                    wait(); // wait if number is even
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Odd: " + number);
                number++;
                notify(); // notify even thread
            }
        }
    }

    // Print even numbers
    public synchronized void printEven() {
        while (number <= max) {
            if (number % 2 != 0) {
                try {
                    wait(); // wait if number is odd
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Even: " + number);
                number++;
                notify(); // notify odd thread
            }
        }
    }
}

// Runnable for Odd
class OddThread implements Runnable {
    NumberPrinter np;

    OddThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printOdd();
    }
}

// Runnable for Even
class EvenThread implements Runnable {
    NumberPrinter np;

    EvenThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printEven();
    }
}

// Main class
public class OddEvenExample {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();

        Thread t1 = new Thread(new OddThread(np));
        Thread t2 = new Thread(new EvenThread(np));

        t1.start();
        t2.start();
    }
}