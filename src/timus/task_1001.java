package timus;

import java.util.Scanner;

public class task_1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] result = new double[262144];
        int i = 0;

        while (scanner.hasNextDouble()) {
            double In = scanner.nextDouble();
            result[i] = Math.sqrt(In);
            i++;
        }

        for (i--; i >= 0; i--) {
            System.out.printf("%.4f%n", result[i]);
        }

        scanner.close();
    }
}