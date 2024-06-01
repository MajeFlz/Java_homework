package timus;

import java.util.Scanner;

public class task_1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();

        if (one % 2 == 0 || two % 2 == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

