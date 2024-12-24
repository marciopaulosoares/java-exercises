package concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorsFixedDelay {

    private static final ScheduledExecutorService schedEs = Executors.newScheduledThreadPool(10);

    public static void main(String[] args) {
        schedule();
    }

    public static void schedule() {
        System.out.println("Starting schedule");
        // 300 milliseconds is the time to wait from when the previous task finishes to start the next one
        // => previous task finishes - wait 300 milliseconds - start next task
        // Thread.currentThread().getId() will demonstrate that threads are reused
        final long INITIAL_DELAY = 2000, WAIT_PERIOD_AFTER_PREVIOUS_TASK_FINISHED = 1000;
        schedEs.scheduleWithFixedDelay(
                () -> System.out.println("Thread id: " + Thread.currentThread().getId()),
                INITIAL_DELAY,
                WAIT_PERIOD_AFTER_PREVIOUS_TASK_FINISHED,
                TimeUnit.MILLISECONDS
        );

       //If I shut down, nothing happens

        System.out.println("Always at the end");
    }
}
