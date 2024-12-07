package collections;

import models.User;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
