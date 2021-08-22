package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 10; i < 100; i = i + 10) {
            list.add(i);
        }
        System.out.println("List :" + list);

        list.add(2, 200);
        list.set(3, 300);

        System.out.println("List After replacement :" + list);

        List<Integer> secondList = new ArrayList<>();
        secondList.add(111);
        secondList.add(222);
        secondList.add(333);

        System.out.println("Second List:" + secondList);
        list.addAll(4, secondList);

        System.out.println("List after merge :" + secondList);
        System.out.println("First List after merge :" + list);

        if (list.contains(222)) {
            System.out.println("List is having value.");
        } else {
            System.out.println("List is not having value.");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(5);
        System.out.println("First List after merge :" + list);
    }
}
