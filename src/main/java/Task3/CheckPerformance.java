package Task3;

import java.util.ArrayList;
import java.util.List;

public class CheckPerformance {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            nums.add(i);
        }
        long timeOfGet = timer(() -> nums.get(53));
        System.out.println(timeOfGet);
        long timeOfAdd = timer(() -> nums.add(1000000, 1000));
        System.out.println(timeOfAdd);
    }

    private static long timer(Runnable task) {
        long before = System.currentTimeMillis();
        task.run();
        long after = System.currentTimeMillis();
        return after - before;
    }
}
