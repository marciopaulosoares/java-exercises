package lambdas;

import java.util.function.BinaryOperator;
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
    }
}
