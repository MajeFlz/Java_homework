package timus;

import java.util.Scanner;

public class task_2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        int c = b - b1;
        int c1 = a - a2;
        System.out.println(c1 + " " + c);

        scanner.close();
    }
}

