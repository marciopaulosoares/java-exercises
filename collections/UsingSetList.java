package collections;

import java.util.Set;
import java.util.TreeSet;

public class UsingSetList {

    public static void main(String[] args) {
        factoryMethods();
        treeSet();
    }

    private static void treeSet() {
        //SUU - Sets are Unique and Unsorted

        Set<String> names = new TreeSet<>();
        names.add("José");
        names.add("José");
        names.add("Pedro");
        names.add("Thiago");
        names.add("Ana");
        //No duplicates, elements are sorted alphabetically
        System.out.println(names); //[Ana, José, Pedro, Thiago]

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(99);
        numbers.add(23);
        numbers.add(Integer.valueOf("21"));
        numbers.add(Integer.valueOf("11"));
        //No Duplicates, elements ares sorted numerically
        System.out.println(numbers);// [11, 21, 23, 99]


    }

    private static void factoryMethods() {
        //unmodifiable sets returned
        Set<String> of = Set.of("a", "b", "c");
        Set<String> copy = Set.copyOf(of);

        //of.add("d"); // UnsuportedOperationException
        //copy.add("d"); // UnsuportedOperationException
        //of.remove("d"); // UnsuportedOperationException

        System.out.println(of);
    }
}
