package timus;

import java.util.Scanner;

public class task_1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int OY = 8, OX = 8;
        int n = in.nextInt();
        in.nextLine();

        for (int i2 = 0; i2 < n; i2++) {
            String s = in.nextLine();
            int x = s.charAt(0) - 'a' + 1;
            int y = s.charAt(1) - '0';
            int[] mx = {x - 2, x - 2, x - 1, x - 1, x + 1, x + 1, x + 2, x + 2};
            int[] my = {y - 1, y + 1, y - 2, y + 2, y - 2, y + 2, y - 1, y + 1};
            int step = 0;

            for (int i = 0; i < 8; i++) {
                if (OX >= mx[i] && mx[i] > 0 && OY >= my[i] && my[i] > 0) {
                    step++;
                }
            }

            System.out.println(step);
        }

        in.close();
    }
}
