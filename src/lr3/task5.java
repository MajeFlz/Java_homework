package lr3;

import java.util.HashMap;
public class task5 {
        public static void main(String[] args) {

            HashMap<Integer, String> map = new HashMap<>();


            map.put(1, "apple");
            map.put(2, "banana");
            map.put(3, "orange");
            map.put(4, "grape");
            map.put(5, "kiwi");
            map.put(6, "pineapple");
            map.put(7, "strawberry");
            map.put(8, "watermelon");
            map.put(9, "melon");
            map.put(0, "peach");

            System.out.println("Строки с ключом больше 5:");
            for (Integer key : map.keySet()) {
                if (key > 5) {
                    System.out.println(STR."Ключ: \{key}, Значение: \{map.get(key)}");
                }
            }

            System.out.print("Строки с ключом 0: ");
            StringBuilder zeroKeyStrings = new StringBuilder();
            for (Integer key : map.keySet()) {
                if (key == 0) {
                    zeroKeyStrings.append(map.get(key)).append(", ");
                }
            }
            if (!zeroKeyStrings.isEmpty()) {
                zeroKeyStrings.delete(zeroKeyStrings.length() - 2, zeroKeyStrings.length());
                System.out.println(zeroKeyStrings);
            } else {
                System.out.println("Строки с ключом 0 отсутствуют");
            }

            int result = 1;
            for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().length() > 5) {
                    result *= entry.getKey();
                }
            }
            System.out.println(STR."Произведение ключей, где длина строки больше 5: \{result}");
        }
    }

