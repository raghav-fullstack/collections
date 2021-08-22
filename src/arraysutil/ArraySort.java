package arraysutil;

import java.util.Arrays;
import java.util.List;

public class ArraySort {

    public static void main(String[] args) {

        int[] a = {40,10,15,7};
        System.out.println("\n Before Arrays Sorting");
        for (int i :a) {
            System.out.println(i);
        }
        Arrays.sort(a);

        System.out.println("\n After Arrays Sorting");
        for (int i :a) {
            System.out.println(i);
        }

        String []strings = {"Ball","Apple","Tiger","Zebra","Dog"};

        Arrays.sort(strings, new MyComparator());

        for (String s: strings ) {
            System.out.println(s);
        }

        Arrays.sort(strings);
        int tiger = Arrays.binarySearch(strings, "Tiger");

        System.out.println("Index of Tiger :"+tiger);

        List<String> stringsList = Arrays.asList(strings);
        System.out.println("Array to List conversion"+stringsList);

    }
}
