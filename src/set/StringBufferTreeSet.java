package set;

import comparator.SBComparator;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {

    public static void main(String[] args) {

        Set<StringBuffer> set = new TreeSet<>(new SBComparator());

        set.add(new StringBuffer("abcd"));
        set.add(new StringBuffer("xyz123"));
        set.add(new StringBuffer("ijk"));
        set.add(new StringBuffer("mno23"));
        set.add(new StringBuffer("mno1234567"));


        for (StringBuffer str : set) {
            System.out.println(str);
        }
    }
}
