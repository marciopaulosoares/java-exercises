package lambdas;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreams {

    public static void main(String[] args) {
        int sum = Stream.of(10,20,30,40,50)
                .parallel()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum == " + sum);
        System.out.println("---------------------------");
        sequentialStream();
        System.out.println("---------------------------");
        parallelStream();

    }

    //Be Careful of that if order is important to you

    public static void sequentialStream(){
        Arrays.asList("a","b","c")
                .stream()
                .forEach(System.out::println);
    }

    public static void parallelStream(){
        Arrays.asList("a","b","c")
                .stream()
                .parallel()
                .forEach(System.out::println);
    }
}
