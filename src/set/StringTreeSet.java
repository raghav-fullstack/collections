package set;

import comparator.StringComparator;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>(new StringComparator());

        set.add("abc12");
        set.add("xyz");
        set.add("ijk1234");
        set.add("mno1");

        for (String str: set ) {
            System.out.println(str);
        }
    }
}
