package maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("raghav", 81);
        map.put("aarav", 99);
        map.put("shalini", 89);
        map.put("shanky", 85);

        // use keySet() method to get the list of all the keys
        Set<String> strings = map.keySet();
        System.out.println("\nKeys :" + strings);

        // use values() method to get the list of all the keys
        Collection<Integer> values = map.values();
        System.out.println("\nValues :" + values);

        //print the key-values
        for (String key: strings) {
            System.out.println("\nKeys :"+key+"  \tValues :"+map.get(key));

        }
    }
}
