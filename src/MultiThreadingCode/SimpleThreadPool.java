package MultiThreadingCode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable {
    String name;
    Task(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(name + " is running in " + Thread.currentThread().getName());
    }
}

public class SimpleThreadPool {
    public static void main(String[] args) {
        // Create a thread pool with 2 threads
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // Submit 3 simple tasks
        pool.execute(new Task("Task1")); // runnable.run()
        pool.execute(new Task("Task2"));
        pool.execute(new Task("Task3"));

        // Shutdown the pool
        pool.shutdown();
    }
}
