package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static List<Integer> filterNumbersGreaterThan(List<Integer> numbers, int minNumber) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num > minNumber) {
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

        int minNumber = 5;

        List<Integer> filteredNumbers = filterNumbersGreaterThan(numbers, minNumber);
        System.out.println(filteredNumbers);
    }
}
