package lr3.task6;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        int n = 1000000;
        List<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        int startIndex = 0;
        while (circle.size() > 1) {
            startIndex = (startIndex + 1) % circle.size();
            circle.remove(startIndex);
        }

        System.out.println(STR."Последний остался: \{circle.getFirst()}");
    }
}
