package lr3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int sizeArr = in.nextInt();
        int[] array = new int[sizeArr];

        System.out.println("Введите элементы массива:");
        inputArray(array, 0, in);

        System.out.println("Массив:");
        printArray(array, 0);
    }

    private static void inputArray(int[] array, int index, Scanner in) {
        if (index < array.length) {
            System.out.print(STR."Введите элемент [\{index}]: ");
            array[index] = in.nextInt();
            inputArray(array, index + 1, in);
        }
    }

    private static void printArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(STR."\{array[index]} ");
            printArray(array, index + 1);
        }
    }
}
