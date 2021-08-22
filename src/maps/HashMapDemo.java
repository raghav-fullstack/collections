package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("raghav", 81);
        map.put("aarav", 99);
        map.put("shalini", 89);
        map.put("shanky", 85);

        // use keySet() method to get the list of all the keys
        Set<String> strings = map.keySet();
        System.out.println("Keys :" + strings);

        // use values() method to get the list of all the keys
        Collection<Integer> values = map.values();
        System.out.println("Values :" + values);

        //print the key-values
        for (String key: strings) {
            System.out.println("Keys :"+key+"  Values :"+map.get(key));

        }
    }
}
