package collections;

import java.util.LinkedList;

public class UsingLinkedList {

    public static void main(String[] args) {
        //A doubly-linked list. We can manipulate both ends.
        // Most speed to add but not to find

        LinkedList<String> names = new LinkedList<>();
        names.add("Marcio");
        names.addFirst("Paulo");
        names.addLast("Soares");

        System.out.println(names);
    }
}
