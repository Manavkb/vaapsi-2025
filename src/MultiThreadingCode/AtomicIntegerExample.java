package MultiThreadingCode;

import java.util.concurrent.atomic.AtomicInteger;

class CounterTask extends Thread {
    AtomicInteger counter;

    CounterTask(AtomicInteger counter)
    {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementAndGet();  // thread-safe increment
        }
    }
}

public class AtomicIntegerExample {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);

        // Start 5 threads that increment the same counter
        CounterTask t1 = new CounterTask(counter);
        CounterTask t2 = new CounterTask(counter);
        CounterTask t3 = new CounterTask(counter);
        CounterTask t4 = new CounterTask(counter);
        CounterTask t5 = new CounterTask(counter);

        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();

        t1.join(); t2.join(); t3.join(); t4.join(); t5.join();

        System.out.println("Final counter value: " + counter.get());
    }
}
