class Resource {
    String name;
    Resource(String name) {
        this.name = name;
    }
}

public class DeadlockPrevention {
    public static void main(String[] args) {

        Resource r1 = new Resource("Resource 1");
        Resource r2 = new Resource("Resource 2");

        Runnable task = () -> {
            synchronized (r1) {
                System.out.println(Thread.currentThread().getName() + " locked " + r1.name);

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (r2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + r2.name);
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}