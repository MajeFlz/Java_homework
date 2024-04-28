package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static List<Integer> filterNumbers(List<Integer> numbers, int divisor) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num % divisor == 0) {
                filteredNumbers.add(num);
            }
        }

        return filteredNumbers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");
        String input = in.nextLine();
        List<Integer> numbers = new ArrayList<>();
        for (String numStr : input.split(" ")) {
            numbers.add(Integer.parseInt(numStr.trim()));
        }

        System.out.print("Введите делитель: ");
        int divisor = in.nextInt();

        List<Integer> filteredNumbers = filterNumbers(numbers, divisor);
        System.out.println(filteredNumbers);
    }
}
