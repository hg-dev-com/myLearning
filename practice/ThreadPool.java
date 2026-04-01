import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int task = i;
            executor.submit(() -> {
                System.out.println("Executing task " + task +
                        " by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}