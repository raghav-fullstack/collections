package navigable;

import java.util.TreeMap;

public class AssignmentTreeSet {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("a", "alpha");
        map.put("b", "beta");
        map.put("c", "gamma");
        map.put("d", "delta");
        map.put("t", "theta");
        map.put("l", "lambda");

        System.out.println("TreeSet \t" + map);

        System.out.println("Floor Key \t:" + map.floorKey("a"));
        System.out.println("Lower Key \t:" + map.lowerKey("b"));
        System.out.println("Ceiling Key \t:" + map.ceilingKey("c"));
        System.out.println("Higher Key \t:" + map.higherKey("d"));
        System.out.println("Poll First Entry \t:" + map.pollFirstEntry());
        System.out.println("Poll Last Entry \t:" + map.pollLastEntry());

        System.out.println("TreeSet \t:" + map);
        System.out.println("Descending Order \t:" + map.descendingMap());


    }
}
