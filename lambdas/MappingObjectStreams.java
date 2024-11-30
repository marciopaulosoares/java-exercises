package lambdas;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MappingObjectStreams {
    public static void main(String[] args) {

        //Stream<T> to Stream<T>
        Stream.of("São Paulo", "São Roque", "Campinas")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Stream<T> to DoubleStream
        DoubleStream dblStream = Stream.of("São Paulo", "São Roque", "Campinas")
                .mapToDouble(String::length);

        dblStream.forEach(System.out::println);

        //Stream<T> to IntStream
        IntStream intStream = Stream.of("São Paulo", "São Roque", "Campinas")
                .mapToInt(String::length);

        intStream.forEach(System.out::println);

        //Stream<T> to LongStream
        LongStream longStream = Stream.of("São Paulo", "São Roque", "Campinas")
                .mapToLong(String::length);

        longStream.forEach(System.out::println);
    }
}
