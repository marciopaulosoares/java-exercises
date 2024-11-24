package lambdas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectAPIPartitioningBy {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("Thomas","Teresa","Alan","Mike");
        Map<Boolean, List<String>> map = names.collect(
                Collectors.partitioningBy(s -> s.startsWith("T"))
        );

        System.out.println(map); //{false=[Alan, Mike], true=[Thomas, Teresa]}
    }
}
