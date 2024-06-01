package timus;

import java.util.Scanner;

public class task_1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int maxSize = array[0] + array[1] + array[2];
        int size;
        int ints = 2;

        for (int i = 1; i < n - 2; i++) {
            size = array[i] + array[i + 1] + array[i + 2];
            if (size > maxSize) {
                maxSize = size;
                ints = i + 2;
            }
        }

        System.out.println(maxSize + " " + ints);

    }

}
