package timus;

import java.util.Scanner;
public class task_1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int unitsCount = in.nextInt();

        System.out.println(unitsLocale(unitsCount));
    }

    public static String unitsLocale(int unitsCount) {
        if (unitsCount >= 1 && unitsCount <= 4) {
            return "few";
        } else if (unitsCount >= 5 && unitsCount <= 9) {
            return "several";
        } else if (unitsCount >= 10 && unitsCount <= 19) {
            return "pack";
        } else if (unitsCount >= 20 && unitsCount <= 49) {
            return "lots";
        } else if (unitsCount >= 50 && unitsCount <= 99) {
            return "horde";
        } else if (unitsCount >= 100 && unitsCount <= 249) {
            return "throng";
        } else if (unitsCount >= 250 && unitsCount <= 499) {
            return "swarm";
        } else if (unitsCount >= 500 && unitsCount <= 999) {
            return "zounds";
        } else if (unitsCount >= 1000) {
            return "legion";
        } else {
            return null;
        }
    }
}
