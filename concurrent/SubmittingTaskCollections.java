package concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class SubmittingTaskCollections {
    //Single thread executor will accept tasks sequentially in the order
    //they are submitted
    //private static ExecutorService service = java.util.concurrent.Executors.newSingleThreadExecutor();
    private static ExecutorService service = java.util.concurrent.Executors.newFixedThreadPool(4);
    // with 4 threads to share the work, there is no guarantee which letter will be printed first
    private static List<Callable<String>> callables = new ArrayList<>();

    public static void main(String[] args) {
        callables.add(() -> "A");
        callables.add(() -> "B");
        callables.add(() -> "C");
        callables.add(() -> "D");

       // invokeAny();
        invokeAll(); //A B C D

    }

    public static void invokeAny() {
        try {
            // submit all tasks to the executor service
            // executes synchronously and returns the result of the first task that completes, all other tasks are cancelled
            // Note: single thread executor will execute tasks sequentially in the order they are submitted, will always execute the first task submitted
            String result = service.invokeAny(callables);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
        System.out.println("Always at the end");
    }

    public static void invokeAll(){
        try{
            // submit all tasks to the executor service
            // executes synchronously and returns when all of tasks are completed
            // Orders is maintained i.e the result for callables.get(0) will be printed first
            List<Future<String>> list = service.invokeAll(callables);
            for (Future<String> future : list) {
                System.out.println(future.get());
            }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }
}

