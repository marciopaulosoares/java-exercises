package lambdas;

import java.util.stream.Stream;

public class IntermediateOperationsDistinct {

    public static void main(String[] args) {
        //Stream<T> distinct()
        //Is a stateful intermediate operation


        Stream.of("eagle", "eagle","EAGLE")
                .peek(s -> System.out.println(" 1." + s))
                .distinct()
                .forEach(s ->  System.out.println(" 2." + s));
    }
}
