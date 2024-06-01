package timus;

import java.util.Scanner;

public class task_1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int time = 0;
        if (n <= k) {
            time = 2;
        } else {
            n = 2 * n;
            if (n % k == 0) {
                time = n / k;
            } else {
                time = n / k + 1;
            }
        }

        System.out.println(time);
    }
}
