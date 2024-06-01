package timus;

import java.util.Scanner;

public class task_2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int _2max = Math.max(b + c, b * c);
        System.out.println(a - _2max);
    }
}
