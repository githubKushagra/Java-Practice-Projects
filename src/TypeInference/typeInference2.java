package TypeInference;

import java.util.*;

public class typeInference2 {
    public static void main(String[] args) {
        // Using type inference with local variables
        var name = "Alice";
        var age = 25;

        System.out.println("Name: " + name + ", Age: " + age);

        // Using type inference with collections
        var numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (var number : numbers) {
            System.out.println("Number: " + number);
        }


        // Using type inference with the diamond operator
        var map = new HashMap<String, List<Integer>>();
        map.put("A", new ArrayList<>());
        map.get("A").add(100);    // map.get("A") will return an ArrayList, and then we added an element into it similarly for all
        map.get("A").add(200);

        map.put("B" , new ArrayList<>());
        map.get("B").add(19);
        map.get("B").add(20);

        System.out.println("Map: " + map);
    }
}
