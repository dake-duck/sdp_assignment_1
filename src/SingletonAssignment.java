import java.util.ArrayList;
import java.util.List;

public class SingletonAssignment {
    public static void main(String[] args) throws Exception {
        int numThreads = 5;
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                singleton.add_to_count(1);
                System.out.println("Thread " + Thread.currentThread().threadId() + " got instance: " + singleton.hashCode() + " | " + singleton.get_count());
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
