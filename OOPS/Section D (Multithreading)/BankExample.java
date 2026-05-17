// Bank class with synchronized method
class BankAccount {
    private int balance = 1000;

    // Synchronized method for withdrawal
    public synchronized void withdraw(int amount, String user) {
        System.out.println(user + " is trying to withdraw " + amount);

        if (balance >= amount) {
            System.out.println(user + " processing withdrawal...");
            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(user + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(user + " insufficient balance! Current balance: " + balance);
        }
    }
}

// Thread class
class UserThread extends Thread {
    BankAccount account;
    String user;

    UserThread(BankAccount account, String user) {
        this.account = account;
        this.user = user;
    }

    public void run() {
        account.withdraw(700, user);
    }
}

// Main class
public class BankExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Two users accessing same account
        UserThread t1 = new UserThread(account, "User1");
        UserThread t2 = new UserThread(account, "User2");

        t1.start();
        t2.start();
    }
}