package timus;

import java.util.Scanner;

public class task_2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int guests = 2;

        for (int i = 0; i < n; i++) {
            String response = in.next();
            if (response.endsWith("+one")) {
                guests += 2;
            } else {
                guests++;
            }
        }

        int cost = (guests == 13) ? (guests + 1) * 100 : guests * 100;

        System.out.println(cost);
    }
}
