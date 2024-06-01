package timus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task_1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(findDel(n));
    }

    public static String findDel(int n){

        if (n == 0) {
            return "10";
        }
        if (n == 1) {
            return "1";
        }
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 9; i >= 2; i--) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            return "-1";
        }

        Collections.sort(factors);

        StringBuilder result = new StringBuilder();
        for (int factor : factors) {
            result.append(factor);
        }

        return result.toString();

    }
}
