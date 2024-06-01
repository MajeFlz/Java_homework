package timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class task_1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> penguinCount = new HashMap<>();
        penguinCount.put("Emperor Penguin", 0);
        penguinCount.put("Little Penguin", 0);
        penguinCount.put("Macaroni Penguin", 0);

        for (int i = 0; i < n; i++) {
            String penguin = in.nextLine();
            penguinCount.put(penguin, penguinCount.get(penguin) + 1);
        }

        String mostPopularPenguin = null;
        int maxCount = -1;

        for (Map.Entry<String, Integer> entry : penguinCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopularPenguin = entry.getKey();
            }
        }

        System.out.println(mostPopularPenguin);
    }
}