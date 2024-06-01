package timus;

import java.util.Scanner;

public class task_1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] stones = new int[n];
        int totalWeight = 0;

        for (int i = 0; i < n; i++) {
            stones[i] = in.nextInt();
            totalWeight += stones[i];
        }

        System.out.println(minDifference(stones, totalWeight));
    }

    public static int minDifference(int[] stones, int totalWeight) {
        boolean[] dp = new boolean[totalWeight + 1];
        dp[0] = true;

        for (int stone : stones) {
            for (int j = totalWeight; j >= stone; j--) {
                dp[j] |= dp[j - stone];
            }
        }

        int halfWeight = totalWeight / 2;
        int minDiff = Integer.MAX_VALUE;

        for (int i = halfWeight; i >= 0; i--) {
            if (dp[i]) {
                minDiff = Math.min(minDiff, totalWeight - 2 * i);
            }
        }

        return minDiff;
    }
}
