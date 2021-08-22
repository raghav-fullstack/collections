package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DifferentSets {
    public static void main(String[] args) {
        Random obj = new Random();

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 8; i++) {
            int number = obj.nextInt(5);
            hashSet.add(number);
            System.out.println(number);
        }
        System.out.println("HashSet : "+hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 8; i++) {
            int number = obj.nextInt(5);
            linkedHashSet.add(number);
            System.out.println(number);
        }
        System.out.println("LinkedHashSet : "+linkedHashSet);


        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 8; i++) {
            int number = obj.nextInt(5);
            treeSet.add(number);
            System.out.println(number);
        }
        System.out.println("TreeSet : "+treeSet);

    }
}
