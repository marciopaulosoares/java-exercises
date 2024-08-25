package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class staticMethodReference {
    public static void main(String[] args) {
        staticMethodReferenceTypes();
    }

    private static void staticMethodReferenceTypes() {
        // Static method references are considered UNBOUND also.
        // Consumer<T>
        //      void accept(T t)
        //          void accept (List<Integer>)
        // Consumer takes one parameter => sort(List) is used, as opposed to sort (List, Comparator)
        Consumer<List<Integer>> sortL = list -> Collections.sort(list);
        Consumer<List<Integer>> sortMR = Collections::sort;

        List<Integer> listOfNumbers = Arrays.asList(2,1,5,8,3);
        sortL.accept(listOfNumbers);
        System.out.println(listOfNumbers); // [1, 2, 3, 5, 8]

        listOfNumbers = Arrays.asList(8,12,4,3,7);
        sortMR.accept(listOfNumbers);
        System.out.println(listOfNumbers); // [3, 4, 7, 8, 12]

    }
}
