import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkExample {
    public static void executeExecutorFrameworkExample() {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task = () -> System.out.println("Task executed by: " + Thread.currentThread().getName());

        for (int i = 0; i < 5; i++) {
            executor.execute(task);
        }

        executor.shutdown();
    }

    public static void main(String[] args) {
        executeExecutorFrameworkExample();
    }
}
