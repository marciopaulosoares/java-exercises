package lambdas;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ReduceTerminalOperation2 {

// <U> reduce (U identity,
//              BiFunction accumulator,
//              BinaryOperator combiner
// Use BiFunction to perform an action on string and after use BinaryOperator to sum
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("car", "bus", "train", "aeroplane");
        int length = stream.reduce(0, (n, str) -> n + str.length(), Integer::sum);
        System.out.println(length);

        OptionalInt max = IntStream.of(1,5,10).max(); //terminal operator
        max.ifPresent(System.out::println);

        OptionalDouble min = DoubleStream.of(10.0,20.5,30.56).min();
        System.out.println(min.orElseThrow());

        OptionalDouble average = LongStream.of(10L,20L,30L).average();
        System.out.println(average.orElseGet(Math::random));
    }
}
