package MultiThreadingCode;

class Signal
{
    synchronized void waitForVishal() {
        System.out.println("Manav: Waiting for Vishal's message...");
        try {
            wait();  // Manav waits
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Manav: Got the message! Let's start work.");
    }

    synchronized void notifyManav() {
        System.out.println("Vishal: Sending signal to Manav...");
        notify();  // Vishal sends signal
    }
}

public class WaitNotify {
    public static void main(String[] args) {
        Signal signal = new Signal();

        // Manav's thread - waiting for Vishal
        Thread manavThread = new Thread(() -> signal.waitForVishal());

        // Vishal's thread - sends signal after 1 second
        Thread VishalThread = new Thread(() -> {
            try { Thread.sleep(4000); } catch (InterruptedException ignored) {}
            signal.notifyManav();
        });

        manavThread.start();
        VishalThread.start();
    }
}
