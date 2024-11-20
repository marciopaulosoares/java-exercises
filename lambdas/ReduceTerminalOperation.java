package lambdas;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceTerminalOperation {

    // The reduce() method combine a stream into a single object
    // It is a reduction, which means it processes all elements.
    // The most commons ways of doing a reduction is to start with
    // an initial value and keeping merging it with the next value

    //When you leave out the identity, an Optional is returned
    //because there may not be any data (all the elements could have
    //been filtered out earlier)
    //There are 3 possible results:
    //a) empty stream -> empty Optional returned
    //b) one element in stream => that element is returned
    //c) multiple elements in stream => accumulator is applied

    public static void main(String[] args) {
        String name = Stream.of("m", "a", "r", "c", "i", "o").reduce("", (s, c) -> s + c);
        System.out.println(name);

        Integer sum = Stream.of(10, 20, 45).reduce(1, Integer::sum);
        System.out.println(sum);

        //without  identity
        BinaryOperator<Integer> op = (a, b) -> a + b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(6);
        Stream<Integer> manyElements = Stream.of(3,4,5,6);

        empty.reduce(op).ifPresent(System.out::println);
        oneElement.reduce(op).ifPresent(System.out::println); //6
        manyElements.reduce(op).ifPresent(System.out::println); //18

    }


}
