package lambdas;

import java.util.stream.Stream;

public class IntermediateOperationsFilter {

    //Stream<T> filter (predicate)
    //The filter() method returns a stream with the elements that
    //MATCH the given predicate.
    public static void main(String[] args) {

        Stream.of("Developer", "QA", "UX")
                .filter(team -> team.length() == 2)
                .forEach(System.out::println);
    }
}
