package lambdas;

import java.util.stream.Stream;

public class IntermediateOperationsMap {

    public static void main(String[] args) {
        //Creates a one-to-one mapping between elements in the stream
        //and elements in the next stage of the stream
        //map is for transforming data.
        //<R> Stream<R> map(Function<T,R> mapper)

        Stream.of("book", "pen", "ruler")
                .map(String::length)
                .forEach(System.out::println); //435
    }
}
