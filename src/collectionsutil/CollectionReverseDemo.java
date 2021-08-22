package collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionReverseDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(8);
        list.add(50);
        list.add(78);
        list.add(32);

        System.out.println("Before reversal "+list);
        Collections.reverse(list);
        System.out.println("After reversal "+list);

    }
}
