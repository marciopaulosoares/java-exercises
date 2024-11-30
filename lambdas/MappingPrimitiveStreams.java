package lambdas;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingPrimitiveStreams {

    public static void main(String[] args) {

        //IntStream to Stream<T>
        Stream<String> streamAges = IntStream.of(1, 2, 3)
                .mapToObj(n -> "Number:" + n);

        //foreach is a terminal operation which closes the stream
        //foreach(consumer) - Consumer is a functional interface:
        // void accept(T t)

        streamAges.forEach(System.out::println);

        //IntStream to DoubleStream
        DoubleStream dblStream = IntStream.of(1, 2, 10)
                // mapToDouble (intToDoubleFunction)
                // Is a functional interface
                // double applyAsDouble(int value)
                .mapToDouble(n -> n);

        dblStream.forEach(System.out::println);

        // IntStream to IntStream
        IntStream.of(5, 6, 7)
                //map(intUnaryOperator)
                //IntUnaryOperator is a functional interface
                // int applyAsInt(int)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
