package MultiThreadingCode;

import java.util.concurrent.atomic.AtomicInteger;

class SafeCounterAtomic implements Runnable {
    static AtomicInteger count = new AtomicInteger(0);

    public void run() {
        for (int i = 0; i < 1000000; i++) {
            count.incrementAndGet();  //  Thread-safe with AtomicInteger
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new SafeCounterAtomic());
        Thread t2 = new Thread(new SafeCounterAtomic());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Atomic Counter value: 2000000  " + count.get());
    }
}

