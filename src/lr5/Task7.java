package lr5;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.length() > minLength) {
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }

    public static void main(String[] args) {
        String string = "Напишите функцию которая принимает на вход список строк и возвращает новый список содержащий только те строки которые имеют длину больше заданного значения";
        List<String> strings = List.of(string.split(" "));
        int minLength = 5;

        List<String> filteredStrings = filterStringsByLength(strings, minLength);
        System.out.println(filteredStrings);
    }
}