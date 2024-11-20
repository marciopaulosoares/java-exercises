package lambdas;

import java.util.stream.Stream;

public class collectTerminalOperations {
    //This is a special type of reduction called a mutable reduction because
    // we use the same mutable object while accumulating. This makes it more efficient
    //than regular reductions.
    //Ex. StringBuilder and ArrayList
    //It is a really usefull method as it let us get data out of streams
    //and into other forms e.g Map's, List's and Set's

    public static void main(String[] args) {
        StringBuilder word = Stream.of("a", "ba", "ca", "te")
                .collect(
                        () -> new StringBuilder(),
                        (sb, str) -> sb.append(str),
                        (sb1, sb2) -> sb1.append(sb2)

                );

        System.out.println(word);

        StringBuilder word2 = Stream.of("la", "ran", "ja")
                .collect(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append

                );

        System.out.println(word2);
    }
}
