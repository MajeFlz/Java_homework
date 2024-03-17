package lr2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }

        Arrays.sort(nums);
        System.out.print("Проведена сортировка массива: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }
    }
}
