package concurrent;

import java.util.concurrent.ExecutorService;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = java.util.concurrent.Executors.newSingleThreadExecutor();
        service.execute(() -> System.out.println("Runnable example"));
        service.shutdown();
    }
}
