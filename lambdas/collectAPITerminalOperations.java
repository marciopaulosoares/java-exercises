package lambdas;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectAPITerminalOperations {

    public static void main(String[] args) {

        String s = Stream.of("cake", "biscuits", "apple").collect(Collectors.joining(", "));
        System.out.println(s);

        Double avg = Stream.of("cake", "biscuits", "apple").collect(Collectors.averagingInt(String::length));
        System.out.println(avg);

        //Collecting into Maps
        Map<String, Integer> map = Stream.of("cake", "biscuits", "apple").collect(Collectors.toMap(
                x -> x,
                x -> x.length()
        ));

        //Collecting into Maps with duplicate keys (use merge)
        Map<Integer, String> map2 = Stream.of("cake", "biscuits", "tart").collect(Collectors.toMap(
                x -> x.length(),
                x -> x,
                (x1, x2) -> x1 + ", " + x2
        ));

        System.out.println(map2);

        //Collecting into Maps > TreeMap
        TreeMap<String, Integer> map3 = Stream.of("cake", "biscuits", "tart", "cake")
                .collect(Collectors.toMap(
                        x -> x,
                        String::length,
                        Integer::sum,
                        TreeMap::new //sort the itens
                ));

        System.out.println(map3);
        System.out.println(map3.getClass());
    }
}
