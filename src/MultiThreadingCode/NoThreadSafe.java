package MultiThreadingCode;

class NoThreadSafe implements Runnable {

    static  int counter = 0;
    @Override
    public void run() {
         for (int i = 0; i < 100000000; i++) {
            counter++;
         }
    }


    public static void main(String[] args) throws InterruptedException {
      Thread t1 = new Thread(new NoThreadSafe());
      Thread t2 = new Thread(new NoThreadSafe());

      t1.start();
      t2.start();

      // t1.join();
      // t2.join();

      System.out.println(counter);
    }

}
