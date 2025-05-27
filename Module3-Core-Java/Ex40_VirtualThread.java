import java.time.Duration;
import java.time.Instant;

public class Ex40_VirtualThread {

    public static void main(String[] args) throws InterruptedException {
        final int count = 100_000;

        Instant start = Instant.now();

        Thread[] threads = new Thread[count];

        // Launch virtual threads
        for (int i = 0; i < count; i++) {
            threads[i] = Thread.startVirtualThread(() -> {
                // For demo, just print thread name
                System.out.println("Hello from " + Thread.currentThread());
            });
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            t.join();
        }

        Instant end = Instant.now();
        System.out.println("Virtual threads execution took: " + Duration.between(start, end).toMillis() + " ms");
    }
}