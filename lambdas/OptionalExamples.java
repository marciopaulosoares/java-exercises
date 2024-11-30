package lambdas;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalExamples {

    public static void main(String[] args) {

        Optional<String> optNonNull = howToDealWithNull("myTest");
        optNonNull.ifPresent(System.out::println);

        Optional<String> optNull = howToDealWithNull(null);
        System.out.println(
                optNull.orElseGet(() -> "Empty optional")
        );

        System.out.println("-------------------------");
        doOptionalPrimitiveAverage();
    }

    public static Optional<String> howToDealWithNull(String param) {
        // param == null ? optional.Empty : Optional.of(param)
        return Optional.ofNullable(param);
    }

    public static void doOptionalPrimitiveAverage() {
        OptionalDouble optAvg = IntStream.rangeClosed(1, 10).average();

        optAvg.ifPresent((d) -> System.out.println(d));
        System.out.println(optAvg.getAsDouble());
        System.out.println(optAvg.orElseGet(() -> Double.NaN));

    }
}
