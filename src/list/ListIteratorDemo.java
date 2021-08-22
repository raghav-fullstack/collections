package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("abd");
        list.add("def");
        list.add("xyz");

        ListIterator<String> iterator = list.listIterator();

        System.out.println("\n Traversing the list in the the forward direction.");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n Traversing the list in the the backward direction.");

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
