package lambdas;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectAPIGroupByTerminalOperations {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("Alex", "Marcio", "Marcio", "Pedro", "Danilo", "Maria");
        Map<Integer, List<String>> map = names.collect(Collectors.groupingBy(String::length));
        System.out.println(map); //{4=[Alex], 5=[Pedro, Maria], 6=[Marcio, Marcio, Danilo]}

        //Remove duplicates

        Stream<String> names2 = Stream.of("Alex", "Marcio", "Marcio", "Pedro", "Danilo", "Maria");
        Map<Integer, Set<String>> map2 = names2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map2); //{4=[Alex], 5=[Pedro, Maria], 6=[Marcio, Danilo]}

        //Sort

        Stream<String> names3 = Stream.of("Marcio", "Marcio", "Pedro", "Danilo", "Maria", "Alex");
        TreeMap<Integer, List<String>> map3 = names3.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(map3); //{4=[Alex], 5=[Pedro, Maria], 6=[Marcio, Marcio, Danilo]}

    }
}
