package MultiThreadingCode;

class SafeCounterSync implements Runnable {
    static int count = 0;

    public synchronized static void increment() {
        count++;
    }

    public void run() {
        for (int i = 0; i < 1000000; i++) {
            increment();  //  Thread-safe with synchronized
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new SafeCounterSync());
        Thread t2 = new Thread(new SafeCounterSync());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(" Synchronized Counter value: 2000000  " + count);
    }
}

