package collections;

import java.util.Arrays;
import java.util.List;

public class UsingLists {
    public static void main(String[] args) {
        String[] array = new String[]{"Orange", "Apple", "Lemon", "Papaya", "Grape"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);

        array[0] = "Banana";
        System.out.println(Arrays.toString(array));
        System.out.println(asList);

        asList.set(1,"Fig");
        System.out.println(Arrays.toString(array));
        System.out.println(asList);

       //LinkedList


    }
}
