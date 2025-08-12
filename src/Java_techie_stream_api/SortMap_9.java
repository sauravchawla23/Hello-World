package Java_techie_stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap_9 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 2);
        map.put("Apple", 5);
        map.put("Orange", 3);

        // Sort by Key (Ascending)
        System.out.println("Sort by Key (Ascending)");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        // Sort by Value (Ascending)
        System.out.println("Sort by Value (Ascending)");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        // Sort by Value (Descending) & Collect into LinkedHashMap
        System.out.println("Sort by Value (Descending) & Collect into LinkedHashMap");
        Map<String, Integer> sortedDesc = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("Descending Map: " + sortedDesc);
    }
}
