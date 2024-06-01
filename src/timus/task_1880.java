package timus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task_1880 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> array = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            int n = in.nextInt();
            ArrayList<Integer> tempList = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                tempList.add(in.nextInt());
            }
            array.add(tempList);
        }

        ArrayList<Integer> common = new ArrayList<>(array.get(0));
        for (int i = 0; i < common.size(); i++) {
            if (!(Collections.binarySearch(array.get(1), common.get(i)) >= 0) ||
                    !(Collections.binarySearch(array.get(2), common.get(i)) >= 0)) {
                common.remove(i);
                i--;
            }
        }

        System.out.println(common.size());
    }
}
