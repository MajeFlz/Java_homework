package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static List<String> filterStrings(List<String> strings, String substring) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.contains(substring)) {
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строки через пробел: ");
        String input = in.nextLine();
        List<String> strings = List.of(input.split(" "));

        System.out.print("Введите подстроку: ");
        String substring = in.nextLine();

        List<String> filteredStrings = filterStrings(strings, substring);
        System.out.println(filteredStrings);
    }
}