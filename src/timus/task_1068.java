package timus;
import java.util.Scanner;

public class task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        /* Можно сделать через арифметическую прогрессию (n*(n+1)/2),
        но решил сделать через циклы */
        if (n > 0) {
            while (n >= 1) {
                sum += n;
                n--;
            }
        } else {
            while (n <= 1) {
                sum += n;
                n++;
            }
        }
        System.out.println(sum);
    }
}
