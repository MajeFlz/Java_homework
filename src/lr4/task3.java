package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n;

        try {
            n = in.nextInt();
            byte[] arr = new byte[n];
            System.out.println("Введите элементы массива (значения от -128 до 127):");

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                if (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
                    throw new IllegalArgumentException("Введенное значение выходит за пределы допустимого диапазона для типа byte.");
                }
                arr[i] = (byte) num;
            }

            int sum = 0;
            for (byte num : arr) {
                sum += num;
            }

            System.out.println("Сумма элементов массива: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: Введено некорректное значение. Ожидалось число.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        in.close();
    }
}


