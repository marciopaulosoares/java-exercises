package lambdas;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationsFlatMap {

    public static void main(String[] args) {
        //Takes each element in the stream e.g. Stream<List<String>>
        //and makes any elements it contains
        //top-level elements in a single stream e.g. Stream<String>.
        //flatMap(Function(T,R)) IN:T  OUT:R
        //flatMap(List<String>, Stream<String>)

       List<String> list1 = Arrays.asList("blue", "yellow", "red");
       List<String> list2 = Arrays.asList("cicle", "squad", "triangle");

       Stream<List<String>> streamOfLists = Stream.of(list1, list2);

       String result = streamOfLists.flatMap(Collection::stream).collect(Collectors.joining(", "));
       System.out.println(result);

    }
}
