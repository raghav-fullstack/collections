package set;

import java.util.*;

public class HastSetDemo {
    public static void main(String[] args) {
        Random obj = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int nos = obj.nextInt(5);
            list.add(nos);
        }
        System.out.println("List :"+list);

        Set<Integer> set = new HashSet<>(list);

        System.out.println("Set :"+set);

        Iterator<Integer> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(set);

    }
}
