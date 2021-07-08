package sets;

import java.net.ServerSocket;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;

public class SetsTest {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("Apple");

        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        Set<String> vegetables = new HashSet<>();
        vegetables.add("potatoes");
        vegetables.add("onion");

        vegetables.addAll(fruits);
        System.out.println(vegetables.size());

        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
