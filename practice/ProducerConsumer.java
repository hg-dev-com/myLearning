import java.util.concurrent.*;

public class ProducerConsumer {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                } catch (Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    int val = queue.take();
                    System.out.println("Consumed: " + val);
                } catch (Exception e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}