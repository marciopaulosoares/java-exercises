package concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutors {

    private static final ScheduledExecutorService schedEs = Executors.newScheduledThreadPool(10);

    public static void main(String[] args) {
        schedule();
    }

    public static void schedule() {
        System.out.println("Starting schedule");
        Future<String> future = schedEs.schedule(() -> "A", 2, TimeUnit.SECONDS);

        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            schedEs.shutdown();
        }

        System.out.println("Always at the end");
    }
}
