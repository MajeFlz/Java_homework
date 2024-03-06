package timus;

import java.util.Scanner;
public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int shotHarry = in.nextInt();
        int shotLarry = in.nextInt();

        int countTargets  = shotHarry + shotLarry - 1;

        System.out.println((countTargets - shotHarry) + " " + (countTargets - shotLarry));
    }
}
