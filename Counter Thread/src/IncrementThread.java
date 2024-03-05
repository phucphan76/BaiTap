public class IncrementThread extends Thread{
    private Counter counter;
    private int incrementPerThread;

    public IncrementThread(Counter counter, int incrementPerThread) {
        this.incrementPerThread = incrementPerThread;
        this.counter = counter;
    }

    @java.lang.Override
    public void run() {
        for (int i = 0; i < incrementPerThread; i++) {
            try {
                counter.increment();
            } catch (java.lang.InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
