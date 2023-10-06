import java.util.ArrayList;
import java.util.List;

public class SingletonAssignment {
    public static void main(String[] args) throws Exception {
        int numThreads = 5;
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                System.out.println("Thread " + Thread.currentThread().threadId() + " got instance: " + singleton.hashCode());
            });
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
