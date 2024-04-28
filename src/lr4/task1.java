package lr4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Введите элементы массива через пробел: ");
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");
            int[] array = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                try {
                    array[i] = Integer.parseInt(numbers[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: некорректное число - \"" + numbers[i] + "\"");
                    return;
                }
            }

            boolean hasPositive = false;
            for (int num : array) {
                if (num > 0) {
                    hasPositive = true;
                    break;
                }
            }

            if (!hasPositive) {
                throw new IllegalArgumentException("Отсутствуют положительные элементы в массиве");
            }

            // Вычисление среднего значения положительных элементов
            int sum = 0;
            int count = 0;
            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }
            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: несоответствие числового типа данных");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
