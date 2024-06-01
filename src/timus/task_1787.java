package timus;

import java.util.Scanner;

public class task_1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int mins = in.nextInt();
        int ost = 0;

        for(int i = 0; i < mins; i++){
            int cars = in.nextInt() + ost;

            if (cars <= n) {
                ost = 0;
                continue;
            }
            else {
                ost = cars - n;
            }
        }

        System.out.println(ost);

    }
}
