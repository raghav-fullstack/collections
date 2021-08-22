package navigable;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> s = new TreeSet<Integer>();

        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);
        s.add(500);

        System.out.println("Print Queue :"+s);

        System.out.println("Ceiling :"+s.ceiling(200));
        System.out.println("Higher :"+s.higher(300));
        System.out.println("Floor  :"+s.floor(100));
        System.out.println("Lower   :"+s.lower(300));
        System.out.println("PollFirst :"+s.pollFirst());
        System.out.println("PollLast :"+s.pollLast());
        System.out.println(s);

    }
}
