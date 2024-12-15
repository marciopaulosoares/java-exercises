package concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableTest {
    public static void main(String[] args) {
        ExecutorService service = java.util.concurrent.Executors.newSingleThreadExecutor();
        Future<Integer> result = service.submit(() -> 30 + 11);

        try {
            System.out.println(result.get(500, TimeUnit.MICROSECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException ex) {
            ex.printStackTrace();
        }

        service.shutdown();
    }
}
