package ramdom;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt();

        System.out.println("First random no. :"+x);

        int y = random.nextInt(100);

        System.out.println("Second random no. :"+y);



    }
}
