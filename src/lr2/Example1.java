package lr2;

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

        // Поиск минимального значения без сортировки массива
        int minNum = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < minNum) {
                minNum = num;
            }
        }

        System.out.println("Минимальное значение: " + minNum);
        System.out.print("Индекс(ы) элемента(ов) с минимальным значением: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == minNum) {
                System.out.print(i + " ");
            }
        }
    }
}