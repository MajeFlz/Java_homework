package lr2;


import java.util.Scanner;

public class Example3 {

    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        char[] newArrayChar = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            if ((arrayChar[i] >= 'a' && arrayChar[i] <= 'z') || (arrayChar[i] >= 'A' && arrayChar[i] <= 'Z')) {
                newArrayChar[i] = (char) (arrayChar[i] + shift);
            } else {
                newArrayChar[i] = arrayChar[i];
            }
        }
        encryptString = new String(newArrayChar);

        return encryptString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int shift = in.nextInt();

        System.out.println(getEncryptString(text, shift));
    }
}