package lr5;

import java.util.ArrayList;
import java.util.List;


public class Task9 {
    public static List<String> filterLettersOnly(List<String> strings) {
        List<String> lettersOnlyList = new ArrayList<>();

        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) {
                lettersOnlyList.add(str);
            }
        }

        return lettersOnlyList;
    }

    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("Hello");
        originalList.add("World123");
        originalList.add("Java");
        originalList.add("123Abc");
        originalList.add("ABC@#$");

        List<String> filteredList = filterLettersOnly(originalList);

        System.out.println(STR."До преобразования: \{originalList}");
        System.out.println(STR."После преобразования: \{filteredList}");
    }
}