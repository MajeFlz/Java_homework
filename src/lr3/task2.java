package lr3;

import java.util.Scanner;
public class task2 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            int decimal = in.nextInt();
            if (decimal == 0) {
                System.out.println("Двоичное представление: 0");
            } else {
                System.out.println(STR."Двоичное представление: \{convertToBinary(decimal)}");
            }
        }

        public static String convertToBinary(int decimal) {
            if (decimal == 0) {
                return "";
            }
            return convertToBinary(decimal / 2) + (decimal % 2);
        }
    }
