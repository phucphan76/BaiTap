public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numThreads = 6;
        int incrementPerThread = 5;
        IncrementThread[] threads = new IncrementThread[numThreads];

        // create and start the threads
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new IncrementThread(counter, incrementPerThread);
            threads[i].start();
        }

        // wait for all thread to finish
        try {
            for (IncrementThread thread : threads){
                thread.join();
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}