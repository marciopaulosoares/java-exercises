package lambdas;

import java.util.stream.Stream;

public class IntermediateOperationsLimit {

    public static void main(String[] args) {
        //Stream<T> limit(long maxSize)
        //Is a short-circuiting stateful

        Stream.of(11, 22, 33, 44, 55, 66, 77, 88, 99)
                .peek(s -> System.out.println(" A#" + s))
                .filter(n -> n > 40)
                .peek(s -> System.out.println(" B#" + s))
                .limit(2)
                .forEach(n -> System.out.println(" C#" + n));
    }
}
