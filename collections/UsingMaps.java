package collections;

import models.User;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class UsingMaps {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>(); //sorted by keys
        map.put("John", 18);
        map.put("Mary", 21);
        map.put("Chris", 33);

        System.out.println(map.containsKey("John"));
        System.out.println(map.containsValue(18));
        System.out.println(map.isEmpty());
        System.out.println(map.get("John"));

        for (String name : map.keySet()) {
            System.out.println(name);
        }

        for (Integer age : map.values()) {
            System.out.println(age);
        }

        //foreach(BiConsumer)
        //Biconsumer<T,U> void accept(T t, U u);
        map.forEach((k, v) -> System.out.println(k + " maps to " + v));

        //Set<Map.Entry<k,V> entrySet() - Map.Entry encapsulates a key-value pair.
        //go from a Map to a set (an official collection)

        map.entrySet().forEach( entry -> System.out.println(entry.getKey() + " --- "+ entry.getValue()));

        Set<String> keys = map.keySet();

        //PutIfAbsent -> put if value is null.
        map.put("Mike", null); //{Chris=33, John=18, Mary=21, Mike=null}
        map.putIfAbsent("Chris", 99); //Chris continue with 33
        map.putIfAbsent("Mike", 10);
        System.out.println(map); //{Chris=33, John=18, Mary=21, Mike=10}

        //replace() and replaceAll
        Integer original = map.replace("Chris", 81);
        System.out.println(map); //{Chris=81, John=18, Mary=21, Mike=10}
        //BiFunction<T, U, R>
        //R apply(T t, U u) - 2 inputs and an output; all of which can be different types
        //replaceAll(BiFunction<k,V,V> fn) - note the return type is of type V also
        map.replaceAll((name,age) -> name.length()); //{Chris=5, John=4, Mary=4, Mike=4}
        System.out.println(map);

        map.remove("Mike");

        otherExample();
    }

    private static void otherExample() {
        List<Map<String, Object>> rows = List.of(
                Map.of("id", 1, "name", "Marcio"),
                Map.of("id", 2, "name", "Alex"),
                Map.of("id", 3, "name", "Charlie")
        );

        List<User> users = rows.stream()
                .map(row -> new User(
                        (Integer) row.get("id"),    // Cast id to Integer
                        (String) row.get("name")   // Cast name to String
                ))
                .toList();

        users.forEach(System.out::println);
    }
}
