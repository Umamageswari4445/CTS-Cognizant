import java.util.concurrent.*;
import java.util.*;

public class Ex41_ExecutorServiceCallable {

    public static void main(String[] args) {
        // 1. Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 2. Create a list of Callable tasks
        List<Callable<String>> taskList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            taskList.add(() -> {
                Thread.sleep(1000); // simulate work
                return "Task " + taskId + " completed by " + Thread.currentThread().getName();
            });
        }

        try {
            // 3. Submit all tasks and collect Future objects
            List<Future<String>> futures = executor.invokeAll(taskList);

            // 4. Retrieve and print results
            for (Future<String> future : futures) {
                System.out.println(future.get()); // blocking call
            }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // 5. Shutdown the executor
            executor.shutdown();
        }
    }
} 
