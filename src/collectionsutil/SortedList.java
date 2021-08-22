package collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Boy");
        list.add("Tiger");
        list.add("Bat");
        list.add("Zebra");
        list.add("Apple");

        System.out.println("Before sorting :" + list);
        Collections.sort(list);
        System.out.println("After sorting :" + list);

        int tiger = Collections.binarySearch(list, "Tiger");
        System.out.println("Index of Tiger :" + tiger);


    }
}
